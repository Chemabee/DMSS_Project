/**
 */
package WebDevProjectMM.tests;

import WebDevProjectMM.QuestionsRepo;
import WebDevProjectMM.WebDevProjectMMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Questions Repo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionsRepoTest extends TestCase {

	/**
	 * The fixture for this Questions Repo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionsRepo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionsRepoTest.class);
	}

	/**
	 * Constructs a new Questions Repo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsRepoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Questions Repo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuestionsRepo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Questions Repo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionsRepo getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebDevProjectMMFactory.eINSTANCE.createQuestionsRepo());
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

} //QuestionsRepoTest
