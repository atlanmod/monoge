/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.MelFactory;
import mel.ModifyProperty;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifyPropertyTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifyPropertyTest.class);
	}

	/**
	 * Constructs a new Modify Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modify Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModifyProperty getFixture() {
		return (ModifyProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createModifyProperty());
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

} //ModifyPropertyTest
