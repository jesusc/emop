/**
 */
package mop.emf.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.annotations.Annotation#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getSemanticHooks <em>Semantic Hooks</em>}</li>
 * </ul>
 *
 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends EObject {
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
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link mop.emf.annotations.Annotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link mop.emf.annotations.SemanticAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Hooks</em>' containment reference list.
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_SemanticHooks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticAction> getSemanticHooks();

} // Annotation
