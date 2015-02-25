/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.FilterProperty;
import mel.MelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filter Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterPropertyTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilterPropertyTest.class);
	}

	/**
	 * Constructs a new Filter Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filter Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FilterProperty getFixture() {
		return (FilterProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createFilterProperty());
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

} //FilterPropertyTest
