package ${pkg.getQualifiedPackageName()};

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

public class ${pkg.getEcorePackage().getName()}Util {
<#list anns.getAnnotations() as ann>
	public static List<${anns.getGenClass(ann).getQualifiedInterfaceName()}> get${ann.getAnnId()}Anns(Resource mm) {
		ArrayList<${anns.getGenClass(ann).getQualifiedInterfaceName()}> result = new ArrayList<>();
		List<EModelElement> annotated = EAnnotationUtil.getAnnotated(mm, "${ann.getUri()}");
		for(EModelElement e : annotated) {
			${anns.getGenClass(ann).getQualifiedInterfaceName()} v = ${pkg.getQualifiedFactoryInterfaceName()}.eINSTANCE.create${anns.getGenClass(ann).getName()}();
			v.setTarget(e);
			<#list ann.getEStructuralFeatures() as f>
			EAnnotationUtil.setFeature(e, "${ann.getUri()}", v, "${f.getName()}");
			</#list>
			v.setOriginalAnnotation(e.getEAnnotation("${ann.getUri()}"));
			result.add(v);
		}
		
		return result;
	}
</#list>

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
