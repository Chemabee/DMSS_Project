/**
 */
package WebDevProjectMM.tests;

import WebDevProjectMM.DetailCRUD;
import WebDevProjectMM.WebDevProjectMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detail CRUD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailCRUDTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetailCRUDTest.class);
	}

	/**
	 * Constructs a new Detail CRUD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailCRUDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Detail CRUD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DetailCRUD getFixture() {
		return (DetailCRUD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebDevProjectMMFactory.eINSTANCE.createDetailCRUD());
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

} //DetailCRUDTest
