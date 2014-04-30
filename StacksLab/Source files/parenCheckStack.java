/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class creates a char stack and checks if an equation's
 * parenthesis are balanced by adding the opening parenthesis to the stack
 * and pops them when the appropriate closing paren is found then equation is 
 * balanced when the stack is empty
 */
import java.util.Scanner;
import java.util.Stack  ;

public class parenCheckStack 
{
	private Scanner userInput = new Scanner(System.in);
	private String equation;
	
	parenCheckStack(){}
	
	public void setEquation(String eq)
	{
		equation = eq;
	}
	
	public String getEquation()
	{
		return equation;
	}
	
	public void checkAnEquation()
	{
		Stack<Character> myParenthesis = new Stack<Character>();
		int k;
		
		System.out.println("Please enter the equation to be checked.");
		this.setEquation(userInput.nextLine());		
		for(k = 0; k < this.getEquation().length(); k++)
		{
			char current = this.getEquation().charAt(k);
			
			if(current == '('||current =='{'||current =='[')
			{
				myParenthesis.push(current);				
			}
			else if(current == ')'||current =='}'||current ==']')
			{
				if(myParenthesis.isEmpty())
				{
					break;
				}
				
				char last = myParenthesis.peek();
				
				if(current == '}' && last == '{'||
				   current == ')' && last == '('||
			       current == ']' && last == '['  )
				{
					myParenthesis.pop();					
				}			
			}		
		}
		System.out.println("Balanced parenthesis: "+myParenthesis.isEmpty());
	}
}
