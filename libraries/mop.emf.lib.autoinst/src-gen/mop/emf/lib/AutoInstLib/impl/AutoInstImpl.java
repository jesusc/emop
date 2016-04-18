/**
 */
package mop.emf.lib.AutoInstLib.impl;

import mop.emf.lib.AutoInstLib.AutoInst;
import mop.emf.lib.AutoInstLib.AutoInstLibPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl#getOriginalAnnotation <em>Original Annotation</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl#getName <em>Name</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoInstImpl extends MinimalEObjectImpl.Container implements AutoInst {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature set;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoInstLibPackage.Literals.AUTO_INST;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoInstLibPackage.AUTO_INST__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INST__TARGET, oldTarget, target));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getSet() {
		if (set != null && set.eIsProxy()) {
			InternalEObject oldSet = (InternalEObject)set;
			set = (EStructuralFeature)eResolveProxy(oldSet);
			if (set != oldSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoInstLibPackage.AUTO_INST__SET, oldSet, set));
			}
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(EStructuralFeature newSet) {
		EStructuralFeature oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoInstLibPackage.AUTO_INST__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoInstLibPackage.AUTO_INST__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION:
				if (resolve) return getOriginalAnnotation();
				return basicGetOriginalAnnotation();
			case AutoInstLibPackage.AUTO_INST__NAME:
				return getName();
			case AutoInstLibPackage.AUTO_INST__SET:
				if (resolve) return getSet();
				return basicGetSet();
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
			case AutoInstLibPackage.AUTO_INST__TARGET:
				setTarget((EObject)newValue);
				return;
			case AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)newValue);
				return;
			case AutoInstLibPackage.AUTO_INST__NAME:
				setName((String)newValue);
				return;
			case AutoInstLibPackage.AUTO_INST__SET:
				setSet((EStructuralFeature)newValue);
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
			case AutoInstLibPackage.AUTO_INST__TARGET:
				setTarget((EObject)null);
				return;
			case AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)null);
				return;
			case AutoInstLibPackage.AUTO_INST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AutoInstLibPackage.AUTO_INST__SET:
				setSet((EStructuralFeature)null);
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
			case AutoInstLibPackage.AUTO_INST__TARGET:
				return target != null;
			case AutoInstLibPackage.AUTO_INST__ORIGINAL_ANNOTATION:
				return originalAnnotation != null;
			case AutoInstLibPackage.AUTO_INST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AutoInstLibPackage.AUTO_INST__SET:
				return set != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AutoInstImpl
