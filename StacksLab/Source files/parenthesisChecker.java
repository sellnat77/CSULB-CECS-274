import java.util.Scanner;


public class parenthesisChecker 
{
	private Scanner userInput = new Scanner(System.in);
	private String equation;
	
	
	parenthesisChecker(){}
	
	public void setEquation(String eq)
	{
		equation = eq;
	}
	
	public String getEquation()
	{
		return equation;
	}
	
	public boolean checkParens()
	{
		int k = 0;
		boolean balanced = false;
		char open = '(';
		char closed = ')';
		int openCount = 0;
		int closedCount = 0;
		
		while(k < this.getEquation().length())
		{
			if(this.getEquation().charAt(k)==open)
			{
				openCount++;
			}
			else if(this.getEquation().charAt(k)==closed)
			{
				closedCount++;
			}
			k++;
		}
		if(openCount == closedCount)
		{
			balanced = true;
		}		
		System.out.println(balanced);
		return balanced;
	}
	
	public boolean checkBracks()
	{
		int k = 0;
		boolean balanced = false;
		char open = '[';
		char closed = ']';
		int openCount = 0;
		int closedCount = 0;
		
		while(k < this.getEquation().length())
		{
			if(this.getEquation().charAt(k)==open)
			{
				openCount++;
			}
			else if(this.getEquation().charAt(k)==closed)
			{
				closedCount++;
			}
			k++;
		}
		if(openCount == closedCount)
		{
			balanced = true;
		}	
		System.out.println(balanced);
		return balanced;
	}

	public boolean checkCurlys()
	{
		int k = 0;
		boolean balanced = false;
		char open = '{';
		char closed = '}';
		int openCount = 0;
		int closedCount = 0;
		
		while(k < this.getEquation().length())
		{
			if(this.getEquation().charAt(k)==open)
			{
				openCount++;
			}
			else if(this.getEquation().charAt(k)==closed)
			{
				closedCount++;
			}
			k++;
		}
		if(openCount == closedCount)
		{
			balanced = true;
		}		
		System.out.println(balanced);
		return balanced;
	}
	
	public void checkAnEquation()
	{
		System.out.println("Please enter the equation to be checked.");
		this.setEquation(userInput.nextLine());
		if(this.checkBracks()&&this.checkCurlys()&&this.checkParens())
		{
			System.out.println("The parenthesis are balanced!");
		}
		else
		{
			System.out.println("Sorry");
		}
	}
}
