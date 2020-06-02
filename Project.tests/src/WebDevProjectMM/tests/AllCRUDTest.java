/**
 */
package WebDevProjectMM.tests;

import WebDevProjectMM.AllCRUD;
import WebDevProjectMM.WebDevProjectMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>All CRUD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllCRUDTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllCRUDTest.class);
	}

	/**
	 * Constructs a new All CRUD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllCRUDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this All CRUD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllCRUD getFixture() {
		return (AllCRUD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebDevProjectMMFactory.eINSTANCE.createAllCRUD());
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

} //AllCRUDTest
