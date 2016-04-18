/**
 */
package mop.emf.lib.AutoInstLib;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Instantiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getOriginalAnnotation <em>Original Annotation</em>}</li>
 * </ul>
 *
 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstantiable()
 * @model
 * @generated
 */
public interface AutoInstantiable extends EObject {
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
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstantiable_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getTarget <em>Target</em>}' reference.
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
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#getAutoInstantiable_OriginalAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getOriginalAnnotation();

	/**
	 * Sets the value of the '{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getOriginalAnnotation <em>Original Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Annotation</em>' reference.
	 * @see #getOriginalAnnotation()
	 * @generated
	 */
	void setOriginalAnnotation(EAnnotation value);

} // AutoInstantiable
