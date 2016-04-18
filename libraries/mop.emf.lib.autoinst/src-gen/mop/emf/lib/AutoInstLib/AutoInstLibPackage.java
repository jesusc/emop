/**
 */
package mop.emf.lib.AutoInstLib;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mop.emf.lib.AutoInstLib.AutoInstLibFactory
 * @model kind="package"
 * @generated
 */
public interface AutoInstLibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AutoInstLib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emop/AutoInstLib";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AutoInstLib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutoInstLibPackage eINSTANCE = mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl.init();

	/**
	 * The meta object id for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl <em>Auto Inst Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInstLib()
	 * @generated
	 */
	int AUTO_INST_LIB = 0;

	/**
	 * The feature id for the '<em><b>Auto Instantiables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_LIB__AUTO_INSTANTIABLES = 0;

	/**
	 * The feature id for the '<em><b>Auto Insts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_LIB__AUTO_INSTS = 1;

	/**
	 * The number of structural features of the '<em>Auto Inst Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_LIB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auto Inst Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_LIB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl <em>Auto Instantiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInstantiable()
	 * @generated
	 */
	int AUTO_INSTANTIABLE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INSTANTIABLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Original Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Auto Instantiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INSTANTIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auto Instantiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INSTANTIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl <em>Auto Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstImpl
	 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInst()
	 * @generated
	 */
	int AUTO_INST = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Original Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST__ORIGINAL_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST__SET = 3;

	/**
	 * The number of structural features of the '<em>Auto Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Auto Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mop.emf.lib.AutoInstLib.AutoInstLib <em>Auto Inst Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Inst Lib</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLib
	 * @generated
	 */
	EClass getAutoInstLib();

	/**
	 * Returns the meta object for the containment reference list '{@link mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInstantiables <em>Auto Instantiables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auto Instantiables</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInstantiables()
	 * @see #getAutoInstLib()
	 * @generated
	 */
	EReference getAutoInstLib_AutoInstantiables();

	/**
	 * Returns the meta object for the containment reference list '{@link mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInsts <em>Auto Insts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auto Insts</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstLib#getAutoInsts()
	 * @see #getAutoInstLib()
	 * @generated
	 */
	EReference getAutoInstLib_AutoInsts();

	/**
	 * Returns the meta object for class '{@link mop.emf.lib.AutoInstLib.AutoInstantiable <em>Auto Instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Instantiable</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstantiable
	 * @generated
	 */
	EClass getAutoInstantiable();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstantiable#getTarget()
	 * @see #getAutoInstantiable()
	 * @generated
	 */
	EReference getAutoInstantiable_Target();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.lib.AutoInstLib.AutoInstantiable#getOriginalAnnotation <em>Original Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Annotation</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInstantiable#getOriginalAnnotation()
	 * @see #getAutoInstantiable()
	 * @generated
	 */
	EReference getAutoInstantiable_OriginalAnnotation();

	/**
	 * Returns the meta object for class '{@link mop.emf.lib.AutoInstLib.AutoInst <em>Auto Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Inst</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInst
	 * @generated
	 */
	EClass getAutoInst();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.lib.AutoInstLib.AutoInst#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInst#getTarget()
	 * @see #getAutoInst()
	 * @generated
	 */
	EReference getAutoInst_Target();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.lib.AutoInstLib.AutoInst#getOriginalAnnotation <em>Original Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Annotation</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInst#getOriginalAnnotation()
	 * @see #getAutoInst()
	 * @generated
	 */
	EReference getAutoInst_OriginalAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link mop.emf.lib.AutoInstLib.AutoInst#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInst#getName()
	 * @see #getAutoInst()
	 * @generated
	 */
	EAttribute getAutoInst_Name();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.lib.AutoInstLib.AutoInst#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see mop.emf.lib.AutoInstLib.AutoInst#getSet()
	 * @see #getAutoInst()
	 * @generated
	 */
	EReference getAutoInst_Set();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutoInstLibFactory getAutoInstLibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl <em>Auto Inst Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibImpl
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInstLib()
		 * @generated
		 */
		EClass AUTO_INST_LIB = eINSTANCE.getAutoInstLib();

		/**
		 * The meta object literal for the '<em><b>Auto Instantiables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INST_LIB__AUTO_INSTANTIABLES = eINSTANCE.getAutoInstLib_AutoInstantiables();

		/**
		 * The meta object literal for the '<em><b>Auto Insts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INST_LIB__AUTO_INSTS = eINSTANCE.getAutoInstLib_AutoInsts();

		/**
		 * The meta object literal for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl <em>Auto Instantiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstantiableImpl
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInstantiable()
		 * @generated
		 */
		EClass AUTO_INSTANTIABLE = eINSTANCE.getAutoInstantiable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INSTANTIABLE__TARGET = eINSTANCE.getAutoInstantiable_Target();

		/**
		 * The meta object literal for the '<em><b>Original Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION = eINSTANCE.getAutoInstantiable_OriginalAnnotation();

		/**
		 * The meta object literal for the '{@link mop.emf.lib.AutoInstLib.impl.AutoInstImpl <em>Auto Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstImpl
		 * @see mop.emf.lib.AutoInstLib.impl.AutoInstLibPackageImpl#getAutoInst()
		 * @generated
		 */
		EClass AUTO_INST = eINSTANCE.getAutoInst();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INST__TARGET = eINSTANCE.getAutoInst_Target();

		/**
		 * The meta object literal for the '<em><b>Original Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INST__ORIGINAL_ANNOTATION = eINSTANCE.getAutoInst_OriginalAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_INST__NAME = eINSTANCE.getAutoInst_Name();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_INST__SET = eINSTANCE.getAutoInst_Set();

	}

} //AutoInstLibPackage
