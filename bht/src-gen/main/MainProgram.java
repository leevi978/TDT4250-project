package main;

import bedriftshelsetjenesten.*;
import xmlparser.BedriftshelsetjenesteGodkjenningsregister;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class MainProgram {
	public static void main(String[] args) throws Exception {
		XmlMapper xmlMapper = new XmlMapper();
		BedriftshelsetjenesteGodkjenningsregister b = xmlMapper.readValue(MainProgram.class.getResource("bht.xml"),BedriftshelsetjenesteGodkjenningsregister.class);
		b.getBedriftshelsetjeneste();
		System.out.println(b.getBedriftshelsetjeneste().get(0).getNavn());
		UoD uod = XmlModelToEcoreModelConverter.convertToEcore(b);
		uod.getFylker();
	}
	
	
}
