package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kontaktinformasjon {
	
	@JsonProperty("Telefon")
	private String telefon;
	
	@JsonProperty("EpostAdresse")
	private String epostAdresse;
	
	@JsonProperty("InternettAdresse")
	private String internettAdresse;
	
	@JsonProperty("Postadresse")
	private Postadresse postadresse;
	
	@JsonProperty("Kontaktperson")
	private Kontaktperson kontaktperson;

	public Kontaktperson getKontaktperson() {
		return kontaktperson;
	}

	public void setKontaktperson(Kontaktperson kontaktperson) {
		this.kontaktperson = kontaktperson;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEpostAdresse() {
		return epostAdresse;
	}

	public void setEpostAdresse(String epostAdresse) {
		this.epostAdresse = epostAdresse;
	}

	public String getInternettAdresse() {
		return internettAdresse;
	}

	public void setInternettAdresse(String internettAdresse) {
		this.internettAdresse = internettAdresse;
	}

	public Postadresse getPostadresse() {
		return postadresse;
	}

	public void setPostadresse(Postadresse postadresse) {
		this.postadresse = postadresse;
	}

}
