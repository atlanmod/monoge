/**
 */
package mel.impl;

import mel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MelFactoryImpl extends EFactoryImpl implements MelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MelFactory init() {
		try {
			MelFactory theMelFactory = (MelFactory)EPackage.Registry.INSTANCE.getEFactory(MelPackage.eNS_URI);
			if (theMelFactory != null) {
				return theMelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MelPackage.MODEL: return createModel();
			case MelPackage.EXTENSION: return createExtension();
			case MelPackage.CREATE: return createCreate();
			case MelPackage.REFINE: return createRefine();
			case MelPackage.GENERALIZE: return createGeneralize();
			case MelPackage.ADD_PROPERTY: return createAddProperty();
			case MelPackage.MODIFY_PROPERTY: return createModifyProperty();
			case MelPackage.VALUE_ASSIGNMENT: return createValueAssignment();
			case MelPackage.FILTER_PROPERTY: return createFilterProperty();
			case MelPackage.FILTER_CLASS: return createFilterClass();
			case MelPackage.ADD_CONSTRAINT: return createAddConstraint();
			case MelPackage.FILTER_CONSTRAINT: return createFilterConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refine createRefine() {
		RefineImpl refine = new RefineImpl();
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalize createGeneralize() {
		GeneralizeImpl generalize = new GeneralizeImpl();
		return generalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddProperty createAddProperty() {
		AddPropertyImpl addProperty = new AddPropertyImpl();
		return addProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyProperty createModifyProperty() {
		ModifyPropertyImpl modifyProperty = new ModifyPropertyImpl();
		return modifyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAssignment createValueAssignment() {
		ValueAssignmentImpl valueAssignment = new ValueAssignmentImpl();
		return valueAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterProperty createFilterProperty() {
		FilterPropertyImpl filterProperty = new FilterPropertyImpl();
		return filterProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterClass createFilterClass() {
		FilterClassImpl filterClass = new FilterClassImpl();
		return filterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddConstraint createAddConstraint() {
		AddConstraintImpl addConstraint = new AddConstraintImpl();
		return addConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConstraint createFilterConstraint() {
		FilterConstraintImpl filterConstraint = new FilterConstraintImpl();
		return filterConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MelPackage getMelPackage() {
		return (MelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MelPackage getPackage() {
		return MelPackage.eINSTANCE;
	}

} //MelFactoryImpl
