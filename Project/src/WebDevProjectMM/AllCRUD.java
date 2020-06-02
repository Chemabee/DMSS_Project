/**
 */
package WebDevProjectMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All CRUD</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getAllCRUD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R3ALLCRUDImpliesNoOtherCRUD onlyOneCRUDOfEachTypeMax'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R3ALLCRUDImpliesNoOtherCRUD='\n\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n\t\t\t\t\t\tnotALLCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->select(p : CRUDPage | not p.oclIsKindOf(AllCRUD))\n\t\t\t\t\tin\n\t\t\t\t\t\tnotALLCRUDTypePages->size() = 0' onlyOneCRUDOfEachTypeMax='\n\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n\t\t\t\t\t\tAllCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(AllCRUD),\n\t\t\t\t\t\tIndexCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(IndexCRUD),\n\t\t\t\t\t\tDetailCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DetailCRUD),\n\t\t\t\t\t\tCreationCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(CreationCRUD),\n\t\t\t\t\t\tDelitionCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DelitionCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tAllCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tDetailCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tIndexCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tCreationCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tDelitionCRUDTypePages->size() < 2\n\t\t\t\t\t'"
 *        annotation="gmf.node label.text='AllCRUD' color='203,115,92'"
 * @generated
 */
public interface AllCRUD extends CRUDPage {
} // AllCRUD
