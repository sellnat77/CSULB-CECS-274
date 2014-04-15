/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the parenthesis checker
 * it asks for the user to enter an equation then checks if it is balanced
 */
public class paranthesisCall 
{
	public static void main(String args[])
	{
		parenCheckStack check = new parenCheckStack();
		
		check.checkAnEquation();
	}

}
