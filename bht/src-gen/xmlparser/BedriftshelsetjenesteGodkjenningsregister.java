package xmlparser;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import com.fasterxml.jackson.annotation.*;


public class BedriftshelsetjenesteGodkjenningsregister {
	
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("Bedriftshelsetjeneste")
	List<Bedriftshelsetjeneste> bedriftshelsetjeneste = new ArrayList<>();

	public List<Bedriftshelsetjeneste> getBedriftshelsetjeneste() {
		return bedriftshelsetjeneste;
	}

	public void setBedriftshelsetjeneste(List<Bedriftshelsetjeneste> bedriftshelsetjeneste) {
		this.bedriftshelsetjeneste = bedriftshelsetjeneste;
	}
}
