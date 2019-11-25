package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kontaktperson {
	
	@JsonProperty("Navn")
	private String navn;
	
	@JsonProperty("Rolle")
	private String rolle;
	
	@JsonProperty("TelefonDir")
	private String telefonDir;
	
	@JsonProperty("TelefonMob")
	private String telefonMob;
	
	@JsonProperty("Epostadresse")
	private String epostadresse;

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	public String getTelefonDir() {
		return telefonDir;
	}

	public void setTelefonDir(String telefonDir) {
		this.telefonDir = telefonDir;
	}

	public String getTelefonMob() {
		return telefonMob;
	}

	public void setTelefonMob(String telefonMob) {
		this.telefonMob = telefonMob;
	}

	public String getEpostadresse() {
		return epostadresse;
	}

	public void setEpostadresse(String epostadresse) {
		this.epostadresse = epostadresse;
	}
	
	

}
