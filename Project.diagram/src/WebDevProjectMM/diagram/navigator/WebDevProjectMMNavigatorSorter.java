/*
* 
*/
package WebDevProjectMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class WebDevProjectMMNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7018;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7017;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) {
			WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem item = (WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
