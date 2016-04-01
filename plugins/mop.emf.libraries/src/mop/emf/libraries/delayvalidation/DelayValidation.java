package mop.emf.libraries.delayvalidation;

import java.util.List;

import mop.emf.annotations.MetamodelLibrary;
import mop.emf.core.EMOP;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class DelayValidation extends MetamodelLibrary {
	public static String CLASS_ANN_URI = "http://emop/delay_validation";
	private String fileExtension;
	
	
	public DelayValidation() {
	}
	
	public DelayValidation(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	@Override
	public void process(Resource metamodel) {
		EMOP emop = EMOP.global();
		EPackage pkg = (EPackage) metamodel.getContents().get(0);
		
		extractEAnnotations(metamodel, CLASS_ANN_URI, (m, ann) -> {
			if ( ! ( m instanceof EStructuralFeature) ) {
				System.err.println("Annotation only for features for the moment");
				return;
			}

			EStructuralFeature f = (EStructuralFeature) m;
			EClass c = f.getEContainingClass();
			
			
			emop.onValidate().after((obj, validation) -> {
				if ( c.isInstance(obj) ) {
					List<Diagnostic> r = validation.getDiagnostics(obj, guiltyElement -> guiltyElement == f);					
					validation.remove(r);
				}
			});
		});
	}
}
