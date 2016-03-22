package mop.emf.libraries.resourcetype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A meta-model is a collection of (root) EPackages.
 * This represents the notion that the meta-model of a EMF model
 * is just the collection of types/features used in the model.
 * 
 * @author jesus
 *
 */
public class Metamodel {

	protected HashSet<EPackage> packages = new HashSet<>();
	
	public void addClass(EClass eClass) {
		if ( eClass.getEPackage() != null ) 
			packages.add(extractTopLevel(eClass.getEPackage()));
	}

	private EPackage extractTopLevel(EPackage ePackage) {
		return (EPackage) EcoreUtil.getRootContainer(ePackage);
	}
	
	public List<EPackage> getPackages() {
		return new ArrayList<EPackage>(packages);
	}

}
