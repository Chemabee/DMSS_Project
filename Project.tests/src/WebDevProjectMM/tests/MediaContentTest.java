/**
 */
package WebDevProjectMM.tests;

import WebDevProjectMM.MediaContent;
import WebDevProjectMM.WebDevProjectMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Media Content</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaContentTest extends ElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MediaContentTest.class);
	}

	/**
	 * Constructs a new Media Content test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaContentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Media Content test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MediaContent getFixture() {
		return (MediaContent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebDevProjectMMFactory.eINSTANCE.createMediaContent());
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

} //MediaContentTest
