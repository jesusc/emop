package mop.emf.atl;

import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;

public aspect InstantiateTracer {

	pointcut newObject() : execution(Object ExecEnv.newElement(..));
	
	Object around()	: newObject() {
		Object ret = proceed();
		
		System.out.println("ATL Instantiate " + ret);
		// get here the MOP from the ExecEnv, which has been injected somehow...
		
		return ret;
	}
}
