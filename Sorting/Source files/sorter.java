/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class assigns the private array using an outside array
 * 				it also sorts the array in descending order
 * 				and gets and displays the location of the smallest value 
 */
import java.util.*;

public class sorter
{
	sorter(){}
	
	public int[] getArray()
	{
		return theArray;
	}
	
	public void setTheArray(int loc, int val)
	{
		theArray[loc] = val;
	}
	
	public void assignArray(int loc, int val)
	{
		this.setTheArray(loc,val);				
	}
	
	//Gets the location of the smallest value as displayed on the console
	public int getSmallestNumberLoc()
	{
		int k,location;		
		int smallestNum = theArray[0];
		location = 0;
		
		for(k = 0; k < theArray.length; k++)
		{
			if(smallestNum > theArray[k])
			{
				smallestNum = theArray[k];
				location = k+1;						
			}			
		}
		return location;
	}
	
	public void printTheArray(int size)
	{
		int k;
		for(k = 0; k < size; k++)
		{
			System.out.println((k+1)+".) " + theArray[k]);
		}
	}
	
	//Sorts array based on swapping method
	public void sortTheArray()
	{
		long start,stop;
		int k,swap,time;
		boolean notSorted;
		
		//Allows while loop to begin 
		notSorted = true;
		start = System.nanoTime();
		while(notSorted)
		{
			//Prevents an infinite loop
			notSorted = false;
			
			for (k = 0; k < theArray.length-1; k++)
			{
				//If the current value is less than the next value,
				//swap them and change the boolean back to true to loop
				//through again
				if(theArray[k] < theArray[k+1])
				{
					swap= theArray[k];
					theArray[k] = theArray[k+1];
					theArray[k+1] = swap;

					notSorted = true;
				}
			}			
		}
		stop = System.nanoTime();
		time = (int)((stop-start)/1000);
		System.out.println("Selection took " + time + " micro seconds.");
	}
	
	public void insertSort()
	{
		long start,stop;
		int k,j,value,time;
		
		start = System.nanoTime();
		for(k = 0; k < theArray.length; k++)
		{
			value = theArray[k];
			j = k-1;
			while(j > -1 && theArray[j] < value)
			{
				theArray[j+1] = theArray[j];
				j -= 1;
			}
			theArray[j+1] = value;				
		}	
		stop = System.nanoTime();
		time = (int)((stop-start)/1000);
		System.out.println("Insertion took " + time + " micro seconds.");
	}
	
	public void quickSort(int array[])
	{
		List<Integer> pivots      = new ArrayList<Integer>();
		pivots.add(array[array.length/2]);
		
	}
	private int theArray[] = new int[10];
}
