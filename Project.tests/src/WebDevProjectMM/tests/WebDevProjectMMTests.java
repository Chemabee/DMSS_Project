/**
 */
package WebDevProjectMM.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>WebDevProjectMM</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDevProjectMMTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new WebDevProjectMMTests("WebDevProjectMM Tests");
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(FormTest.class);
		suite.addTestSuite(StoredQuestionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMTests(String name) {
		super(name);
	}

} //WebDevProjectMMTests
