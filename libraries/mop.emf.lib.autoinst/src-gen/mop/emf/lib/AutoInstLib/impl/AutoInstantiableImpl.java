/**
 */
package mop.emf.lib.AutoInstLib.impl;

import mop.emf.lib.AutoInstLib.AutoInstLibPackage;
import mop.emf.lib.AutoInstLib.AutoInstantiable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Instantiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl#getOriginalAnnotation <em>Original Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoInstantiableImpl extends MinimalEObjectImpl.Container implements AutoInstantiable {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The cached value of the '{@link #getOriginalAnnotation() <em>Original Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation originalAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoInstantiableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoInstLibPackage.Literals.AUTO_INSTANTIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getOriginalAnnotation() {
		if (originalAnnotation != null && originalAnnotation.eIsProxy()) {
			InternalEObject oldOriginalAnnotation = (InternalEObject)originalAnnotation;
			originalAnnotation = (EAnnotation)eResolveProxy(oldOriginalAnnotation);
			if (originalAnnotation != oldOriginalAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
			}
		}
		return originalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetOriginalAnnotation() {
		return originalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalAnnotation(EAnnotation newOriginalAnnotation) {
		EAnnotation oldOriginalAnnotation = originalAnnotation;
		originalAnnotation = newOriginalAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION:
				if (resolve) return getOriginalAnnotation();
				return basicGetOriginalAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET:
				setTarget((EObject)newValue);
				return;
			case AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)newValue);
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
			case AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET:
				setTarget((EObject)null);
				return;
			case AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)null);
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
			case AutoInstLibPackage.AUTO_INSTANTIABLE__TARGET:
				return target != null;
			case AutoInstLibPackage.AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION:
				return originalAnnotation != null;
		}
		return super.eIsSet(featureID);
	}

} //AutoInstantiableImpl
