package xmlparser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.List;

public class Bedriftshelsetjeneste {
	
	@JsonProperty("Orgnr")
	private String orgnr;
	
	@JsonProperty("Navn")
	private String navn;
	
	@JsonProperty("Kontaktinformasjon")
	private Kontaktinformasjon kontaktinformasjon;
	
	@JacksonXmlElementWrapper(namespace="Avdeling")
	@JsonProperty("Avdelinger")
	private List<Avdeling> avdelinger;
	
	@JsonProperty("Godkjenningsstatus")
	private Godkjenningsstatus godkjenningsstatus;
	
	public List<Avdeling> getAvdelinger() {
		return avdelinger;
	}
	public void setAvdelinger(List<Avdeling> avdelinger) {
		this.avdelinger = avdelinger;
	}
	public String getOrgnr() {
		return orgnr;
	}
	public void setOrgnr(String orgnr) {
		this.orgnr = orgnr;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public Kontaktinformasjon getKontaktinformasjon() {
		return kontaktinformasjon;
	}
	public void setKontaktinformasjon(Kontaktinformasjon kontaktinformasjon) {
		this.kontaktinformasjon = kontaktinformasjon;
	}
	public Godkjenningsstatus getGodkjenningsstatus() {
		return godkjenningsstatus;
	}
	public void setGodkjenningsstatus(Godkjenningsstatus godkjenningsstatus) {
		this.godkjenningsstatus = godkjenningsstatus;
	}

}
