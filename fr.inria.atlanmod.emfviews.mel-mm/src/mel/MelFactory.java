/**
 */
package mel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mel.MelPackage
 * @generated
 */
public interface MelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MelFactory eINSTANCE = mel.impl.MelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refine</em>'.
	 * @generated
	 */
	Refine createRefine();

	/**
	 * Returns a new object of class '<em>Generalize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalize</em>'.
	 * @generated
	 */
	Generalize createGeneralize();

	/**
	 * Returns a new object of class '<em>Add Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Property</em>'.
	 * @generated
	 */
	AddProperty createAddProperty();

	/**
	 * Returns a new object of class '<em>Modify Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Property</em>'.
	 * @generated
	 */
	ModifyProperty createModifyProperty();

	/**
	 * Returns a new object of class '<em>Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Assignment</em>'.
	 * @generated
	 */
	ValueAssignment createValueAssignment();

	/**
	 * Returns a new object of class '<em>Filter Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Property</em>'.
	 * @generated
	 */
	FilterProperty createFilterProperty();

	/**
	 * Returns a new object of class '<em>Filter Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Class</em>'.
	 * @generated
	 */
	FilterClass createFilterClass();

	/**
	 * Returns a new object of class '<em>Add Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Constraint</em>'.
	 * @generated
	 */
	AddConstraint createAddConstraint();

	/**
	 * Returns a new object of class '<em>Filter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Constraint</em>'.
	 * @generated
	 */
	FilterConstraint createFilterConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MelPackage getMelPackage();

} //MelFactory
