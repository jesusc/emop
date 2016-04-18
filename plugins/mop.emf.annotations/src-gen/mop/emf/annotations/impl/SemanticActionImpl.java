/**
 */
package mop.emf.annotations.impl;

import java.util.Collection;

import mop.emf.annotations.AnnotationsPackage;
import mop.emf.annotations.SemanticAction;
import mop.emf.annotations.When;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.annotations.impl.SemanticActionImpl#getExecPoint <em>Exec Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticActionImpl extends MinimalEObjectImpl.Container implements SemanticAction {
	/**
	 * The cached value of the '{@link #getExecPoint() <em>Exec Point</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<When> execPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.SEMANTIC_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<When> getExecPoint() {
		if (execPoint == null) {
			execPoint = new EDataTypeUniqueEList<When>(When.class, this, AnnotationsPackage.SEMANTIC_ACTION__EXEC_POINT);
		}
		return execPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.SEMANTIC_ACTION__EXEC_POINT:
				return getExecPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.SEMANTIC_ACTION__EXEC_POINT:
				getExecPoint().clear();
				getExecPoint().addAll((Collection<? extends When>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SEMANTIC_ACTION__EXEC_POINT:
				getExecPoint().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SEMANTIC_ACTION__EXEC_POINT:
				return execPoint != null && !execPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (execPoint: ");
		result.append(execPoint);
		result.append(')');
		return result.toString();
	}

} //SemanticActionImpl
