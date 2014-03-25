package stringsAndChars;

import java.util.Arrays;
import java.util.Scanner;

public class stringCharManip 
{
	stringCharManip(){}
	
	public void setRandString(String str)
	{
		randString = str;
	}
	public void setSplitStringAt(int loc, char data)
	{
		splitString[loc] = data;
	}
	
	public String getRandString()
	{
		return randString;
	}
	public char[] getSplitString()
	{
		return splitString;
	}
	public char getSplitStringAt(int loc)
	{
		return splitString[loc];
	}
	
	public void askForString()
	{
		System.out.println("Enter the string you want to split and sort.");
		this.setRandString(userInput.nextLine());
		
		splitString = new char[this.getRandString().length()];
	}
	
	public void assignArray()
	{
		int k;
		
		for(k = 0; k < splitString.length; k++)
		{
			if(this.getRandString().charAt(k) != ' ')
			{
				this.setSplitStringAt(k, this.getRandString().charAt(k));
			}
			else
			{
				this.setSplitStringAt(k, '!');
			}
		}
	}
	
	public void sortArray()
	{
		Arrays.sort(splitString);
	}	
	
	public void printArray(char arrayToPrint[])
	{
		int k,count;
		count = 0;
		
		System.out.println("The char array is:");
		for(k = 0; k < arrayToPrint.length; k++)
		{
			if( arrayToPrint[k] == '!')
			{
				System.out.print("");
			}
			else if(k == 0)
			{
				System.out.format("%2d.) %s\t\n",(count+1),arrayToPrint[k]);
				count++;
			}
			else
			{
				System.out.format("%2d.) %s\t\n",(count+1),arrayToPrint[k]);
				count++;
			}
		}
	}	
	
	Scanner userInput = new Scanner(System.in);
	private String randString;
	private char[] splitString = new char[0];
}
