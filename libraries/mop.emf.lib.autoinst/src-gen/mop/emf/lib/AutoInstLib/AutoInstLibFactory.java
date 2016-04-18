/**
 */
package mop.emf.lib.AutoInstLib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage
 * @generated
 */
public interface AutoInstLibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutoInstLibFactory eINSTANCE = mop.emf.lib.AutoInstLib.impl.AutoInstLibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Auto Inst Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Inst Lib</em>'.
	 * @generated
	 */
	AutoInstLib createAutoInstLib();

	/**
	 * Returns a new object of class '<em>Auto Instantiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Instantiable</em>'.
	 * @generated
	 */
	AutoInstantiable createAutoInstantiable();

	/**
	 * Returns a new object of class '<em>Auto Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Inst</em>'.
	 * @generated
	 */
	AutoInst createAutoInst();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AutoInstLibPackage getAutoInstLibPackage();

} //AutoInstLibFactory
