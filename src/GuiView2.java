/* Name: John Squier
 * Date: 06 JUL 2016
 * File Name: GuiView2.java
 * Comments: - This is my GUI for my MvcExample
 *           - The user sees the view but uses the controller
 *           - The view is updated by the model
 * Concerns:
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** Javadoc comments needed */

public class GuiView2
{ 
    // Components
    	JFrame frame = new JFrame();
    	JPanel panel = new JPanel();
	JRadioButton radioButton = 
		new JRadioButton("Click Me!", false);
	JTextField text = 
		new JTextField("The button is unchecked",30);
	JCheckBox checkBox = 
		new JCheckBox("Radio Button Checked?", false);

    // Constructor
    public GuiView2()
    {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel.setBackground(Color.darkGray);

	panel.add(radioButton);
	panel.add(text);
        panel.add(checkBox);
        

	frame.getContentPane().add(panel);

	frame.setTitle("---MVC---");

	// @@@ Work with this line of code to make things look good
	// setSize(width, height)
	frame.setSize(450,90);

	frame.setVisible(true);
    }

	public boolean radioButtonSelected()
	{
		boolean selected = radioButton.isSelected();
		return selected;
	}
   
	public void clearText()
	{
		text.setText("");
	}
 
	public void setTextClicked()
	{
		text.setText("The button is checked");
	}

	public void setTextUnclicked()
	{
		text.setText("The button is unchecked");
	}
	
	public void setCheckBoxClicked()
	{
		checkBox.setSelected(true);
	}

	public void setCheckBoxUnclicked()
	{
		checkBox.setSelected(false);
	}

    // This sets up the radioButton listener for the controller
    void addRadioButtonListener(ActionListener l)
    {
	radioButton.addActionListener(l);
    }

}
