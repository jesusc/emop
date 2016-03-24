/**
 */
package SimpleUML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleUML.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see SimpleUML.SimpleUMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleUML.Class}.
	 * It is bidirectional and its opposite is '{@link SimpleUML.Class#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see SimpleUML.SimpleUMLPackage#getPackage_Classes()
	 * @see SimpleUML.Class#getPkg
	 * @model opposite="pkg" containment="true"
	 * @generated
	 */
	EList<SimpleUML.Class> getClasses();

} // Package
