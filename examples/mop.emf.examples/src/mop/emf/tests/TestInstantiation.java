package mop.emf.tests;

import java.io.IOException;

import javax.swing.plaf.multi.MultiOptionPaneUI;

import mop.emf.core.EMOP;
import mop.emf.core.EMOPGlobal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import SimpleUML.Class;
import SimpleUML.Feature;
import SimpleUML.NamedElement;
import SimpleUML.SimpleUMLFactory;
import SimpleUML.SimpleUMLPackage;

public class TestInstantiation {

//	@Test
//	public void test() {

	public static void main(String[] args) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/simpleUML.xmi"));
		
		// Accessing EcorePackage poses problems for EMOF since the meta-level is not ready yet		
		System.out.println(EcorePackage.eINSTANCE);
		
	
		// The first thing is to determine the scope of the MOP
		// i.e., the spatial control
		//			=> Global
		//			=> Resource
		//			=> Object
		EMOPGlobal mop = (EMOPGlobal) EMOP.global();
		mop.activate();
		
		// In EMF there is no link between the model and the meta-model.
		// How can we create an onLoad/onModelCreate hook?
		//    => We have to rely on URI / file extensions.
		
		// onDelete
		// onChangeParent???
		
		
		// Dynamically implement EOperations e.g., so that they can be invoked?
		// 		=> Generate MOP...
		// hacer disponibles las subclasses ==> modificación del meta-metamodelo
		
		// EcoreMop => facilities specific of Ecore, which could be implemented more
		// 			   generically using the regular MOP
				
		
		mop.onSet(SimpleUMLPackage.Literals.NAMED_ELEMENT__NAME).
			// scope forClass(), forObject, etc. could be added
			before((o) -> {
				System.out.println("This was the previous value: " + o);
			});
		
		// For every class I am going to add an id attribute
		mop.onInstantiate(SimpleUMLPackage.Literals.CLASS, (aClass) -> {
			System.out.println("Instantiated: " + aClass.eClass());
			Feature feat = SimpleUMLFactory.eINSTANCE.createFeature();
			feat.setName("id");
						
			((Class) aClass).getFeatures().add(feat);
			// I have to add the type somehow... 
		});
		
		
		
		EPackage pkg = (EPackage) metamodel.getContents().get(0);
		
		Class person = SimpleUMLFactory.eINSTANCE.createClass();
		model.getContents().add(person);
			      
		person.setName("Person");


		// onValidateObject 
		//    => I would like to skip the validation at certain times... (temporal control)
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(person);
		System.out.println(diagnostic);

		
		
		// Print the resource contents
		System.out.println("Resource contents");		
		model.getAllContents().forEachRemaining(o -> System.out.println(o));

		model.save(null);
	}

}
