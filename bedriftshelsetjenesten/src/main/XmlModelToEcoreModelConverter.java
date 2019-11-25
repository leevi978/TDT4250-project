package main;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

import BedriftshelsetjenesteGodkjenningsregister.*;
import BedriftshelsetjenesteGodkjenningsregister.impl.*;
import BedriftshelsetjenesteGodkjenningsregister.util.*;

public abstract class XmlModelToEcoreModelConverter {
	private static BedriftshelsetjenestenFactory factory = BedriftshelsetjenestenFactoryImpl.init();
		
	public static UoD convertToEcore(xmlparser.BedriftshelsetjenesteGodkjenningsregister bg) {
		UoD uod = factory.createUoD();
		addAllKommunerAndFylker(bg,uod);
		addAllBedriftshelsetjenester(bg,uod);
		return uod;
	}
	
	private static void addAllBedriftshelsetjenester(xmlparser.BedriftshelsetjenesteGodkjenningsregister bg, UoD uod) {
		uod.getBedriftshelsetjeneste()
		.addAll(bg.getBedriftshelsetjeneste().stream()
				.map(b-> XmlModelToEcoreModelConverter.convertBedriftshelsetjeneste(b,uod))
				.collect(Collectors.toList()));
	}

	private static void addAllKommunerAndFylker(xmlparser.BedriftshelsetjenesteGodkjenningsregister bg, UoD uod) {
		List<xmlparser.Kommune> kommuneData = bg.getBedriftshelsetjeneste()
			.stream()
			.flatMap(b -> Stream.concat(
						Stream.of(b.getKontaktinformasjon()
									.getPostadresse()
									.getKommune()),
						Optional.ofNullable(b.getAvdelinger())
							.map(Collection::stream)
							.orElse(Stream.empty())
							.map(a -> a.getPostadresse().getKommune())
					)
				)
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
		
		List<Fylke> fylker = kommuneData.stream()
				.map(k -> k.getFylke())
				.distinct()
				.map(XmlModelToEcoreModelConverter::convertFylke)
				.collect(Collectors.toList());
		uod.getFylke().addAll(fylker);
		
		List<Kommune> kommuner = kommuneData.stream()
				.distinct()
				.map(k->{
					Kommune kommune = factory.createKommune();
					kommune.setKommunenavn(k.getKommunenavn());
					kommune.setKommunenr(k.getKommunenr());
					Fylke f = XmlModelToEcoreModelConverter.convertFylke(k.getFylke());
					kommune.setFylke(fylker.stream()
							.filter(f::equals)
							.findFirst()
							.orElse(f)
							);
					return kommune;
				})
				.collect(Collectors.toList());
		
		uod.getKommune().addAll(kommuner);
	}
	
	private static Bedriftshelsetjeneste convertBedriftshelsetjeneste(xmlparser.Bedriftshelsetjeneste bedriftshelsetjeneste, UoD uod) {
		Bedriftshelsetjeneste b = factory.createBedriftshelsetjeneste();
		b.setOrgnr(bedriftshelsetjeneste.getOrgnr());
		b.setNavn(bedriftshelsetjeneste.getNavn());
		b.setKontaktinformasjon(convertKontaktinformasjon(bedriftshelsetjeneste.getKontaktinformasjon(),uod));
		b.setGodkjenningsstatus(convertGodkjenningsstatus(bedriftshelsetjeneste.getGodkjenningsstatus(),uod));
		b.getAvdelinger().addAll(
				Optional.ofNullable(bedriftshelsetjeneste.getAvdelinger())
				.map(Collection::stream)
				.orElse(Stream.empty())
				.map(a->convertAvdeling(a,uod))
				.collect(Collectors.toList()));
		return b;
	}
	
	private static Avdeling convertAvdeling(xmlparser.Avdeling avdeling, UoD uod) {
		Avdeling a = factory.createAvdeling();
		a.setNavn(avdeling.getNavn());
		a.setAvdelingsleder(avdeling.getAvdelingsleder());
		a.setTelefon(avdeling.getTelefon());
		a.setPostadresse(convertPostadresse(avdeling.getPostadresse(),uod));
		return a;
	}
	
	private static Godkjenningsstatus convertGodkjenningsstatus(xmlparser.Godkjenningsstatus godkjenningsstatus, UoD uod) {
		Godkjenningsstatus g = factory.createGodkjenningsstatus();
		g.setSoeknadsdato(godkjenningsstatus.getSoknadsdato());
		g.setStatus(godkjenningsstatus.getStatus());
		return g;
	}
	
	private static Kontaktinformasjon convertKontaktinformasjon(xmlparser.Kontaktinformasjon kontaktinformasjon, UoD uod) {
		Kontaktinformasjon k = factory.createKontaktinformasjon();
		k.setTelefon(kontaktinformasjon.getTelefon());
		k.setInternettAdresse(kontaktinformasjon.getInternettAdresse());
		k.setEpostAdresse(kontaktinformasjon.getEpostAdresse());
		k.setPostadresse(convertPostadresse(kontaktinformasjon.getPostadresse(),uod));
		k.getKontaktperson().add(convertKontaktperson(kontaktinformasjon.getKontaktperson(),uod));
		return k;
	}
	
	private static Kontaktperson convertKontaktperson(xmlparser.Kontaktperson kontaktperson, UoD uod) {
		Kontaktperson k = factory.createKontaktperson();
		k.setNavn(kontaktperson.getNavn());
		k.setRolle(kontaktperson.getRolle());
		k.setTelefonDir(kontaktperson.getTelefonDir());
		k.setTelefonMob(kontaktperson.getTelefonMob());
		k.setEpostadresse(kontaktperson.getEpostadresse());
		return k;
	}
	
	private static Postadresse convertPostadresse(xmlparser.Postadresse postadresse, UoD uod) {
		Postadresse p = factory.createPostadresse();
		p.setAdresse(postadresse.getAdresse());
		p.setPostnr(postadresse.getPostnr());
		p.setPoststed(postadresse.getPoststed());
		if(postadresse.getKommune() != null) {
			p.setKommune(uod.getKommune().stream()
					.filter(
							k->postadresse.getKommune()
								.dataEquals(
									k.getKommunenavn(),
									k.getKommunenr(), 
									k.getFylke().getFylkenavn(), 
									k.getFylke().getFylkenr()
									)
							)
					.findFirst()
					.orElse(null));
		}
		return p;
	}
	
	private static Fylke convertFylke(xmlparser.Fylke fylke) {
		Fylke f = factory.createFylke();
		f.setFylkenavn(fylke.getFylkenavn());
		f.setFylkenr(fylke.getFylkenr());
		return f;
	}
}
