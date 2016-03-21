package mop.emf.core.api;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import mop.emf.core.EMOP;
import mop.emf.core.Reflectogram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMOPSet extends EMOPEvent {
	
	private EStructuralFeature feature;
	private EMOP mop;
	
	public EMOPSet(EMOP mop, EStructuralFeature feature) {
		this.mop     = mop;
		this.feature = feature;
	}

	// The reflectrogram can be passed as parameter
	
	public EMOPSet when(Supplier<Boolean> constraint) {
		return this;
	}
	
	public EMOPSet when(Function<Reflectogram, Boolean> constraint) {
		return this;
	}
	
	public EMOPSet before(Consumer<EObject> callback) {
		
		return this;
	}

	public EMOPSet after() {

		return this;
	}
	
//	public EMOPSetBefore before() {
//		return new EMOPSetBefore();
//	}
	
	// when, with methods before, after, around
	
//	public class EMOPSetBefore extends EMOPWhen {
//		public EMOPDo action() {
//			return null;
//		}
//	}
//	
//	public class EMOPSetAfter extends EMOPWhen {
//		public EMOPDo action() {
//			return null;
//		}
//	}
//
//	public class EMOPSetAround extends EMOPWhen {
//		public EMOPDo action() {
//			return null;
//		}
//	}
	
}
