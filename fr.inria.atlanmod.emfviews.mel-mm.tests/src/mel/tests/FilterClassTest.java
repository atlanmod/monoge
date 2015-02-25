/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.FilterClass;
import mel.MelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filter Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterClassTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilterClassTest.class);
	}

	/**
	 * Constructs a new Filter Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filter Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FilterClass getFixture() {
		return (FilterClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createFilterClass());
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

} //FilterClassTest
