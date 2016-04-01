package mop.emf.ui;

import mop.emf.annotations.AbstractLibrary;
import mop.emf.annotations.GlobalLibrary;
import mop.emf.annotations.Libraries;
import mop.emf.annotations.MetamodelLibrary;
import mop.emf.core.EMOP;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

public class LibraryInfo {

	private IConfigurationElement element;
	private boolean isActivated = false;
	
	public LibraryInfo(IConfigurationElement element) {
		this.element = element;
	}

	public String getName() {
		return element.getAttribute("name");
	}
	
	protected AbstractLibrary createLibrary() {
		try {
			return (AbstractLibrary) element.createExecutableExtension("implementation");
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isActivated() {
		return isActivated;
	}
	
	public synchronized void activate() {
		AbstractLibrary lib = createLibrary();
		if ( lib instanceof GlobalLibrary ) {
			Libraries.install((GlobalLibrary) lib);
		} else if ( lib instanceof MetamodelLibrary ) { 
			Libraries.install((MetamodelLibrary) lib);
		} else {
			throw new IllegalArgumentException("Kind of library not supported: " + lib);
		}
		
		EMOP.activate(); // TODO: How to establish execution contexts...
		isActivated = true;
	}
	
}
