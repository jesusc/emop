package mop.emf.tests;

import java.io.IOException;

import mop.emf.core.EMOP;
import mop.emf.core.EMOPGlobal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
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

public class TestResource {

//	@Test
//	public void test() {

	public static void main(String[] args) throws IOException {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put
		("*", new XMIResourceFactoryImpl());
		
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/simpleUML.xmi"));
		
		
		// The first thing is to determine the scope of the MOP
		// i.e., the spatial control
		//			=> Global
		//			=> Resource
		//			=> Object
		EMOP mop = EMOP.resource(model);

		mop.onSet(SimpleUMLPackage.Literals.NAMED_ELEMENT__NAME).
			// scope forClass(), forObject, etc. could be added
			before((o) -> {
				System.out.println("This was the previous value: " + o);
			});
				
		Class person = SimpleUMLFactory.eINSTANCE.createClass();
		model.getContents().add(person);
			      
		person.setName("Person");

		model.save(null);
	}

}
