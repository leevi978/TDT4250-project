package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fylke {
	
	@JsonProperty("Fylkenr")
	private int Fylkenr;
	
	@JsonProperty("Fylkenavn")
	private String fylkenavn;

	public int getFylkenr() {
		return Fylkenr;
	}

	public void setFylkenr(int fylkenr) {
		Fylkenr = fylkenr;
	}

	public String getFylkenavn() {
		return fylkenavn;
	}

	public void setFylkenavn(String fylkenavn) {
		this.fylkenavn = fylkenavn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Fylkenr;
		result = prime * result + ((fylkenavn == null) ? 0 : fylkenavn.hashCode());
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
		Fylke other = (Fylke) obj;
		if (Fylkenr != other.Fylkenr)
			return false;
		if (fylkenavn == null) {
			if (other.fylkenavn != null)
				return false;
		} else if (!fylkenavn.equals(other.fylkenavn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fylke [Fylkenr=" + Fylkenr + ", fylkenavn=" + fylkenavn + "]";
	}
	
	

}
