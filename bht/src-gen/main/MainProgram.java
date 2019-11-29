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
		System.out.println(b.getBedriftshelsetjeneste().get(0).getNavn());
		UoD uod = XmlModelToEcoreModelConverter.convertToEcore(b);
		uod.getFylker();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("bht", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();


        // create a resource
        Resource resource = resSet.createResource(URI
                .createURI("../org.example.bedriftshelsetjenesten.sample/My.bht"));
        
        XMLResource xmlr = (XMLResource)resource;
        xmlr.setEncoding("utf-8");
        
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        xmlr.getContents().add(uod);

        // now save the content.
        xmlr.save(Collections.EMPTY_MAP);
        
	}
	
	
}
