package mop.emf.lib.AutoInstLib;

import java.util.ArrayList;
import java.util.List;

import mop.emf.annotations.util.EAnnotationUtil;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

public class AutoInstLibUtil {
	public static List<mop.emf.lib.AutoInstLib.AutoInstantiable> getAutoInstantiableAnns(Resource mm) {
		ArrayList<mop.emf.lib.AutoInstLib.AutoInstantiable> result = new ArrayList<>();
		List<EModelElement> annotated = EAnnotationUtil.getAnnotated(mm, "http://emop/autoinstantiable");
		for(EModelElement e : annotated) {
			mop.emf.lib.AutoInstLib.AutoInstantiable v = mop.emf.lib.AutoInstLib.AutoInstLibFactory.eINSTANCE.createAutoInstantiable();
			v.setTarget(e);
			v.setOriginalAnnotation(e.getEAnnotation("http://emop/autoinstantiable"));
			result.add(v);
		}
		
		return result;
	}
	public static List<mop.emf.lib.AutoInstLib.AutoInst> getAutoInstAnns(Resource mm) {
		ArrayList<mop.emf.lib.AutoInstLib.AutoInst> result = new ArrayList<>();
		List<EModelElement> annotated = EAnnotationUtil.getAnnotated(mm, "http://emop/autoinst");
		for(EModelElement e : annotated) {
			mop.emf.lib.AutoInstLib.AutoInst v = mop.emf.lib.AutoInstLib.AutoInstLibFactory.eINSTANCE.createAutoInst();
			v.setTarget(e);
			EAnnotationUtil.setFeature(e, "http://emop/autoinst", v, "name");
			EAnnotationUtil.setFeature(e, "http://emop/autoinst", v, "set");
			v.setOriginalAnnotation(e.getEAnnotation("http://emop/autoinst"));
			result.add(v);
		}
		
		return result;
	}

	public static void setReflectiveFeatures(EAnnotation eAnn, EClass c, EObject target) {
		eAnn.getDetails().forEach( entry -> {
			if ( entry.getKey().startsWith("_") ) {
				String fname = entry.getKey().substring(1);
				EStructuralFeature f = c.getEStructuralFeature(fname);
				
				if ( f == null) {
					System.err.println("No feature " + fname);
				} else if ( !( f instanceof EAttribute ) ) {
					System.err.println("Automatic setter only for attributes");
				}
				
				EDataType t = (EDataType) f.getEType();
				Object obj = EcoreFactory.eINSTANCE.createFromString(t, entry.getValue());
				
				target.eSet(f, obj);
			}
		});
	}	

}
