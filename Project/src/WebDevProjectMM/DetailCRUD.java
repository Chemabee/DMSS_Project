/**
 */
package WebDevProjectMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detail CRUD</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getDetailCRUD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R4DetailImpliesIndex'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R4DetailImpliesIndex='\n\t\t\t\t\tlet allIndexPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(IndexCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tallIndexPages->exists(p : CRUDPage | p.entity = self.entity)'"
 *        annotation="gmf.node label.text='DetailCRUD' color='203,115,92'"
 * @generated
 */
public interface DetailCRUD extends CRUDPage {
} // DetailCRUD
