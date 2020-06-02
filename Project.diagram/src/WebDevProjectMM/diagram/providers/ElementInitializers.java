/*
 * 
 */
package WebDevProjectMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
