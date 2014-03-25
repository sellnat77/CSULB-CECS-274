/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class recursively enters a number to get square rooted
 * then rounds the result and finds the root of that number 
 */

import java.util.Scanner;


public class squareCalc 
{
	
	public void setNumToRoot(int root)
	{
		numToRoot = root;
	}
	
	public int getNumToRoot()
	{
		return numToRoot;
	}
	
	public void askForRoot()
	{
		System.out.println("What number do you want to find the square root?");
		this.setNumToRoot((int)(userInput.nextDouble()));
	}
	
	public void findRoot(double root)
	{
		double temp;
		
		if(root >= 1 && root <2)
		{
			System.out.println("Root is 1");
		}
		else if(root <1 && root >= 0)
		{
			System.out.println("Root is 0");
		}
		else
		{
			temp = Math.sqrt(root);
			System.out.format("Intermediate square root is : %3.5f\n ",temp);
			System.out.format("\tThe rounded value is:%2d\n\n",(int)(temp));
			findRoot((int)(temp));
		}		
	}
	
	public void performOps()
	{
		this.askForRoot();
		this.findRoot(this.getNumToRoot());
	}
	
	Scanner userInput = new Scanner(System.in);
	private int numToRoot;

}
