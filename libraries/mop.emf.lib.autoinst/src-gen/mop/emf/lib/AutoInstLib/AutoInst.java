/**
 */
package mop.emf.lib.AutoInstLib;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInst#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInst#getOriginalAnnotation <em>Original Annotation</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInst#getName <em>Name</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInst#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInst()
 * @model
 * @generated
 */
public interface AutoInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInst_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInst#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Original Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Annotation</em>' reference.
	 * @see #setOriginalAnnotation(EAnnotation)
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInst_OriginalAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getOriginalAnnotation();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInst#getOriginalAnnotation <em>Original Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Annotation</em>' reference.
	 * @see #getOriginalAnnotation()
	 * @generated
	 */
	void setOriginalAnnotation(EAnnotation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInst_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInst#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(EStructuralFeature)
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInst_Set()
	 * @model
	 * @generated
	 */
	EStructuralFeature getSet();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInst#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(EStructuralFeature value);

} // AutoInst
