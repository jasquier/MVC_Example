/* Name: John Squier
 * Date: 25 AUG 2009
 * File Name: CmdLineView.java
 * Comments: - Depreicated
 * Concerns: - Comment the code
 */

import java.io.*;

/** Javadoc comments needed */

public class CmdLineView {

    // Constructor
    public CmdLineView() { /* Initialize view */ }

    public void displayMenu()
    {
	System.out.println();
	System.out.println("--- Welcome to the decimal --> binary converter! ---");
	System.out.println();
    }

    public void displayExit()
    {
	System.out.println();
	System.out.println("It appears you have chosen to exit!");
	System.out.println("Goodbye!!!");
	System.out.println();
    }

    public int promptForDecimal()
    {
	System.out.print("Input an int or -1 to stop: ");

	String inputLine = null;

	try {
	BufferedReader is = new BufferedReader(
       	 new InputStreamReader(System.in));
	inputLine = is.readLine();
	} catch (IOException e) {
	    System.out.println("IOException: " + e);
	}

	return Integer.parseInt(inputLine);				       
    }

    public void displayBinary(int[] ia) {
	System.out.println();
	System.out.println("Here is your converted binary number!");
	System.out.println();

	for( int i = ia.length-1; i >= 0; i-- )
	    System.out.print(ia[i]);
	System.out.println();
	System.out.println();
    }

}
