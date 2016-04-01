package mop.emf.ecore;

import mop.emf.core.EMOP;
import mop.emf.core.api.EMOPCreate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public aspect ExtendInstantiation {
	
	pointcut instantiateEObject(BasicEObjectImpl o) :
		execution ( BasicEObjectImpl.new() ) 
		&& !within(org.eclipse.emf.ecore.EPackage) && target(o);
	
		//	&& target(o);
		// && within(BasicEObjectImpl) && target(o);
		//&& !within(org.eclipse.emf.ecore..*) && target(o);
	
//	void around(BasicEObjectImpl o) : instantiateEObject(o) {
//		proceed(o); 	

	after(BasicEObjectImpl o) : instantiateEObject(o) {
		// Dynamic objects have Eclass == null
		if ( ! EMOP.isInitialized || o.eClass() == null ) { 
			return;
		}
		EMOPCreate.notifyCreation(o);
	}
	
	pointcut instantiateEObject_dynamic(DynamicEObjectImpl o) :
		execution ( DynamicEObjectImpl.new(EClass) ) 
		&& !within(org.eclipse.emf.ecore.EPackage) && target(o);
	
	
	after(BasicEObjectImpl o) : instantiateEObject_dynamic(o) {
		if ( ! EMOP.isInitialized ) { 
			return;
		}
		EMOPCreate.notifyCreation(o);
	}

	
	
}
