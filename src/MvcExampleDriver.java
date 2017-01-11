/* Name: John Squier
 * Date: 06 JUL 2016
 * File Name: MvcExampleDriver.java
 * Comments: - This is the driver for the entire MvcExample program
 * Concerns:
 */

/** Javadoc comments needed */

public class MvcExampleDriver
{
    public static void main(String[] args)
    {
     	GuiView2 view = new GuiView2();
	MvcExampleModel model = new MvcExampleModel(view);
	MvcExampleController controller = 
		new MvcExampleController(view, model);
    }
}
