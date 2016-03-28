package mop.emf.libraries.proto;

import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This library provides facilities to implement prototype
 * based modelling.
 * 
 * @author jesus
 *
 */
public class Prototypes extends GlobalLibrary {


	@Override
	public void process(EMOP mop) {
		// Do nothing for the moment
	}
	
	@SuppressWarnings("unchecked")
	public static<T extends EObject> T clone(T obj) {
		EObject newObj = EcoreUtil.create(obj.eClass());
		
		return  (T) newObj;
	}

	
}
