package mop.emf.tests;

import java.io.IOException;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.libraries.autoinst.AutoInstLibrary;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TestAuto extends TestUtils {

	public static void main(String[] args) throws IOException {
		
		// The mop can configured manually or via a library
		// testManualMOP();
		testLibraryMOP();
		
		// Common part
		EMOP.activate();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/expressions/expressions.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/newModel.xmi"));
		
		System.out.println("Saving model with " + model.getContents().size() + " root elements");
		model.save(null);
	}

	private static void testLibraryMOP() {
		Libraries.install(new AutoInstLibrary());
	}

	private static void testManualMOP() {
		EMOP mop = EMOP.global();
				
		// In EMF there is no relationship between a loaded model and its
		// meta-model.
		// Two options: 
		//  1. Assuming the resource will be in a resource set in which the meta-model
		//     is previously loaded
		// 
		//  2. That the model URI will have an extension (e.g., as in Xtext resources)
		//
		// Using #1
		mop.onModelCreate("http://emop/example/expressions").after((rs, p, r) -> {
			// The meta-model is automatically given
			EClass tvc = (EClass) p.getEClassifier("TrueValue");
			EClass fvc = (EClass) p.getEClassifier("FalseValue");
			
			EObject tv = EcoreUtil.create(tvc);
			EObject fv = EcoreUtil.create(fvc);
			
			r.getContents().add(tv);
			r.getContents().add(fv);	
		});
	
	}

}
