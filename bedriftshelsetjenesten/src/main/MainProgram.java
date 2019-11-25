package main;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import BedriftshelsetjenesteGodkjenningsregister.*;
import BedriftshelsetjenesteGodkjenningsregister.impl.*;
import BedriftshelsetjenesteGodkjenningsregister.util.*;
import xmlparser.BedriftshelsetjenesteGodkjenningsregister;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class MainProgram {
	public static void main(String[] args) throws Exception {
		XmlMapper xmlMapper = new XmlMapper();
		BedriftshelsetjenesteGodkjenningsregister b = xmlMapper.readValue(MainProgram.class.getResource("bht.xml"),BedriftshelsetjenesteGodkjenningsregister.class);
		b.getBedriftshelsetjeneste();
		System.out.println(b.getBedriftshelsetjeneste().get(0).getNavn());
		UoD uod = XmlModelToEcoreModelConverter.convertToEcore(b);
		uod.getFylke();
		//System.out.println(uod);
		
	}
	
	
}
