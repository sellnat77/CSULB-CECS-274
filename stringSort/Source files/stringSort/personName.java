/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This is the person name class which instantiates a person 
 * and asks for their name then, prints it out
 */
package stringSort;

import java.util.Scanner;

public class personName
{
	personName(){}
	
	public void setPersonName(String name)
	{
		personName = name;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	
	public void askForName()
	{
		System.out.print("Please enter your name:");
		this.setPersonName(userInput.next());
		System.out.println("");
	}
	
	Scanner userInput = new Scanner(System.in);	
	private String personName;
}
