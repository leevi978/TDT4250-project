package xmlparser;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Godkjenningsstatus {

	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("Søknadsdato")
	private Date soknadsdato;

	@Override
	public String toString() {
		return "Godkjenningsstatus [status=" + status + ", soknadsdato=" + soknadsdato + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSoknadsdato() {
		return soknadsdato;
	}

	public void setSoknadsdato(Date soknadsdato) {
		this.soknadsdato = soknadsdato;
	}
}
