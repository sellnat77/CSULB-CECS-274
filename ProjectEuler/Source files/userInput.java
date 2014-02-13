/**
 * @author Russell Tan
 *
 */

import java.util.Scanner;
public class userInput 
{
	Scanner userInput = new Scanner(System.in);
	
	public int getInt()
	{
		return userInput.nextInt();
	}
	
	public double getDouble()
	{
		return userInput.nextDouble();
	}
	
	public String getString()
	{
		return userInput.next();
	}
	
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
}
