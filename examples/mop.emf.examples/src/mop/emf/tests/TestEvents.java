package mop.emf.tests;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SimpleUML.Class;
import SimpleUML.Feature;
import SimpleUML.util.SimpleUMLAdapterFactory;

public class TestEvents {

//	@Test
//	public void test() {

	public static void main(String[] args) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put
		("*", new XMIResourceFactoryImpl());
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI("examples/SimpleUML.ecore"), true);
		
		EPackage pkg = (EPackage) r.getContents().get(0);
		
		EContentAdapter contentAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				System.out.println(notification.getEventType());
				System.out.println(notification.getNotifier());
				System.out.println(notification.getFeature());
				System.out.println("New value: " + notification.getNewValue());
//				contentAdapter.setTarget((Notifier) notification.getNotifier());
			}
		};
		
		
		r.eAdapters().add(contentAdapter);
		
		Class person = SimpleUML.SimpleUMLFactory.eINSTANCE.createClass();
		r.getContents().add(person);
		
		Feature fname = SimpleUML.SimpleUMLFactory.eINSTANCE.createFeature();
		fname.setName("name");
		person.getFeatures().add(fname);
		
//	    Adapter adapter = new AdapterImpl() {
//	        public void notifyChanged(Notification notification) {
//	          System.out.println( notification.getNotifier() );
//	          System.out.println( ((NamedElement) notification).getName() );
//	        	System.out
//	              .println("Notfication received from the data model. Data model has changed!!!");
//	        }
//	      };
//		person.eAdapters().add(adapter);
	      
		person.setName("Person");
	}

}
