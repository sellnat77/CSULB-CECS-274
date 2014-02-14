/**
 * @author Russell Tan
 *
 */

import java.util.Scanner;
public class userInput 
{
	//Initialize the Scanner
	Scanner userInput = new Scanner(System.in);
	
	//Returns an integer
	public int getInt()
	{
		return userInput.nextInt();
	}
	
	//Returns a double value
	public double getDouble()
	{
		return userInput.nextDouble();
	}
	
	//Returns a long value
	public long getLong()
	{
		return userInput.nextLong();
	}
	
	//Returns a string
	public String getString()
	{
		return userInput.next();
	}
	
	//Returns an array of however many integers you want
	public int[] getInts(int howMany)
	{
		int k;
		int intArray[] = new int[howMany];
		for( k = 0; k < howMany; k++)
		{
			intArray[k] = userInput.nextInt();
		}
		return intArray;		
	}
	
	//Returns an array of however many double values you want
	public double[] getDoubles(int howMany)
	{
		int k;
		double doubleArray[] = new double[howMany];
		for( k = 0; k < howMany; k++)
		{
			doubleArray[k] = userInput.nextInt();
		}
		return doubleArray;		
	}
	
	//Returns an array of strings
	public String[] getStrings(int howMany)
	{
		int k;
		String stringArray[] = new String[howMany];
		for ( k = 0; k < howMany; k++)
		{
			stringArray[k] = userInput.next();
		}
		return stringArray;
	}
}
