package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avdeling {
	
	@JsonProperty("Navn")
	private String navn;
	
	@JsonProperty("Avdelingsleder")
	private String avdelingsleder;
	
	@JsonProperty("Telefon")
	private String telefon;
	
	@JsonProperty("Postadresse")
	private Postadresse postadresse;

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getAvdelingsleder() {
		return avdelingsleder;
	}

	public void setAvdelingsleder(String avdelingsleder) {
		this.avdelingsleder = avdelingsleder;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Postadresse getPostadresse() {
		return postadresse;
	}

	public void setPostadresse(Postadresse postadresse) {
		this.postadresse = postadresse;
	}

}
