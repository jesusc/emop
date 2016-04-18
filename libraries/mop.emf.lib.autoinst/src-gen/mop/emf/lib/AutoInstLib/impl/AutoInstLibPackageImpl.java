/**
 */
package mop.emf.lib.AutoInstLib.impl;

import mop.emf.lib.AutoInstLib.AutoInst;
import mop.emf.lib.AutoInstLib.AutoInstLib;
import mop.emf.lib.AutoInstLib.AutoInstLibFactory;
import mop.emf.lib.AutoInstLib.AutoInstLibPackage;
import mop.emf.lib.AutoInstLib.AutoInstantiable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoInstLibPackageImpl extends EPackageImpl implements AutoInstLibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoInstLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoInstantiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoInstEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mop.emf.lib.AutoInstLib.AutoInstLibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AutoInstLibPackageImpl() {
		super(eNS_URI, AutoInstLibFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AutoInstLibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AutoInstLibPackage init() {
		if (isInited) return (AutoInstLibPackage)EPackage.Registry.INSTANCE.getEPackage(AutoInstLibPackage.eNS_URI);

		// Obtain or create and register package
		AutoInstLibPackageImpl theAutoInstLibPackage = (AutoInstLibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AutoInstLibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AutoInstLibPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAutoInstLibPackage.createPackageContents();

		// Initialize created meta-data
		theAutoInstLibPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAutoInstLibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AutoInstLibPackage.eNS_URI, theAutoInstLibPackage);
		return theAutoInstLibPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoInstLib() {
		return autoInstLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInstLib_AutoInstantiables() {
		return (EReference)autoInstLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInstLib_AutoInsts() {
		return (EReference)autoInstLibEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoInstantiable() {
		return autoInstantiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInstantiable_Target() {
		return (EReference)autoInstantiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInstantiable_OriginalAnnotation() {
		return (EReference)autoInstantiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoInst() {
		return autoInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInst_Target() {
		return (EReference)autoInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInst_OriginalAnnotation() {
		return (EReference)autoInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoInst_Name() {
		return (EAttribute)autoInstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInst_Set() {
		return (EReference)autoInstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInstLibFactory getAutoInstLibFactory() {
		return (AutoInstLibFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		autoInstLibEClass = createEClass(AUTO_INST_LIB);
		createEReference(autoInstLibEClass, AUTO_INST_LIB__AUTO_INSTANTIABLES);
		createEReference(autoInstLibEClass, AUTO_INST_LIB__AUTO_INSTS);

		autoInstantiableEClass = createEClass(AUTO_INSTANTIABLE);
		createEReference(autoInstantiableEClass, AUTO_INSTANTIABLE__TARGET);
		createEReference(autoInstantiableEClass, AUTO_INSTANTIABLE__ORIGINAL_ANNOTATION);

		autoInstEClass = createEClass(AUTO_INST);
		createEReference(autoInstEClass, AUTO_INST__TARGET);
		createEReference(autoInstEClass, AUTO_INST__ORIGINAL_ANNOTATION);
		createEAttribute(autoInstEClass, AUTO_INST__NAME);
		createEReference(autoInstEClass, AUTO_INST__SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(autoInstLibEClass, AutoInstLib.class, "AutoInstLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutoInstLib_AutoInstantiables(), this.getAutoInstantiable(), null, "autoInstantiables", null, 0, -1, AutoInstLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoInstLib_AutoInsts(), this.getAutoInst(), null, "autoInsts", null, 0, -1, AutoInstLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoInstantiableEClass, AutoInstantiable.class, "AutoInstantiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutoInstantiable_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, AutoInstantiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoInstantiable_OriginalAnnotation(), ecorePackage.getEAnnotation(), null, "originalAnnotation", null, 0, 1, AutoInstantiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoInstEClass, AutoInst.class, "AutoInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutoInst_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, AutoInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoInst_OriginalAnnotation(), ecorePackage.getEAnnotation(), null, "originalAnnotation", null, 0, 1, AutoInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoInst_Name(), ecorePackage.getEString(), "name", null, 0, 1, AutoInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoInst_Set(), ecorePackage.getEStructuralFeature(), null, "set", null, 0, 1, AutoInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AutoInstLibPackageImpl
