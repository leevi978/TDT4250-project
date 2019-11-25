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
		uod.getBedriftshelsetjeneste().addAll(bg.getBedriftshelsetjeneste().stream().map(XmlModelToEcoreModelConverter::convertBedriftshelsetjeneste).collect(Collectors.toList()));
	}

	private static void addAllKommunerAndFylker(xmlparser.BedriftshelsetjenesteGodkjenningsregister bg, UoD uod) {
		List<xmlparser.Kommune> kommuneData = bg.getBedriftshelsetjeneste()
			.stream()
			.flatMap(b -> Stream.concat(
						Stream.of(b.getKontaktinformasjon().getPostadresse().getKommune()),
						Optional.ofNullable(b.getAvdelinger()).map(Collection::stream).orElse(Stream.empty()).map(a -> a.getPostadresse().getKommune())
					)
				)
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
		
		List<Fylke> fylker = kommuneData.stream().map(k -> k.getFylke()).distinct().map(XmlModelToEcoreModelConverter::convertFylke).collect(Collectors.toList());
		uod.getFylke().addAll(fylker);
		
		List<Kommune> kommuner = kommuneData.stream().distinct().map(XmlModelToEcoreModelConverter::convertKommune).collect(Collectors.toList());
		uod.getKommune().addAll(kommuner);
	}
	
	private static Bedriftshelsetjeneste convertBedriftshelsetjeneste(xmlparser.Bedriftshelsetjeneste bedriftshelsetjeneste) {
		Bedriftshelsetjeneste b = factory.createBedriftshelsetjeneste();
		b.setOrgnr(bedriftshelsetjeneste.getOrgnr());
		b.setNavn(bedriftshelsetjeneste.getNavn());
		b.setKontaktinformasjon(convertKontaktinformasjon(bedriftshelsetjeneste.getKontaktinformasjon()));
		b.setGodkjenningsstatus(convertGodkjenningsstatus(bedriftshelsetjeneste.getGodkjenningsstatus()));
		b.getAvdelinger().addAll(Optional.ofNullable(bedriftshelsetjeneste.getAvdelinger()).map(Collection::stream).orElse(Stream.empty()).map(XmlModelToEcoreModelConverter::convertAvdeling).collect(Collectors.toList()));
		
		
		return b;
	}
	
	private static Avdeling convertAvdeling(xmlparser.Avdeling avdeling) {
		Avdeling a = factory.createAvdeling();
		a.setNavn(avdeling.getNavn());
		a.setAvdelingsleder(avdeling.getAvdelingsleder());
		a.setTelefon(avdeling.getTelefon());
		a.setPostadresse(convertPostadresse(avdeling.getPostadresse()));
		return a;
	}
	
	private static Godkjenningsstatus convertGodkjenningsstatus(xmlparser.Godkjenningsstatus godkjenningsstatus) {
		Godkjenningsstatus g = factory.createGodkjenningsstatus();
		g.setSoeknadsdato(godkjenningsstatus.getSoknadsdato());
		g.setStatus(godkjenningsstatus.getStatus());
		return g;
	}
	
	private static Kontaktinformasjon convertKontaktinformasjon(xmlparser.Kontaktinformasjon kontaktinformasjon) {
		Kontaktinformasjon k = factory.createKontaktinformasjon();
		k.setTelefon(kontaktinformasjon.getTelefon());
		k.setInternettAdresse(kontaktinformasjon.getInternettAdresse());
		k.setEpostAdresse(kontaktinformasjon.getEpostAdresse());
		k.setPostadresse(convertPostadresse(kontaktinformasjon.getPostadresse()));
		k.getKontaktperson().add(convertKontaktperson(kontaktinformasjon.getKontaktperson()));
		return k;
	}
	
	private static Kontaktperson convertKontaktperson(xmlparser.Kontaktperson kontaktperson) {
		Kontaktperson k = factory.createKontaktperson();
		k.setNavn(kontaktperson.getNavn());
		k.setRolle(kontaktperson.getRolle());
		k.setTelefonDir(kontaktperson.getTelefonDir());
		k.setTelefonMob(kontaktperson.getTelefonMob());
		k.setEpostadresse(kontaktperson.getEpostadresse());
		return k;
	}
	
	private static Postadresse convertPostadresse(xmlparser.Postadresse postadresse) {
		Postadresse p = factory.createPostadresse();
		p.setAdresse(postadresse.getAdresse());
		p.setPostnr(postadresse.getPostnr());
		p.setPoststed(postadresse.getPoststed());
		return p;
	}
	
	private static Kommune convertKommune(xmlparser.Kommune kommune) {
		Kommune k = factory.createKommune();
		k.setKommunenavn(kommune.getKommunenavn());
		k.setKommunenr(kommune.getKommunenr());
		k.setFylke(convertFylke(kommune.getFylke()));
		return k;
	}
	
	private static Fylke convertFylke(xmlparser.Fylke fylke) {
		Fylke f = factory.createFylke();
		f.setFylkenavn(fylke.getFylkenavn());
		f.setFylkenr(fylke.getFylkenr());
		return f;
	}
}
