/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: this is the calling program for the happy number calculator
 * it asks for user input and assigns that number to the checkIfHappy()
 * method
 */
public class happyCaller
{
	public static void main(String[] args) 
	{
		happyNumberCalc number = new happyNumberCalc();
		
		number.askForNumber();
		
		number.checkIfHappy(number.getNumber());
	}
}
