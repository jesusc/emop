package mop.emf.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.ecore.MyBasicDiagnostic;
import mop.emf.libraries.autoinst.AutoInstLibrary;
import mop.emf.libraries.resourcetype.ResourceType;
import mop.emf.libraries.typeobject.TypeObjectLibrary;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import SimpleUML.Class;
import SimpleUML.Feature;
import SimpleUML.Package;
import SimpleUML.SimpleUMLFactory;

public class TestValidation extends TestUtils {

	public static void main(String[] args) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/simpleUML.xmi"));	
		
		EMOP mop = EMOP.global();
		mop.onValidate().after((obj, chain) -> {
			if ( obj instanceof Feature ) {
				ArrayList<Diagnostic> toBeRemoved = new ArrayList<>();
				
				BasicDiagnostic bd = ((BasicDiagnostic) chain);
				for (Diagnostic diagnostic : bd.getChildren()) {
					// TODO: Provide a wrapper to select the diagnostics of this specific
					// object
					if ( diagnostic.getData().size() > 0 && diagnostic.getData().get(0) == obj ) {
						EObject guiltyElement = (EObject) diagnostic.getData().get(1);
						if ( guiltyElement instanceof EReference && ((EReference) guiltyElement).getName().equals("type") ) { 
							// remove the error
							toBeRemoved.add(diagnostic);
						}
					}
				}
				
				try {
					for (Diagnostic diagnostic : toBeRemoved) {
						((MyBasicDiagnostic) chain).remove(diagnostic);
						// m.invoke(bd, diagnostic);
					}

					// The invocation has to be done reflectively because the weaving is
					// done at load time (not at compile time).
					/*Method m = bd.getClass().getMethod("removeDiagnostic", Diagnostic.class);
					for (Diagnostic diagnostic : toBeRemoved) {
						// m.invoke(bd, diagnostic);
					}
					*/
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Package pkg = SimpleUMLFactory.eINSTANCE.createPackage();
		
		
		Class person = SimpleUMLFactory.eINSTANCE.createClass();
		model.getContents().add(person);	      
		person.setName("Person");

		System.out.println(person.eClass().getEAnnotations());
		
		Feature f = SimpleUMLFactory.eINSTANCE.createFeature();
		f.setName("name");
		// The type of the feature is compulsory, but I am not setting it
		person.getFeatures().add(f);
		
		// This is to avoid the validation error on missing package
		person.setPkg(pkg);
		
		
		// onValidateObject 
		//    => I would like to skip the validation at certain times... (temporal control)
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(person);
		
		System.out.println("Result: " + diagnostic);
//		List<Diagnostic> children = diagnostic.getChildren();
//		for (Diagnostic diagnostic2 : children) {
//			System.out.println("Children: " + diagnostic2);
//		}
		
		// Print the resource contents
		System.out.println("Resource contents");		
		model.getAllContents().forEachRemaining(o -> System.out.println(o));
		model.save(null);

	}	
}
