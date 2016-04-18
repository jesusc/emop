/**
 */
package mop.emf.lib.AutoInstLib;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Inst Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInstantiables <em>Auto Instantiables</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInsts <em>Auto Insts</em>}</li>
 * </ul>
 *
 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstLib()
 * @model
 * @generated
 */
public interface AutoInstLib extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Instantiables</b></em>' containment reference list.
	 * The list contents are of type {@link mop.emf.lib.AutoInstLib.AutoInstantiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Instantiables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Instantiables</em>' containment reference list.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstLib_AutoInstantiables()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutoInstantiable> getAutoInstantiables();

	/**
	 * Returns the value of the '<em><b>Auto Insts</b></em>' containment reference list.
	 * The list contents are of type {@link mop.emf.lib.AutoInstLib.AutoInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Insts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Insts</em>' containment reference list.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstLib_AutoInsts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutoInst> getAutoInsts();

} // AutoInstLib
