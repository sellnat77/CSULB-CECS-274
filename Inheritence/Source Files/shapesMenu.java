/**
 * Name:Russell Tan
 * Class: CECS274
 * Description: This is the shapes menu class which instantiates a shape
 * object based on the users input 
 */

import java.util.Scanner;

public class shapesMenu 
{
	shapesMenu(){}
	
	public void setUserChoice(int choice)
	{
		userChoice = choice;
	}
	
	public int getUserChoice()
	{
		return userChoice;
	}
	
	public void printBaseMenu()
	{
		System.out.println("Welcome to the shape inheritence program, "
				            + "you can instantiate these shapes:\n");
		
		System.out.println  ("\t1.)Triangle"    );
		System.out.println  ("\t2.)Circle"      );
		System.out.println  ("\t3.)Sphere"      );
		System.out.println  ("\t4.)Rhombus"     );
		System.out.println  ("\t5.)Star"        );
		System.out.println  ("\t6.)Exit program");
		this.promptForChoice(                   );
	}
	
	public void shapeChooser(int choose)
	{
		boolean exit = false;
		switch(choose)
		{
			case 1:
				triangle myTri = new triangle(1);
				myTri.showInfo();
				break;
				
			case 2:
				circle myCirc = new circle(1);
				myCirc.showInfo();
				break;
				
			case 3:
				sphere mySphere = new sphere();
				mySphere.showInfo();
				break;
				
			case 4:
				rhombus myRhom = new rhombus();
				myRhom.showInfo();
				break;
				
			case 5:
				star myStar = new star();
				myStar.showInfo();
				break;
				
			default:
				exit = true;
				break;				
		}
		if(exit)
		{
			System.out.println("You have exited the program.");
		}
		else
		{
			this.printBaseMenu();
			this.shapeChooser(this.getUserChoice());
		}		
	}
	
	public void promptForChoice()
	{
		System.out.print("\nWhich shape would you like to instantiate? ");
		this.setUserChoice(userInput.nextInt());
	}
	
	Scanner userInput = new Scanner(System.in);
	private int userChoice;
}
