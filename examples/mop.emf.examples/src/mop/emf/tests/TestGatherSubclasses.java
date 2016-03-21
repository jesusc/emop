package mop.emf.tests;

import java.io.IOException;

import javax.swing.plaf.multi.MultiOptionPaneUI;

import mop.emf.core.EMOP;
import mop.emf.core.EMOPGlobal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
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

public class TestGatherSubclasses {

//	@Test
//	public void test() {

	public static void main(String[] args) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		EMOP.activate();
		
		
		// I need a resource or a root object => EPackage in this case
		
		EMOP.global().
			onSet(EcorePackage.Literals.ECLASS__ESUPER_TYPES).
			before(o -> {
				System.out.println(o);
			});
		
		// An alternative is onInstantiate EClass, add the onSet hook for objects
		
		ResourceSet rs = new ResourceSetImpl();
		rs.eAdapters().add(new Adapter() {

			@Override
			public void notifyChanged(Notification notification) {
				System.out.println(notification);
				if ( notification.getNewValue() instanceof Resource ) {
					Resource r = (Resource) notification.getNewValue();
					r.eAdapters().add(new EContentAdapter() {
						public void notifyChanged(Notification notification) {
							super.notifyChanged(notification);
							System.out.println(notification);
						};
					});
				}
			}

			@Override
			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return true;
			}
			
		});
		Resource metamodel = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		// Resource model     = rs.createResource(URI.createFileURI("tmp_/simpleUML.xmi"));
	}

}
