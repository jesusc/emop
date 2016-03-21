/**
 */
package mop.emf.annotations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.annotations.SemanticAction#getExecPoint <em>Exec Point</em>}</li>
 * </ul>
 *
 * @see mop.emf.annotations.AnnotationsPackage#getSemanticAction()
 * @model abstract="true"
 * @generated
 */
public interface SemanticAction extends EObject {

	/**
	 * Returns the value of the '<em><b>Exec Point</b></em>' attribute list.
	 * The list contents are of type {@link mop.emf.annotations.When}.
	 * The literals are from the enumeration {@link mop.emf.annotations.When}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Point</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Point</em>' attribute list.
	 * @see mop.emf.annotations.When
	 * @see mop.emf.annotations.AnnotationsPackage#getSemanticAction_ExecPoint()
	 * @model
	 * @generated
	 */
	EList<When> getExecPoint();
} // SemanticAction
