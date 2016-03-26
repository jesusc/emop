package mop.emf.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.swing.plaf.multi.MultiOptionPaneUI;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.core.EMOPGlobal;
import mop.emf.libraries.esubtypes.ESubTypes;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Test;

import SimpleUML.Class;
import SimpleUML.Feature;
import SimpleUML.NamedElement;
import SimpleUML.SimpleUMLFactory;
import SimpleUML.SimpleUMLPackage;

public class TestGatherSubclasses {

//	@Test
//	public void test() {

	public static void main(String[] args) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		
		Libraries.install(new ESubTypes());
		EMOP.activate();
		
		
		// I need a resource or a root object => EPackage in this case
		
//		EMOP.global().
//			onSet(EcorePackage.Literals.ECLASS__ESUPER_TYPES).
//			before(o -> {
//				System.out.println("ESUPERTYPES: " + o);
//			});
		
		// An alternative is onInstantiate EClass, add the onSet hook for objects
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource metamodel = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		// Resource model     = rs.createResource(URI.createFileURI("tmp_/simpleUML.xmi"));
	
		EClass ne = (EClass) metamodel.getEObject("//NamedElement");
		EClass cl = (EClass) metamodel.getEObject("//Class");
		EClass fe = (EClass) metamodel.getEObject("//Feature");
		
		Assert.assertNotNull(ne);
		Assert.assertEquals(2, ESubTypes.get(ne).size());
		Assert.assertTrue(ESubTypes.get(ne).contains(cl));
		Assert.assertTrue(ESubTypes.get(ne).contains(fe));		
		
		// Test the invocation delegate
//		try {
//			ne.eInvoke(ESubTypes.getESubclassesOp(), null);
//		} catch (InvocationTargetException e) {
//			Assert.fail();
//		}
		
	}

}
