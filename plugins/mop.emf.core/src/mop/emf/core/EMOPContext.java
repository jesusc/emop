package mop.emf.core;

import mop.emf.core.functional.EmptyFunction;

public class EMOPContext {

	public boolean activated = false;
	private boolean initializing;
	
	public void activate() {
		this.activated = true;
	}
	
	public void deactivate() {
		this.activated = false;
	}
	
	public void ifActivated(EmptyFunction f) {
		if ( activated ) {
			f.exec();
		}
	}

	public boolean isActivated() {
		return activated;
	}


	
}
