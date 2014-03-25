/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class instantiates a double dim array
 * that only randomly assigns numbers in a triangular format
 * then it copies that array to another one and adds the two together
 */

package varLengthArrays;

import java.util.Scanner;

public class varLengthArrays
{
	varLengthArrays(){}
	
	public void askForSize()
	{
		int rows;
		System.out.println("Enter the size of the double dimension array");
		rows = userInput.nextInt();
		
		originalNumbers = new int[rows][rows];
		copiedNumbers   = new int[rows][rows];
	}
	
	public void fillArray()
	{
		int k,m, rando;
		
		for(k = 0; k < originalNumbers.length; k++)
		{
			for(m = 0; m < originalNumbers[0].length; m++)
			{
				rando = (int)(Math.random()*9)+1;
				
				if(m <= k)
				{
					originalNumbers[k][m] = rando;
				}
				else
				{
					break;
				}
			}			
		}
	}
	
	public void printArray(int arrayToPrint[][])
	{
		int k,m;
		
		for(k = 0; k < arrayToPrint.length; k++)
		{
			System.out.print("\t");
			for(m = 0; m < arrayToPrint[0].length; m++)
			{
				if(arrayToPrint[k][m] == 0)
				{
					System.out.print(" ");
				}
				else if(k == m)
				{
					System.out.format("%2d",arrayToPrint[k][m]);					
				}
				else
				{
					System.out.format("%2d,",arrayToPrint[k][m]);
				}
			}
			System.out.println("");
		}		
	}
	
	public void copyArray()
	{
		int k, m;
		
		for(k = 0; k < originalNumbers.length; k++)
		{
			for(m = 0; m < originalNumbers[0].length; m++)
			{				
				copiedNumbers[k][m] = originalNumbers[k][m];
			}			
		}		
	}	
	
	public void addArrays()
	{
		int k, m;
		
		for(k = 0; k < originalNumbers.length; k++)
		{
			for(m = 0; m < originalNumbers[0].length; m++)
			{				
				originalNumbers[k][m] += copiedNumbers[k][m];
			}			
		}	
	}
	
	public void doArrayOps()
	{
		this.askForSize();
		this.fillArray();
		this.copyArray();
		
		System.out.println("This is the original array after being filled:");
		this.printArray(originalNumbers);
		
		System.out.println("This is the copied array:");
		this.printArray(copiedNumbers);
		this.addArrays();
		
		System.out.println("This is the array after adding the copied array");
		this.printArray(originalNumbers);
	}
	
	Scanner userInput = new Scanner(System.in);
	private int originalNumbers[][] = new int[1][1];
	private int copiedNumbers  [][] = new int[1][1];
}
