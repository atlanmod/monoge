/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.AddConstraint;
import mel.MelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddConstraintTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddConstraintTest.class);
	}

	/**
	 * Constructs a new Add Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddConstraint getFixture() {
		return (AddConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createAddConstraint());
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

} //AddConstraintTest
