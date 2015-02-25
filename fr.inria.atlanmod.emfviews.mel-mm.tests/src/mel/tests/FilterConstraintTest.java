/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.FilterConstraint;
import mel.MelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filter Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterConstraintTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilterConstraintTest.class);
	}

	/**
	 * Constructs a new Filter Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filter Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FilterConstraint getFixture() {
		return (FilterConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createFilterConstraint());
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

} //FilterConstraintTest
