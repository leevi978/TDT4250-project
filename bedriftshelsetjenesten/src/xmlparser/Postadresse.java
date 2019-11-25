package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Postadresse {
	
	@JsonProperty("Adresse")
	private String adresse;
	
	@JsonProperty("Postnr")
	private String postnr;
	
	@JsonProperty("Poststed")
	private String poststed;
	
	@JsonProperty("Kommune")
	private Kommune kommune;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPostnr() {
		return postnr;
	}

	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}

	public String getPoststed() {
		return poststed;
	}

	public void setPoststed(String poststed) {
		this.poststed = poststed;
	}

	public Kommune getKommune() {
		return kommune;
	}

	public void setKommune(Kommune kommune) {
		this.kommune = kommune;
	}
	
	

}
