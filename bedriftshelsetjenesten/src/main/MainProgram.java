package main;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
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


public class MainProgram {
	public static void main(String[] args) throws Exception {
		List<Bedriftshelsetjeneste> bed = (args.length > 0 ? getDepartment(args[0]) : getSampleDepartment());
		System.out.println(bed);
	}

	public static List<Bedriftshelsetjeneste> getDepartment(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(BedriftshelsetjenestenPackage.eNS_URI, BedriftshelsetjenestenPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new BedriftshelsetjenestenResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		List<Bedriftshelsetjeneste> list = new ArrayList<Bedriftshelsetjeneste>();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Bedriftshelsetjeneste) {
				list.add((Bedriftshelsetjeneste) eObject);
			}
		}
		return list;
	}

	public static List<Bedriftshelsetjeneste> getSampleDepartment() {
		try {
			return getDepartment(MainProgram.class.getResource("bht.xml").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}
}
