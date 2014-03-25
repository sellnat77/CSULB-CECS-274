/**
 *Name       : Russell Tan 
 *ID         : 011529945
 *Class      : CECS 274
 *Description: This is the calling program for the mortgage calculator frame
 */
package mortgageCalculator;

import javax.swing.JFrame;

public class mortgageCalculator
{
	public static void main(String[] args) 
	{
		//Instantiate the class mortgageFrame which contains the frame layout
		//of the program and has the action listener to do the calculations
		mortgageFrame getMyMortgage = new mortgageFrame();

		getMyMortgage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getMyMortgage.setVisible(true);
	}
}
