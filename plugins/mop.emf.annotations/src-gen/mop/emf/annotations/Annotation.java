/**
 */
package mop.emf.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link mop.emf.annotations.Annotation#getAnnId <em>Ann Id</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getUri <em>Uri</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getReqs <em>Reqs</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getForbids <em>Forbids</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getOriginalAnnotation <em>Original Annotation</em>}</li>
 *   <li>{@link mop.emf.annotations.Annotation#getSemanticHooks <em>Semantic Hooks</em>}</li>
 * </ul>
 *
 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends EObject, EClass {
	/**
	 * Returns the value of the '<em><b>Ann Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ann Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ann Id</em>' attribute.
	 * @see #setAnnId(String)
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_AnnId()
	 * @model required="true"
	 * @generated
	 */
	String getAnnId();

	/**
	 * Sets the value of the '{@link mop.emf.annotations.Annotation#getAnnId <em>Ann Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ann Id</em>' attribute.
	 * @see #getAnnId()
	 * @generated
	 */
	void setAnnId(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link mop.emf.annotations.Annotation#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Reqs</b></em>' reference list.
	 * The list contents are of type {@link mop.emf.annotations.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reqs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reqs</em>' reference list.
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_Reqs()
	 * @model
	 * @generated
	 */
	EList<Annotation> getReqs();

	/**
	 * Returns the value of the '<em><b>Forbids</b></em>' reference list.
	 * The list contents are of type {@link mop.emf.annotations.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbids</em>' reference list.
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_Forbids()
	 * @model
	 * @generated
	 */
	EList<Annotation> getForbids();

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
	 * Returns the value of the '<em><b>Original Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Annotation</em>' reference.
	 * @see #setOriginalAnnotation(EAnnotation)
	 * @see mop.emf.annotations.AnnotationsPackage#getAnnotation_OriginalAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getOriginalAnnotation();

	/**
	 * Sets the value of the '{@link mop.emf.annotations.Annotation#getOriginalAnnotation <em>Original Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Annotation</em>' reference.
	 * @see #getOriginalAnnotation()
	 * @generated
	 */
	void setOriginalAnnotation(EAnnotation value);

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
