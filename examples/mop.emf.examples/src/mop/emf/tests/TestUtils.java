package mop.emf.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TestUtils {
	static {
		init();
	}
	
	public static void init() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
	}
	
	protected static EObject createObject(Resource metamodel, String eclass) {
		EClass c = findClass(metamodel, eclass);
		return EcoreUtil.create(c);
	}

	protected static Object getField(EObject receptor, String fname) {
		EStructuralFeature f = receptor.eClass().getEStructuralFeature(fname);
		if ( f == null )
			throw new IllegalStateException("No feature " + fname);
		return receptor.eGet(f);
	}

	@SuppressWarnings("unchecked")
	protected static void setField(EObject receptor, String fname, Object value) {
		EStructuralFeature f = receptor.eClass().getEStructuralFeature(fname);
		if ( f == null )
			throw new IllegalStateException("No feature " + fname);
		
		if ( f.isMany() ) {
			((EList<Object>) receptor.eGet(f)).add(value);
		} else {
			receptor.eSet(f, value);
		}			
	}
	
	protected static void setField(EObject receptor, String fname, Object... values) {
		for (Object object : values) {
			setField(receptor, fname, object);
		}
	}
	
	protected static EClass findClass(Resource metamodel, String eclass) {
		TreeIterator<EObject> it = metamodel.getAllContents();
		while ( it.hasNext() ) {
			EObject o = it.next();
			if ( o instanceof EClass && eclass.equals(((EClass) o).getName()) ) {
				return (EClass) o;
			}
		}
		throw new IllegalStateException("Not found " + eclass);
	}

}
