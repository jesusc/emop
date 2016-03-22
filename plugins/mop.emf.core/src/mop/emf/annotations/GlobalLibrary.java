package mop.emf.annotations;

import java.util.Collections;
import java.util.List;

import mop.emf.core.EMOP;

public abstract class GlobalLibrary extends AbstractLibrary {

	public abstract void process(EMOP mop);
	
	public List<Class<?>> dependences() { 
		return Collections.emptyList(); 
	}
}
