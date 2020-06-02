/**
 */
package WebDevProjectMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Question Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionType()
 * @model
 * @generated
 */
public enum QuestionType implements Enumerator {
	/**
	 * The '<em><b>MULTIPLE CHOICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICE(0, "MULTIPLE_CHOICE", "MULTIPLE_CHOICE"),

	/**
	 * The '<em><b>TRUE FALSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUE_FALSE(1, "TRUE_FALSE", "TRUE_FALSE"),

	/**
	 * The '<em><b>SHORT QUESTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_QUESTION(2, "SHORT_QUESTION", "SHORT_QUESTION");

	/**
	 * The '<em><b>MULTIPLE CHOICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE CHOICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICE_VALUE = 0;

	/**
	 * The '<em><b>TRUE FALSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUE FALSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUE_FALSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUE_FALSE_VALUE = 1;

	/**
	 * The '<em><b>SHORT QUESTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORT QUESTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT_QUESTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_QUESTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionType[] VALUES_ARRAY =
		new QuestionType[] {
			MULTIPLE_CHOICE,
			TRUE_FALSE,
			SHORT_QUESTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType get(int value) {
		switch (value) {
			case MULTIPLE_CHOICE_VALUE: return MULTIPLE_CHOICE;
			case TRUE_FALSE_VALUE: return TRUE_FALSE;
			case SHORT_QUESTION_VALUE: return SHORT_QUESTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QuestionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QuestionType
