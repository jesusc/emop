package mop.emf.lib.AutoInstLib;

import java.util.Collection;

import mop.emf.annotations.MetamodelLibrary;
import mop.emf.core.EMOP;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AutomaticInstantiationLib extends MetamodelLibrary {

	@Override
	public void process(Resource mm) {
		EMOP mop = EMOP.global();

		for(AutoInst ann : AutoInstLibUtil.getAutoInstAnns(mm)) {
			EClass c = (EClass) ann.getTarget();
			EReference ref = (EReference) ann.getSet();
			EClass container = ref.getEContainingClass();

			mop.onInstantiate(container, (obj) -> {
				EObject newInstance = EcoreUtil.create(c);
				setFeatures(ann, c, newInstance);
				if ( ref.isMany() ) {
					((Collection) obj.eGet(ref)).add(newInstance);
				} else {
					obj.eSet(ref, newInstance);
				}
			});
		}
	}
	
	private void setFeatures(AutoInst ann, EClass c, EObject target) {
		AutoInstLibUtil.setReflectiveFeatures(ann.getOriginalAnnotation(), c, target);		
	}
	
}