/**
 */
package exp_autoinst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exp_autoinst.Expression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see exp_autoinst.Exp_autoinstPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see exp_autoinst.Exp_autoinstPackage#getExpression_Type()
	 * @model required="true"
	 *        annotation="http://emop/delay_validation level='2'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link exp_autoinst.Expression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Expression
