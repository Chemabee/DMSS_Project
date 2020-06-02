/**
 */
package WebDevProjectMM.tests;

import WebDevProjectMM.CreationCRUD;
import WebDevProjectMM.WebDevProjectMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Creation CRUD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreationCRUDTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreationCRUDTest.class);
	}

	/**
	 * Constructs a new Creation CRUD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationCRUDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Creation CRUD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreationCRUD getFixture() {
		return (CreationCRUD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebDevProjectMMFactory.eINSTANCE.createCreationCRUD());
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

} //CreationCRUDTest
