/**
 */
package mop.emf.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mop.emf.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = mop.emf.annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Spec</em>'.
	 * @generated
	 */
	AnnotationSpec createAnnotationSpec();

	/**
	 * Returns a new object of class '<em>Model Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Annotation</em>'.
	 * @generated
	 */
	ModelAnnotation createModelAnnotation();

	/**
	 * Returns a new object of class '<em>Object Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Annotation</em>'.
	 * @generated
	 */
	ObjectAnnotation createObjectAnnotation();

	/**
	 * Returns a new object of class '<em>Class Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Annotation</em>'.
	 * @generated
	 */
	ClassAnnotation createClassAnnotation();

	/**
	 * Returns a new object of class '<em>Field Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Annotation</em>'.
	 * @generated
	 */
	FieldAnnotation createFieldAnnotation();

	/**
	 * Returns a new object of class '<em>Java Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Code</em>'.
	 * @generated
	 */
	JavaCode createJavaCode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
