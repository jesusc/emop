package mop.emf.tests;

import java.io.IOException;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.libraries.autoinst.AutoInstLibrary;
import mop.emf.libraries.resourcetype.ResourceType;
import mop.emf.libraries.typeobject.TypeObjectLibrary;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TestTypeObject extends TestUtils {

	public static void main(String[] args) throws IOException {
		
		Libraries.install(new ResourceType());
		Libraries.install(new TypeObjectLibrary());

		// Common part
		EMOP.activate();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/products/products.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/books.xmi"));
		
		EObject book = createObject(metamodel, "ProductType");
		setField(book, "name", "Book");
		model.getContents().add(book);
		
		
		System.out.println("Saving model with " + model.getContents().size() + " root elements");
		model.save(null);
	}


	
}
