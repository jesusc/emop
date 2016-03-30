package mop.example.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import exp_autoinst.Exp_autoinstPackage;
import exp_autoinst.FalseValue;
import exp_autoinst.Literal;
import exp_autoinst.Module;
import exp_autoinst.TrueValue;
import mop.example.xtext.services.ExpAutoInstGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ExpAutoInstSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpAutoInstGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Exp_autoinstPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Exp_autoinstPackage.FALSE_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getFalseValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FalseValue(context, (FalseValue) semanticObject); 
					return; 
				}
				else break;
			case Exp_autoinstPackage.LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case Exp_autoinstPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case Exp_autoinstPackage.TRUE_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getTrueValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_TrueValue(context, (TrueValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FalseValue(EObject context, FalseValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exp_autoinstPackage.Literals.VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exp_autoinstPackage.Literals.VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFalseValueAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[Value|QID]
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID declaredValues+=Value* expressions+=Expression+)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TrueValue(EObject context, TrueValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exp_autoinstPackage.Literals.VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exp_autoinstPackage.Literals.VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrueValueAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}
