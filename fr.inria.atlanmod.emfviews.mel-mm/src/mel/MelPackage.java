/**
 */
package mel;

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
 * @see mel.MelFactory
 * @model kind="package"
 * @generated
 */
public interface MelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.monoge.armines/Mel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MelPackage eINSTANCE = mel.impl.MelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.ModelImpl
	 * @see mel.impl.MelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mel.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.ExtensionImpl
	 * @see mel.impl.MelPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mel.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.CreateImpl
	 * @see mel.impl.MelPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.RefineImpl
	 * @see mel.impl.MelPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 3;

	/**
	 * The feature id for the '<em><b>Class New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__CLASS_NEW = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__CLASS_ORIGINAL = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.GeneralizeImpl <em>Generalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.GeneralizeImpl
	 * @see mel.impl.MelPackageImpl#getGeneralize()
	 * @generated
	 */
	int GENERALIZE = 4;

	/**
	 * The feature id for the '<em><b>Class New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZE__CLASS_NEW = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZE__CLASS = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZE_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.AddPropertyImpl <em>Add Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.AddPropertyImpl
	 * @see mel.impl.MelPackageImpl#getAddProperty()
	 * @generated
	 */
	int ADD_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__PROPERTY = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.ModifyPropertyImpl <em>Modify Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.ModifyPropertyImpl
	 * @see mel.impl.MelPackageImpl#getModifyProperty()
	 * @generated
	 */
	int MODIFY_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PROPERTY__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PROPERTY__PROPERTY = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PROPERTY__VALUE = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modify Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PROPERTY_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Modify Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PROPERTY_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.ValueAssignmentImpl
	 * @see mel.impl.MelPackageImpl#getValueAssignment()
	 * @generated
	 */
	int VALUE_ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ASSIGNMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mel.impl.FilterPropertyImpl <em>Filter Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.FilterPropertyImpl
	 * @see mel.impl.MelPackageImpl#getFilterProperty()
	 * @generated
	 */
	int FILTER_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PROPERTY__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PROPERTY__PROPERTY = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PROPERTY_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PROPERTY_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.FilterClassImpl <em>Filter Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.FilterClassImpl
	 * @see mel.impl.MelPackageImpl#getFilterClass()
	 * @generated
	 */
	int FILTER_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLASS_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.AddConstraintImpl
	 * @see mel.impl.MelPackageImpl#getAddConstraint()
	 * @generated
	 */
	int ADD_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__CONSTRAINT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__VALUE = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Add Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mel.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mel.impl.FilterConstraintImpl
	 * @see mel.impl.MelPackageImpl#getFilterConstraint()
	 * @generated
	 */
	int FILTER_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONSTRAINT__CLASS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONSTRAINT__CONSTRAINT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONSTRAINT_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONSTRAINT_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mel.Model#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see mel.Model#getExtensions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Extensions();

	/**
	 * Returns the meta object for class '{@link mel.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see mel.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for class '{@link mel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see mel.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link mel.Create#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.Create#getClass_()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Class();

	/**
	 * Returns the meta object for class '{@link mel.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see mel.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the attribute '{@link mel.Refine#getClassNew <em>Class New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class New</em>'.
	 * @see mel.Refine#getClassNew()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_ClassNew();

	/**
	 * Returns the meta object for the attribute '{@link mel.Refine#getClassOriginal <em>Class Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Original</em>'.
	 * @see mel.Refine#getClassOriginal()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_ClassOriginal();

	/**
	 * Returns the meta object for class '{@link mel.Generalize <em>Generalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalize</em>'.
	 * @see mel.Generalize
	 * @generated
	 */
	EClass getGeneralize();

	/**
	 * Returns the meta object for the attribute '{@link mel.Generalize#getClassNew <em>Class New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class New</em>'.
	 * @see mel.Generalize#getClassNew()
	 * @see #getGeneralize()
	 * @generated
	 */
	EAttribute getGeneralize_ClassNew();

	/**
	 * Returns the meta object for the attribute list '{@link mel.Generalize#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see mel.Generalize#getClass_()
	 * @see #getGeneralize()
	 * @generated
	 */
	EAttribute getGeneralize_Class();

	/**
	 * Returns the meta object for class '{@link mel.AddProperty <em>Add Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Property</em>'.
	 * @see mel.AddProperty
	 * @generated
	 */
	EClass getAddProperty();

	/**
	 * Returns the meta object for the attribute '{@link mel.AddProperty#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.AddProperty#getClass_()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Class();

	/**
	 * Returns the meta object for the attribute '{@link mel.AddProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see mel.AddProperty#getProperty()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Property();

	/**
	 * Returns the meta object for class '{@link mel.ModifyProperty <em>Modify Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Property</em>'.
	 * @see mel.ModifyProperty
	 * @generated
	 */
	EClass getModifyProperty();

	/**
	 * Returns the meta object for the attribute '{@link mel.ModifyProperty#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.ModifyProperty#getClass_()
	 * @see #getModifyProperty()
	 * @generated
	 */
	EAttribute getModifyProperty_Class();

	/**
	 * Returns the meta object for the attribute '{@link mel.ModifyProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see mel.ModifyProperty#getProperty()
	 * @see #getModifyProperty()
	 * @generated
	 */
	EAttribute getModifyProperty_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link mel.ModifyProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see mel.ModifyProperty#getValue()
	 * @see #getModifyProperty()
	 * @generated
	 */
	EReference getModifyProperty_Value();

	/**
	 * Returns the meta object for class '{@link mel.ValueAssignment <em>Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Assignment</em>'.
	 * @see mel.ValueAssignment
	 * @generated
	 */
	EClass getValueAssignment();

	/**
	 * Returns the meta object for the attribute '{@link mel.ValueAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see mel.ValueAssignment#getAttribute()
	 * @see #getValueAssignment()
	 * @generated
	 */
	EAttribute getValueAssignment_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link mel.ValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mel.ValueAssignment#getValue()
	 * @see #getValueAssignment()
	 * @generated
	 */
	EAttribute getValueAssignment_Value();

	/**
	 * Returns the meta object for class '{@link mel.FilterProperty <em>Filter Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Property</em>'.
	 * @see mel.FilterProperty
	 * @generated
	 */
	EClass getFilterProperty();

	/**
	 * Returns the meta object for the attribute '{@link mel.FilterProperty#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.FilterProperty#getClass_()
	 * @see #getFilterProperty()
	 * @generated
	 */
	EAttribute getFilterProperty_Class();

	/**
	 * Returns the meta object for the attribute '{@link mel.FilterProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see mel.FilterProperty#getProperty()
	 * @see #getFilterProperty()
	 * @generated
	 */
	EAttribute getFilterProperty_Property();

	/**
	 * Returns the meta object for class '{@link mel.FilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Class</em>'.
	 * @see mel.FilterClass
	 * @generated
	 */
	EClass getFilterClass();

	/**
	 * Returns the meta object for the attribute '{@link mel.FilterClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.FilterClass#getClass_()
	 * @see #getFilterClass()
	 * @generated
	 */
	EAttribute getFilterClass_Class();

	/**
	 * Returns the meta object for class '{@link mel.AddConstraint <em>Add Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Constraint</em>'.
	 * @see mel.AddConstraint
	 * @generated
	 */
	EClass getAddConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mel.AddConstraint#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.AddConstraint#getClass_()
	 * @see #getAddConstraint()
	 * @generated
	 */
	EAttribute getAddConstraint_Class();

	/**
	 * Returns the meta object for the attribute '{@link mel.AddConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see mel.AddConstraint#getConstraint()
	 * @see #getAddConstraint()
	 * @generated
	 */
	EAttribute getAddConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link mel.AddConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mel.AddConstraint#getValue()
	 * @see #getAddConstraint()
	 * @generated
	 */
	EAttribute getAddConstraint_Value();

	/**
	 * Returns the meta object for class '{@link mel.FilterConstraint <em>Filter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Constraint</em>'.
	 * @see mel.FilterConstraint
	 * @generated
	 */
	EClass getFilterConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mel.FilterConstraint#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mel.FilterConstraint#getClass_()
	 * @see #getFilterConstraint()
	 * @generated
	 */
	EAttribute getFilterConstraint_Class();

	/**
	 * Returns the meta object for the attribute '{@link mel.FilterConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see mel.FilterConstraint#getConstraint()
	 * @see #getFilterConstraint()
	 * @generated
	 */
	EAttribute getFilterConstraint_Constraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MelFactory getMelFactory();

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
		 * The meta object literal for the '{@link mel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.ModelImpl
		 * @see mel.impl.MelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EXTENSIONS = eINSTANCE.getModel_Extensions();

		/**
		 * The meta object literal for the '{@link mel.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.ExtensionImpl
		 * @see mel.impl.MelPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '{@link mel.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.CreateImpl
		 * @see mel.impl.MelPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__CLASS = eINSTANCE.getCreate_Class();

		/**
		 * The meta object literal for the '{@link mel.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.RefineImpl
		 * @see mel.impl.MelPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Class New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__CLASS_NEW = eINSTANCE.getRefine_ClassNew();

		/**
		 * The meta object literal for the '<em><b>Class Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__CLASS_ORIGINAL = eINSTANCE.getRefine_ClassOriginal();

		/**
		 * The meta object literal for the '{@link mel.impl.GeneralizeImpl <em>Generalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.GeneralizeImpl
		 * @see mel.impl.MelPackageImpl#getGeneralize()
		 * @generated
		 */
		EClass GENERALIZE = eINSTANCE.getGeneralize();

		/**
		 * The meta object literal for the '<em><b>Class New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZE__CLASS_NEW = eINSTANCE.getGeneralize_ClassNew();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZE__CLASS = eINSTANCE.getGeneralize_Class();

		/**
		 * The meta object literal for the '{@link mel.impl.AddPropertyImpl <em>Add Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.AddPropertyImpl
		 * @see mel.impl.MelPackageImpl#getAddProperty()
		 * @generated
		 */
		EClass ADD_PROPERTY = eINSTANCE.getAddProperty();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__CLASS = eINSTANCE.getAddProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__PROPERTY = eINSTANCE.getAddProperty_Property();

		/**
		 * The meta object literal for the '{@link mel.impl.ModifyPropertyImpl <em>Modify Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.ModifyPropertyImpl
		 * @see mel.impl.MelPackageImpl#getModifyProperty()
		 * @generated
		 */
		EClass MODIFY_PROPERTY = eINSTANCE.getModifyProperty();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_PROPERTY__CLASS = eINSTANCE.getModifyProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_PROPERTY__PROPERTY = eINSTANCE.getModifyProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_PROPERTY__VALUE = eINSTANCE.getModifyProperty_Value();

		/**
		 * The meta object literal for the '{@link mel.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.ValueAssignmentImpl
		 * @see mel.impl.MelPackageImpl#getValueAssignment()
		 * @generated
		 */
		EClass VALUE_ASSIGNMENT = eINSTANCE.getValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getValueAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ASSIGNMENT__VALUE = eINSTANCE.getValueAssignment_Value();

		/**
		 * The meta object literal for the '{@link mel.impl.FilterPropertyImpl <em>Filter Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.FilterPropertyImpl
		 * @see mel.impl.MelPackageImpl#getFilterProperty()
		 * @generated
		 */
		EClass FILTER_PROPERTY = eINSTANCE.getFilterProperty();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_PROPERTY__CLASS = eINSTANCE.getFilterProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_PROPERTY__PROPERTY = eINSTANCE.getFilterProperty_Property();

		/**
		 * The meta object literal for the '{@link mel.impl.FilterClassImpl <em>Filter Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.FilterClassImpl
		 * @see mel.impl.MelPackageImpl#getFilterClass()
		 * @generated
		 */
		EClass FILTER_CLASS = eINSTANCE.getFilterClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CLASS__CLASS = eINSTANCE.getFilterClass_Class();

		/**
		 * The meta object literal for the '{@link mel.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.AddConstraintImpl
		 * @see mel.impl.MelPackageImpl#getAddConstraint()
		 * @generated
		 */
		EClass ADD_CONSTRAINT = eINSTANCE.getAddConstraint();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CONSTRAINT__CLASS = eINSTANCE.getAddConstraint_Class();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CONSTRAINT__CONSTRAINT = eINSTANCE.getAddConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CONSTRAINT__VALUE = eINSTANCE.getAddConstraint_Value();

		/**
		 * The meta object literal for the '{@link mel.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mel.impl.FilterConstraintImpl
		 * @see mel.impl.MelPackageImpl#getFilterConstraint()
		 * @generated
		 */
		EClass FILTER_CONSTRAINT = eINSTANCE.getFilterConstraint();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONSTRAINT__CLASS = eINSTANCE.getFilterConstraint_Class();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONSTRAINT__CONSTRAINT = eINSTANCE.getFilterConstraint_Constraint();

	}

} //MelPackage
