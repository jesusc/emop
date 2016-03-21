/**
 */
package mop.emf.annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mop.emf.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emop/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = mop.emf.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.AnnotationSpecImpl <em>Annotation Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.AnnotationSpecImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getAnnotationSpec()
	 * @generated
	 */
	int ANNOTATION_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SPEC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SPEC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SPEC__ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Annotation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.AnnotationImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SEMANTIC_HOOKS = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.ModelAnnotationImpl <em>Model Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.ModelAnnotationImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getModelAnnotation()
	 * @generated
	 */
	int MODEL_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANNOTATION__TARGET = ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANNOTATION__SEMANTIC_HOOKS = ANNOTATION__SEMANTIC_HOOKS;

	/**
	 * The number of structural features of the '<em>Model Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.ObjectAnnotationImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getObjectAnnotation()
	 * @generated
	 */
	int OBJECT_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION__TARGET = ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION__SEMANTIC_HOOKS = ANNOTATION__SEMANTIC_HOOKS;

	/**
	 * The number of structural features of the '<em>Object Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.ClassAnnotationImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getClassAnnotation()
	 * @generated
	 */
	int CLASS_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__TARGET = ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION__SEMANTIC_HOOKS = ANNOTATION__SEMANTIC_HOOKS;

	/**
	 * The number of structural features of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.FieldAnnotationImpl <em>Field Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.FieldAnnotationImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getFieldAnnotation()
	 * @generated
	 */
	int FIELD_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION__TARGET = ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Semantic Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION__SEMANTIC_HOOKS = ANNOTATION__SEMANTIC_HOOKS;

	/**
	 * The number of structural features of the '<em>Field Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.SemanticActionImpl <em>Semantic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.SemanticActionImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getSemanticAction()
	 * @generated
	 */
	int SEMANTIC_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Exec Point</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ACTION__EXEC_POINT = 0;

	/**
	 * The number of structural features of the '<em>Semantic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ACTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mop.emf.annotations.impl.JavaCodeImpl <em>Java Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.impl.JavaCodeImpl
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getJavaCode()
	 * @generated
	 */
	int JAVA_CODE = 7;

	/**
	 * The feature id for the '<em><b>Exec Point</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CODE__EXEC_POINT = SEMANTIC_ACTION__EXEC_POINT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CODE__CLASS_NAME = SEMANTIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CODE_FEATURE_COUNT = SEMANTIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CODE_OPERATION_COUNT = SEMANTIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mop.emf.annotations.When <em>When</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mop.emf.annotations.When
	 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 8;


	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.AnnotationSpec <em>Annotation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Spec</em>'.
	 * @see mop.emf.annotations.AnnotationSpec
	 * @generated
	 */
	EClass getAnnotationSpec();

	/**
	 * Returns the meta object for the attribute '{@link mop.emf.annotations.AnnotationSpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mop.emf.annotations.AnnotationSpec#getName()
	 * @see #getAnnotationSpec()
	 * @generated
	 */
	EAttribute getAnnotationSpec_Name();

	/**
	 * Returns the meta object for the attribute '{@link mop.emf.annotations.AnnotationSpec#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mop.emf.annotations.AnnotationSpec#getDescription()
	 * @see #getAnnotationSpec()
	 * @generated
	 */
	EAttribute getAnnotationSpec_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mop.emf.annotations.AnnotationSpec#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see mop.emf.annotations.AnnotationSpec#getAnnotations()
	 * @see #getAnnotationSpec()
	 * @generated
	 */
	EReference getAnnotationSpec_Annotations();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see mop.emf.annotations.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link mop.emf.annotations.Annotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mop.emf.annotations.Annotation#getTarget()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link mop.emf.annotations.Annotation#getSemanticHooks <em>Semantic Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Hooks</em>'.
	 * @see mop.emf.annotations.Annotation#getSemanticHooks()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_SemanticHooks();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.ModelAnnotation <em>Model Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Annotation</em>'.
	 * @see mop.emf.annotations.ModelAnnotation
	 * @generated
	 */
	EClass getModelAnnotation();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.ObjectAnnotation <em>Object Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Annotation</em>'.
	 * @see mop.emf.annotations.ObjectAnnotation
	 * @generated
	 */
	EClass getObjectAnnotation();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.ClassAnnotation <em>Class Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Annotation</em>'.
	 * @see mop.emf.annotations.ClassAnnotation
	 * @generated
	 */
	EClass getClassAnnotation();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.FieldAnnotation <em>Field Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Annotation</em>'.
	 * @see mop.emf.annotations.FieldAnnotation
	 * @generated
	 */
	EClass getFieldAnnotation();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.SemanticAction <em>Semantic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Action</em>'.
	 * @see mop.emf.annotations.SemanticAction
	 * @generated
	 */
	EClass getSemanticAction();

	/**
	 * Returns the meta object for the attribute list '{@link mop.emf.annotations.SemanticAction#getExecPoint <em>Exec Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exec Point</em>'.
	 * @see mop.emf.annotations.SemanticAction#getExecPoint()
	 * @see #getSemanticAction()
	 * @generated
	 */
	EAttribute getSemanticAction_ExecPoint();

	/**
	 * Returns the meta object for class '{@link mop.emf.annotations.JavaCode <em>Java Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Code</em>'.
	 * @see mop.emf.annotations.JavaCode
	 * @generated
	 */
	EClass getJavaCode();

	/**
	 * Returns the meta object for the attribute '{@link mop.emf.annotations.JavaCode#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see mop.emf.annotations.JavaCode#getClassName()
	 * @see #getJavaCode()
	 * @generated
	 */
	EAttribute getJavaCode_ClassName();

	/**
	 * Returns the meta object for enum '{@link mop.emf.annotations.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>When</em>'.
	 * @see mop.emf.annotations.When
	 * @generated
	 */
	EEnum getWhen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

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
		 * The meta object literal for the '{@link mop.emf.annotations.impl.AnnotationSpecImpl <em>Annotation Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.AnnotationSpecImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getAnnotationSpec()
		 * @generated
		 */
		EClass ANNOTATION_SPEC = eINSTANCE.getAnnotationSpec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_SPEC__NAME = eINSTANCE.getAnnotationSpec_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_SPEC__DESCRIPTION = eINSTANCE.getAnnotationSpec_Description();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_SPEC__ANNOTATIONS = eINSTANCE.getAnnotationSpec_Annotations();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.AnnotationImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TARGET = eINSTANCE.getAnnotation_Target();

		/**
		 * The meta object literal for the '<em><b>Semantic Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__SEMANTIC_HOOKS = eINSTANCE.getAnnotation_SemanticHooks();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.ModelAnnotationImpl <em>Model Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.ModelAnnotationImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getModelAnnotation()
		 * @generated
		 */
		EClass MODEL_ANNOTATION = eINSTANCE.getModelAnnotation();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.ObjectAnnotationImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getObjectAnnotation()
		 * @generated
		 */
		EClass OBJECT_ANNOTATION = eINSTANCE.getObjectAnnotation();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.ClassAnnotationImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getClassAnnotation()
		 * @generated
		 */
		EClass CLASS_ANNOTATION = eINSTANCE.getClassAnnotation();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.FieldAnnotationImpl <em>Field Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.FieldAnnotationImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getFieldAnnotation()
		 * @generated
		 */
		EClass FIELD_ANNOTATION = eINSTANCE.getFieldAnnotation();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.SemanticActionImpl <em>Semantic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.SemanticActionImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getSemanticAction()
		 * @generated
		 */
		EClass SEMANTIC_ACTION = eINSTANCE.getSemanticAction();

		/**
		 * The meta object literal for the '<em><b>Exec Point</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_ACTION__EXEC_POINT = eINSTANCE.getSemanticAction_ExecPoint();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.impl.JavaCodeImpl <em>Java Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.impl.JavaCodeImpl
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getJavaCode()
		 * @generated
		 */
		EClass JAVA_CODE = eINSTANCE.getJavaCode();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CODE__CLASS_NAME = eINSTANCE.getJavaCode_ClassName();

		/**
		 * The meta object literal for the '{@link mop.emf.annotations.When <em>When</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mop.emf.annotations.When
		 * @see mop.emf.annotations.impl.AnnotationsPackageImpl#getWhen()
		 * @generated
		 */
		EEnum WHEN = eINSTANCE.getWhen();

	}

} //AnnotationsPackage
