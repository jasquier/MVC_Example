/* Name: John Squier
 * Date: 06 JUL 2016
 * File Name: MvcExampleModel.java
 * Comments: - This is the model for the MvcExample
 *           - The model updates the view
 *           - The model's state is manipulated by the controller
 * Concerns: - Work on the model and write a driver to test it
 */

/** Javadoc comments needed */

// provide methods that the controller can use to update
// the state of the model i.e. its attributes
// when the attribute radioButtonSelected
// is changed, update the view
// by using methods of the view
public class MvcExampleModel
{
	boolean radioButtonSelected;	
	GuiView2 view;

    	// Constuctor
    	public MvcExampleModel(GuiView2 v)
    	{
		radioButtonSelected = false;
		view = v;
    	}


	public void setRadioButtonSelected(boolean selected)
	{
		radioButtonSelected = selected;

		if ( selected == true )
		{
			view.clearText();
			view.setTextClicked();
			view.setCheckBoxClicked();
		}		

		if ( selected == false )
		{
			view.clearText();
			view.setTextUnclicked();
			view.setCheckBoxUnclicked();
		}
	}
}
