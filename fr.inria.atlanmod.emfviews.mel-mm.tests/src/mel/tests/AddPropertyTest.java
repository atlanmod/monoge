/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.AddProperty;
import mel.MelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddPropertyTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddPropertyTest.class);
	}

	/**
	 * Constructs a new Add Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddProperty getFixture() {
		return (AddProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createAddProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AddPropertyTest
