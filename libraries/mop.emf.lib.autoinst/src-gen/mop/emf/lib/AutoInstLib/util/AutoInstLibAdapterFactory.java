/**
 */
package mop.emf.lib.AutoInstLib.util;

import mop.emf.lib.AutoInstLib.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage
 * @generated
 */
public class AutoInstLibAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutoInstLibPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstLibAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AutoInstLibPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoInstLibSwitch<Adapter> modelSwitch =
		new AutoInstLibSwitch<Adapter>() {
			@Override
			public Adapter caseAutoInstLib(AutoInstLib object) {
				return createAutoInstLibAdapter();
			}
			@Override
			public Adapter caseAutoInstantiable(AutoInstantiable object) {
				return createAutoInstantiableAdapter();
			}
			@Override
			public Adapter caseAutoInst(AutoInst object) {
				return createAutoInstAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mop.emf.lib.AutoInstLib.AutoInstLib <em>Auto Inst Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLib
	 * @generated
	 */
	public Adapter createAutoInstLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mop.emf.lib.AutoInstLib.AutoInstantiable <em>Auto Instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mop.emf.lib.AutoInstLib.AutoInstantiable
	 * @generated
	 */
	public Adapter createAutoInstantiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mop.emf.lib.AutoInstLib.AutoInst <em>Auto Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mop.emf.lib.AutoInstLib.AutoInst
	 * @generated
	 */
	public Adapter createAutoInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AutoInstLibAdapterFactory
