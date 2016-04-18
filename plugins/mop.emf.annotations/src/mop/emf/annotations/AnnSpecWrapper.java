package mop.emf.annotations;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

public class AnnSpecWrapper {

	private AnnotationSpec spec;
	private GenPackage pkg;

	public AnnSpecWrapper(AnnotationSpec spec, GenPackage pkg) {
		this.spec = spec;
		this.pkg = pkg;
	}
	
	public List<Annotation> getAnnotations() {
		return spec.getAnnotations();
	}
	
	public GenClass getGenClass(Annotation ann) {
		GenClass gc = pkg.getGenClasses().stream().
					filter(c -> c.getName().equals(ann.getAnnId())).findAny().get();
		
		return gc;
	}

}
