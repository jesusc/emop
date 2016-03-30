/**
 */
package exp_autoinst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exp_autoinst.Literal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see exp_autoinst.Exp_autoinstPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see exp_autoinst.Exp_autoinstPackage#getLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link exp_autoinst.Literal#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Literal
