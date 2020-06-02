/**
 */
package WebDevProjectMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index CRUD</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getIndexCRUD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R4IndexImpliesDetail'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R4IndexImpliesDetail='\n\t\t\t\t\tlet allDetailPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(DetailCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tallDetailPages->exists(p : CRUDPage | p.entity = self.entity)'"
 *        annotation="gmf.node label.text='IndexCRUD' color='203,115,92'"
 * @generated
 */
public interface IndexCRUD extends CRUDPage {
} // IndexCRUD
