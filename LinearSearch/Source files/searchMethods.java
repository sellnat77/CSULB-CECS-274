/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class asks for the size of the array to be searched, the upper limit
 * and the number to search for, then it does a linear search for the number
 * then recursively calls upon itself if the user wants new values  
 */

import java.util.Scanner;


public class searchMethods 
{
	searchMethods(){}
	
	public void setSize(int s)
	{
		size = s;
	}
	public void setNumberToSearch(int n)
	{
		numberToSearch = n;
	}
	public void setUpperLm(int u)
	{
		upperLim = u;
	}
	public int getSize()
	{
		return size;
	}
	public int getNumberToSearch()
	{
		return numberToSearch;
	}
	public int getUpperLim()
	{
		return upperLim;
	}
	
	public void assignRandoms(int numbersToGen, int upperLim)
	{
		int k,i;
		
		this.setSize(numbersToGen);
		arrayToSearch = new int[this.getSize()];
		
		for(k = 0; k < arrayToSearch.length; k++)
		{
			arrayToSearch[k] = (int)(Math.random()*(upperLim+1));
		}
		
		for(i = 0; i < numbersToGen; i++)
		{
			if(i%5 == 0)
			{
				System.out.println("");
			}
			System.out.format("%3d.|%4d   |",(i+1),arrayToSearch[i]);
		}
		System.out.println("");
		
		
	}
	
	public void askForSize()
	{
		System.out.println("Please enter the size of the array to be searched:");
		this.setSize(userInput.nextInt());		
	}
	
	public void askForUpperLim()
	{
		System.out.println("Enter the upper limit of the numbers to be assigned");
		this.setUpperLm(userInput.nextInt());
	}
	
	public void askForDesiredNum()
	{
		System.out.println("Enter the number you want to search for:");
		this.setNumberToSearch(userInput.nextInt());
	}
	
	public void linearSearch()
	{
		long start, stop;
		int k,time;
		boolean foundNumber = false;
		
		start = System.nanoTime();
		
		for(k = 0; k < arrayToSearch.length; k++)
		{
			if(this.getNumberToSearch() == arrayToSearch[k])
			{
				foundNumber = true;
				
				stop = System.nanoTime();
				time = (int)((stop-start)/1000);
				System.out.println("\nYou found it! Index = " + (k+1));
				System.out.println("The linear search took " + time + " micro seconds.");
				//break;
			}
		}
		if(foundNumber == false)
		{
			stop = System.nanoTime();
			time = (int)((stop-start)/1000);
			System.out.println("The number you entered does not exist in the array.");
			System.out.println("The linear search took " + time + " micro seconds.");
		}
	}
	
	public void doLinearSearch()
	{
		String doOver;
		
		this.askForSize();
		this.askForUpperLim();
		this.assignRandoms(this.getSize(), this.getUpperLim());
		this.askForDesiredNum();
		this.linearSearch();
		
		System.out.println("Do you want to search again?");
		doOver = userInput.next();
		switch(doOver)
		{
			case "yes": 
				doLinearSearch();
				break;
			case "y": 
				doLinearSearch();
				break;
			default:
				break;
		}			
	}
	
	Scanner userInput = new Scanner(System.in); 
	private int size,numberToSearch,upperLim;
	private int arrayToSearch[] = new int [size];
}
