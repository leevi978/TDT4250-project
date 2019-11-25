package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kommune {
	
	@JsonProperty("Kommunenr")
	private int kommunenr;
	
	@JsonProperty("Kommunenavn")
	private String kommunenavn;
	
	@JsonProperty("Fylke")
	private Fylke fylke;

	public int getKommunenr() {
		return kommunenr;
	}

	public void setKommunenr(int kommunenr) {
		this.kommunenr = kommunenr;
	}

	public String getKommunenavn() {
		return kommunenavn;
	}

	public void setKommunenavn(String kommunenavn) {
		this.kommunenavn = kommunenavn;
	}

	public Fylke getFylke() {
		return fylke;
	}

	public void setFylke(Fylke fylke) {
		this.fylke = fylke;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fylke == null) ? 0 : fylke.hashCode());
		result = prime * result + ((kommunenavn == null) ? 0 : kommunenavn.hashCode());
		result = prime * result + kommunenr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kommune other = (Kommune) obj;
		if (fylke == null) {
			if (other.fylke != null)
				return false;
		} else if (!fylke.equals(other.fylke))
			return false;
		if (kommunenavn == null) {
			if (other.kommunenavn != null)
				return false;
		} else if (!kommunenavn.equals(other.kommunenavn))
			return false;
		if (kommunenr != other.kommunenr)
			return false;
		return true;
	}
	
	public boolean dataEquals(String kommunenavn, int kommunenr, String fylkenavn, int fylkenr) {
		return this.kommunenavn.equals(kommunenavn) 
				&& this.kommunenr == kommunenr
				&& this.fylke.getFylkenavn().equals(fylkenavn) 
				&& this.fylke.getFylkenr() == fylkenr;
	}

	@Override
	public String toString() {
		return "Kommune [kommunenr=" + kommunenr + ", kommunenavn=" + kommunenavn + ", fylke=" + fylke + "]";
	}
	
	

}
