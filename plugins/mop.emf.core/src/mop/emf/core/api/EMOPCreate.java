package mop.emf.core.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import mop.emf.core.EMOP;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class EMOPCreate {
	
	public static HashMap<EClass, List<Consumer<EObject>>> callbacks = new HashMap<EClass, List<Consumer<EObject>>>();
	
	public EMOPCreate(EClass c, Consumer<EObject> callback) {
		callbacks.computeIfAbsent(c, (c1) -> new ArrayList<Consumer<EObject>>());
		callbacks.get(c).add(callback);
	}

	// when, with methods before, after, around
	
	// Not clear yet
	
	public static void notifyCreation(EObject o) {
		if ( ! EMOP.ctx().isActivated() )
			return;
	
		if ( o.eClass() != null && o.eClass().getName() != null && o.eClass().getName().equals("Module")) {
			
			System.out.println(o);
		}
		if ( callbacks.containsKey(o.eClass())) {
			callbacks.get(o.eClass()).forEach(c -> c.accept(o));
		}
	}

}
