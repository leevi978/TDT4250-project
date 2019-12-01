package main;

import bedriftshelsetjenesten.*;
import xmlparser.BedriftshelsetjenesteGodkjenningsregister;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class MainProgram {
	public static void main(String[] args) throws Exception {
		XmlMapper xmlMapper = new XmlMapper();
		BedriftshelsetjenesteGodkjenningsregister b = xmlMapper.readValue(MainProgram.class.getResource("bht.xml"),BedriftshelsetjenesteGodkjenningsregister.class);
		b.getBedriftshelsetjeneste();
		UoD uod = XmlModelToEcoreModelConverter.convertToEcore(b);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("bht", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI
			.createURI("../org.example.bedriftshelsetjenesten.sample/My.bht"));

		XMLResource xmlr = (XMLResource)resource;
		xmlr.setEncoding("utf-8");
		xmlr.getContents().add(uod);
		xmlr.save(Collections.EMPTY_MAP);
		System.out.println("File 'org.example.bedriftshelsetjenesten.sample/My.bht' created/updated");
	}
	
	
}
