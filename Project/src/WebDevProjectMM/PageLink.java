/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.PageLink#getSource <em>Source</em>}</li>
 *   <li>{@link WebDevProjectMM.PageLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getPageLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='linkCanNotBeToItself'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot linkCanNotBeToItself='self.source <> self.target'"
 *        annotation="gmf.link source='source' target='target' target.decoration='filledclosedarrow' color='0,0,0'"
 * @generated
 */
public interface PageLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.WebPage#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WebPage)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getPageLink_Source()
	 * @see WebDevProjectMM.WebPage#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	WebPage getSource();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.PageLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WebPage value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.WebPage#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(WebPage)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getPageLink_Target()
	 * @see WebDevProjectMM.WebPage#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	WebPage getTarget();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.PageLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(WebPage value);

} // PageLink
