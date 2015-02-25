/**
 */
package mel.tests;

import junit.textui.TestRunner;

import mel.MelFactory;
import mel.Refine;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefineTest extends ExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RefineTest.class);
	}

	/**
	 * Constructs a new Refine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Refine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Refine getFixture() {
		return (Refine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MelFactory.eINSTANCE.createRefine());
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

} //RefineTest
