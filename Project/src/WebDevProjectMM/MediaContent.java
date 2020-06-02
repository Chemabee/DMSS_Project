/**
 */
package WebDevProjectMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.MediaContent#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getMediaContent()
 * @model annotation="gmf.node label='link' color='164,74,63'"
 * @generated
 */
public interface MediaContent extends Elements {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getMediaContent_Link()
	 * @model required="true"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.MediaContent#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // MediaContent
