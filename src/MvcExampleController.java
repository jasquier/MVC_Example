/* Name: John Squier
 * Date: 06 JUL 2016
 * File Name: MvcExampleController.java
 * Comments: - Work on the controller
 *           - The user sees the view but uses the controller
 *           - The controller manipulates the model's state
 * Concerns:
 */

import java.awt.event.*;

/** Javadoc comments needed */

public class MvcExampleController
{
	GuiView2 view;
    	MvcExampleModel model;

    	public MvcExampleController(GuiView2 v, MvcExampleModel m)
    	{
		view = v;
		model = m;
		view.addRadioButtonListener(new RadioButtonListener());
    	}

	// when the radio button is clicked update the model's
	// state
	class RadioButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			model.setRadioButtonSelected(
				view.radioButtonSelected());
		}
	}
    
}
