
/*
 * 
 */
package WebDevProjectMM.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class WebDevProjectMMPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(WebDevProjectMM.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAllCRUD1CreationTool());
		paletteContainer.add(createCreationCRUD2CreationTool());
		paletteContainer.add(createDelitionCRUD3CreationTool());
		paletteContainer.add(createDetailCRUD4CreationTool());
		paletteContainer.add(createForm5CreationTool());
		paletteContainer.add(createIndexCRUD6CreationTool());
		paletteContainer.add(createMediaContent7CreationTool());
		paletteContainer.add(createPossibleAsnwer8CreationTool());
		paletteContainer.add(createQuestionDefinition9CreationTool());
		paletteContainer.add(createRegularContentPage10CreationTool());
		paletteContainer.add(createRole11CreationTool());
		paletteContainer.add(createSocialNetworkContent12CreationTool());
		paletteContainer.add(createStoredQuestion13CreationTool());
		paletteContainer.add(createText14CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				WebDevProjectMM.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createPageLink1CreationTool());
		paletteContainer.add(createRefersTo2CreationTool());
		paletteContainer.add(createWebpage3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAllCRUD1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.AllCRUD1CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.AllCRUD1CreationTool_desc,
				Collections.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003));
		entry.setId("createAllCRUD1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCreationCRUD2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.CreationCRUD2CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.CreationCRUD2CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001));
		entry.setId("createCreationCRUD2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelitionCRUD3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.DelitionCRUD3CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.DelitionCRUD3CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002));
		entry.setId("createDelitionCRUD3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetailCRUD4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.DetailCRUD4CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.DetailCRUD4CreationTool_desc, Collections
						.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005));
		entry.setId("createDetailCRUD4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForm5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.Form5CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.Form5CreationTool_desc,
				Collections.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007));
		entry.setId("createForm5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndexCRUD6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.IndexCRUD6CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.IndexCRUD6CreationTool_desc, Collections
						.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004));
		entry.setId("createIndexCRUD6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMediaContent7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.MediaContent7CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.MediaContent7CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002));
		entry.setId("createMediaContent7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPossibleAsnwer8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.PossibleAsnwer8CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.PossibleAsnwer8CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006));
		entry.setId("createPossibleAsnwer8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuestionDefinition9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.QuestionDefinition9CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.QuestionDefinition9CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005));
		entry.setId("createQuestionDefinition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getImageDescriptor(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRegularContentPage10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.RegularContentPage10CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.RegularContentPage10CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006));
		entry.setId("createRegularContentPage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getImageDescriptor(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRole11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.Role11CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.Role11CreationTool_desc,
				Collections.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008));
		entry.setId("createRole11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocialNetworkContent12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.SocialNetworkContent12CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.SocialNetworkContent12CreationTool_desc,
				Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003));
		entry.setId("createSocialNetworkContent12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getImageDescriptor(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStoredQuestion13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.StoredQuestion13CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.StoredQuestion13CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.StoredQuestion_3004));
		entry.setId("createStoredQuestion13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.StoredQuestion_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WebDevProjectMM.diagram.part.Messages.Text14CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.Text14CreationTool_desc,
				Collections.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001));
		entry.setId("createText14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPageLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WebDevProjectMM.diagram.part.Messages.PageLink1CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.PageLink1CreationTool_desc,
				Collections.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001));
		entry.setId("createPageLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRefersTo2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WebDevProjectMM.diagram.part.Messages.RefersTo2CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.RefersTo2CreationTool_desc, Collections.singletonList(
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.EntityRefersTo_4003));
		entry.setId("createRefersTo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.EntityRefersTo_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWebpage3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WebDevProjectMM.diagram.part.Messages.Webpage3CreationTool_title,
				WebDevProjectMM.diagram.part.Messages.Webpage3CreationTool_desc, Collections
						.singletonList(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002));
		entry.setId("createWebpage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes
				.getImageDescriptor(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
