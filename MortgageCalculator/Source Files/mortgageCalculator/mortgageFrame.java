/**
 *Name       : Russell Tan 
 *ID         : 011529945
 *Class      : CECS 274
 *Description: This is the class that creates the visual display, creates 
 *			   the action listener, and adds it to the calculate button
 *             this class also instantiates the mortgageMath class and uses its
 *             methods to populate the monthly payments field as well as the 
 *             monthly payments text area
 */

package mortgageCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mortgageFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//default constructor that initializes the frame so that it is full screen
	public mortgageFrame()
	{
		//local row and col
		int row,col;
		
		//Use of the Toolkit to get the screen size of the machine being used
		Toolkit myTools = Toolkit.getDefaultToolkit();
		Dimension XY    = myTools.getScreenSize    ();
		
		//Assign the width and height to the local row and col variables
		row = XY.width ;
		col = XY.height;
		
		//Sets the size, title, and location of the main frame
		setSize    (row,col              );
		setTitle   ("Mortgage Calculator");
		setLocation(0,0                  );
		
		//Create two fonts to be utilized later on
		Font Large  = new Font("Serif",Font.BOLD,75);
		Font Medium = new Font("Serif",Font.BOLD,30);
		
		//Align the text in the text fields horizontally
		mortgageLoan.setHorizontalAlignment(JTextField.CENTER);
		interestRate.setHorizontalAlignment(JTextField.CENTER);
		loanTerm 	.setHorizontalAlignment(JTextField.CENTER);
		
		//Set the text size of the three input text fields to "large"
		mortgageLoan.setFont(Large);
		interestRate.setFont(Large);
		loanTerm 	.setFont(Large);
		
		//Set the text size of the two output text field+area to "medium" and 
		//"large"
		monthlyPayments     .setFont(Medium);
		finalMonthlyPayments.setFont(Large );
		
		//Sets the text size of all of the labels to "medium"
		mortgage  .setFont(Medium);
		interest  .setFont(Medium);
		term      .setFont(Medium);
		estMonthly.setFont(Medium);
		
		//Sets the text size of the button to "large"
		calculateMonthly.setFont(Large);		
		
		//creates the main layout for the main frame of a grid with 1 row 2 col
		setLayout(new GridLayout(1,2));	
		
		//Creates the layouts for the other panels of grids with varying rows 
		//and cols
		mainLeft    .setLayout(new GridLayout(2,1));
		leftValues  .setLayout(new GridLayout(3,2));
		mainRight   .setLayout(new GridLayout(2,1));
		rightMonthly.setLayout(new GridLayout(1,2));
		
		//Adds the text fields and labels to the top left panel
		leftValues.add(mortgageLoan);
		leftValues.add(mortgage    );	
		leftValues.add(interestRate);
		leftValues.add(interest    );	
		leftValues.add(loanTerm    );
		leftValues.add(term        );
		
		//Adds the final monthly payment text field and label to the bottom 
		//right panel
		rightMonthly.add(finalMonthlyPayments);
		rightMonthly.add(estMonthly          );

		//Adds the leftValues panel and the calculate button to the main left 
		//panel
		mainLeft.add(leftValues      );
		mainLeft.add(calculateMonthly);
		
		//Adds the textarea and bottom right panel to the main right panel
		mainRight.add(scroll      );
		mainRight.add(rightMonthly);
		
		//Adds the main right and left panels to the main visible panel 
		add(mainLeft );
		add(mainRight);
		
		//Create and assign the action listener to the calculate button
		actionCalculate calcButton = new actionCalculate();
		calculateMonthly.addActionListener(calcButton);		
	}	
	
	//Action listener class for the calculate button
	private class actionCalculate implements ActionListener
	{
		public void actionPerformed(ActionEvent clicked)
		{
			//local variables used for calculations
			int years,k;
			double interest;
			double balance;
			String payments;
			
			//Assigns the values in the text fields to the local variables	
			years    = Integer.parseInt  (loanTerm    .getText());
			interest = Double.parseDouble(interestRate.getText());
			balance  = Double.parseDouble(mortgageLoan.getText());
			
			//Instantiate the mortgageMath class with the full constructor 
			//populated with the values from the text fields
			mortgageMath performCalc = new mortgageMath(years,balance,interest);
			
			//Converts the double value of the monthly payments into a 
			//string value so that it can be added to the text field and be 
			//formatted using the .substring method
			payments = String.valueOf(performCalc.calculateMonthlyPayments());
			
			//Sets the final monthly payment text field with the appropriate 
			//value
			finalMonthlyPayments.setText(("$"+payments).substring(0,7));
			
			//Starts the text area with the beginning balance
			monthlyPayments.setText("Your beginning balance is: $" + balance);
			
			//For loop to print out how much is due after each payment
			for(k = 0; k < performCalc.getLoanTerm()-1; k++)
			{				
				//Subtracts one payment of the corresponding mo. payment
				//re-assigns it to the balance
				balance = (balance+(balance*performCalc.getInterestRate()))
						  -performCalc.calculateMonthlyPayments();
				
				//appends the remaining balance with a "\n" operator to move to
				//the next line of the text area
				monthlyPayments.append("\nAfter payment #" +(k+1)+ " you owe $" 
						        + String.valueOf(balance).substring(0,9) + ".");
			}
			
			//Shows that the loan is paid off after x payments
			monthlyPayments.append("\nAfter payment #"+performCalc.getLoanTerm()
					                 +" you owe $000000.00.");			
		}
	}	
	
	//Various panels needed to achieve desired layout 
	JPanel mainLeft     = new JPanel();
	JPanel mainRight    = new JPanel();
	JPanel leftValues   = new JPanel();
	JPanel rightMonthly = new JPanel();
	
	//Text fields populated with default values they are editable now but can be 
	//changed to uneditable if need be.
	JTextField mortgageLoan         = new JTextField("100000");
	JTextField interestRate         = new JTextField("5"     );
	JTextField loanTerm             = new JTextField("15"    );
	JTextField finalMonthlyPayments = new JTextField(        );

	//Text area used in order to add a scrollable element to the text area
	//to properly display the payments decrease as a payment is made
	JTextArea monthlyPayments = new JTextArea();
	
	//Labels instantiated with values to describe the text fields
	JLabel mortgage   = new JLabel("Mortage Loan"         );
	JLabel interest   = new JLabel("Interest Rate"        );
	JLabel term       = new JLabel("Loan term"            );
	JLabel estMonthly = new JLabel("Youre monthly payment");
	
	//Scroll panel that adds the monthly payments text area to add scrolling 
	//functionality
	JScrollPane scroll = new JScrollPane (monthlyPayments,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
	
	//Button used to calculate by use of an action listener
	JButton calculateMonthly = new JButton("Calculate!");
}
