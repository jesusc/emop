/**
 */
package mop.emf.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.annotations.JavaCode#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see mop.emf.annotations.AnnotationsPackage#getJavaCode()
 * @model
 * @generated
 */
public interface JavaCode extends SemanticAction {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see mop.emf.annotations.AnnotationsPackage#getJavaCode_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link mop.emf.annotations.JavaCode#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // JavaCode
