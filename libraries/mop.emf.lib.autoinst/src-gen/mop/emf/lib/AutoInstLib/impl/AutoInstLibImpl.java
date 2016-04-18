/**
 */
package mop.emf.lib.AutoInstLib.impl;

import java.util.Collection;

import mop.emf.lib.AutoInstLib.AutoInst;
import mop.emf.lib.AutoInstLib.AutoInstLib;
import mop.emf.lib.AutoInstLib.AutoInstLibPackage;
import mop.emf.lib.AutoInstLib.AutoInstantiable;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Inst Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl#getAutoInstantiables <em>Auto Instantiables</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl#getAutoInsts <em>Auto Insts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoInstLibImpl extends MinimalEObjectImpl.Container implements AutoInstLib {
	/**
	 * The cached value of the '{@link #getAutoInstantiables() <em>Auto Instantiables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoInstantiables()
	 * @generated
	 * @ordered
	 */
	protected EList<AutoInstantiable> autoInstantiables;

	/**
	 * The cached value of the '{@link #getAutoInsts() <em>Auto Insts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoInsts()
	 * @generated
	 * @ordered
	 */
	protected EList<AutoInst> autoInsts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoInstLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoInstLibPackage.Literals.AUTO_INST_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutoInstantiable> getAutoInstantiables() {
		if (autoInstantiables == null) {
			autoInstantiables = new EObjectContainmentEList<AutoInstantiable>(AutoInstantiable.class, this, AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES);
		}
		return autoInstantiables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutoInst> getAutoInsts() {
		if (autoInsts == null) {
			autoInsts = new EObjectContainmentEList<AutoInst>(AutoInst.class, this, AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS);
		}
		return autoInsts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES:
				return ((InternalEList<?>)getAutoInstantiables()).basicRemove(otherEnd, msgs);
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS:
				return ((InternalEList<?>)getAutoInsts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES:
				return getAutoInstantiables();
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS:
				return getAutoInsts();
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
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES:
				getAutoInstantiables().clear();
				getAutoInstantiables().addAll((Collection<? extends AutoInstantiable>)newValue);
				return;
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS:
				getAutoInsts().clear();
				getAutoInsts().addAll((Collection<? extends AutoInst>)newValue);
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
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES:
				getAutoInstantiables().clear();
				return;
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS:
				getAutoInsts().clear();
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
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTANTIABLES:
				return autoInstantiables != null && !autoInstantiables.isEmpty();
			case AutoInstLibPackage.AUTO_INST_LIB__AUTO_INSTS:
				return autoInsts != null && !autoInsts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AutoInstLibImpl
