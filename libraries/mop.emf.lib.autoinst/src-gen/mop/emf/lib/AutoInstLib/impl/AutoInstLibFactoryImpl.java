/**
 */
package mop.emf.lib.AutoInstLib.impl;

import mop.emf.lib.AutoInstLib.*;

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
public class AutoInstLibFactoryImpl extends EFactoryImpl implements AutoInstLibFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutoInstLibFactory init() {
		try {
			AutoInstLibFactory theAutoInstLibFactory = (AutoInstLibFactory)EPackage.Registry.INSTANCE.getEFactory(AutoInstLibPackage.eNS_URI);
			if (theAutoInstLibFactory != null) {
				return theAutoInstLibFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutoInstLibFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstLibFactoryImpl() {
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
			case AutoInstLibPackage.AUTO_INST_LIB: return createAutoInstLib();
			case AutoInstLibPackage.AUTO_INSTANTIABLE: return createAutoInstantiable();
			case AutoInstLibPackage.AUTO_INST: return createAutoInst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstLib createAutoInstLib() {
		AutoInstLibImpl autoInstLib = new AutoInstLibImpl();
		return autoInstLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstantiable createAutoInstantiable() {
		AutoInstantiableImpl autoInstantiable = new AutoInstantiableImpl();
		return autoInstantiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInst createAutoInst() {
		AutoInstImpl autoInst = new AutoInstImpl();
		return autoInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstLibPackage getAutoInstLibPackage() {
		return (AutoInstLibPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutoInstLibPackage getPackage() {
		return AutoInstLibPackage.eINSTANCE;
	}

} //AutoInstLibFactoryImpl
