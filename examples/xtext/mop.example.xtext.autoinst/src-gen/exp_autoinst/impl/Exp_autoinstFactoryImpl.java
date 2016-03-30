/**
 */
package exp_autoinst.impl;

import exp_autoinst.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Exp_autoinstFactoryImpl extends EFactoryImpl implements Exp_autoinstFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Exp_autoinstFactory init() {
		try {
			Exp_autoinstFactory theExp_autoinstFactory = (Exp_autoinstFactory)EPackage.Registry.INSTANCE.getEFactory(Exp_autoinstPackage.eNS_URI);
			if (theExp_autoinstFactory != null) {
				return theExp_autoinstFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Exp_autoinstFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp_autoinstFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Exp_autoinstPackage.MODULE: return createModule();
			case Exp_autoinstPackage.LITERAL: return createLiteral();
			case Exp_autoinstPackage.FUNCTION_CALL: return createFunctionCall();
			case Exp_autoinstPackage.TRUE_VALUE: return createTrueValue();
			case Exp_autoinstPackage.FALSE_VALUE: return createFalseValue();
			case Exp_autoinstPackage.BOOLEAN_TYPE: return createBooleanType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueValue createTrueValue() {
		TrueValueImpl trueValue = new TrueValueImpl();
		return trueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FalseValue createFalseValue() {
		FalseValueImpl falseValue = new FalseValueImpl();
		return falseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp_autoinstPackage getExp_autoinstPackage() {
		return (Exp_autoinstPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Exp_autoinstPackage getPackage() {
		return Exp_autoinstPackage.eINSTANCE;
	}

} //Exp_autoinstFactoryImpl
