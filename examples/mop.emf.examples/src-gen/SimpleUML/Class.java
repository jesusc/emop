/**
 */
package SimpleUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleUML.Class#getFeatures <em>Features</em>}</li>
 *   <li>{@link SimpleUML.Class#getPkg <em>Pkg</em>}</li>
 * </ul>
 *
 * @see SimpleUML.SimpleUMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleUML.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see SimpleUML.SimpleUMLPackage#getClass_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimpleUML.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(SimpleUML.Package)
	 * @see SimpleUML.SimpleUMLPackage#getClass_Pkg()
	 * @see SimpleUML.Package#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	SimpleUML.Package getPkg();

	/**
	 * Sets the value of the '{@link SimpleUML.Class#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(SimpleUML.Package value);

} // Class
