/**
 */
package SimpleUML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleUML.Feature#isIsMultivalued <em>Is Multivalued</em>}</li>
 *   <li>{@link SimpleUML.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see SimpleUML.SimpleUMLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multivalued</em>' attribute.
	 * @see #setIsMultivalued(boolean)
	 * @see SimpleUML.SimpleUMLPackage#getFeature_IsMultivalued()
	 * @model
	 * @generated
	 */
	boolean isIsMultivalued();

	/**
	 * Sets the value of the '{@link SimpleUML.Feature#isIsMultivalued <em>Is Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multivalued</em>' attribute.
	 * @see #isIsMultivalued()
	 * @generated
	 */
	void setIsMultivalued(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SimpleUML.Class)
	 * @see SimpleUML.SimpleUMLPackage#getFeature_Type()
	 * @model required="true"
	 * @generated
	 */
	SimpleUML.Class getType();

	/**
	 * Sets the value of the '{@link SimpleUML.Feature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleUML.Class value);

} // Feature
