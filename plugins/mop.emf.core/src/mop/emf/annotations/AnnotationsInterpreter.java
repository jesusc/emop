package mop.emf.annotations;

import mop.emf.annotations.util.AnnotationsSwitch;

public class AnnotationsInterpreter {
	private AnnotationSpec spec;

	protected AnnotationsInterpreter(AnnotationSpec spec) {
		this.spec = spec;
		this.perform();
	}
	
	protected void perform() {
		MySwitch s = new MySwitch();
		spec.getAnnotations().forEach(a -> s.doSwitch(a));
	}
	
	public static void perform(AnnotationSpec spec) {
		new AnnotationsInterpreter(spec);
	}
	
	protected class MySwitch extends AnnotationsSwitch<Void> {
		@Override
		public Void caseClassAnnotation(ClassAnnotation object) {
			System.out.println(object);
			return null;
		}
	}
	
}
