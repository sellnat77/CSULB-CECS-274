/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class adds items to a queue then removes the items in the order of FIFO
 */

package queueLab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueStore 
{
	private Scanner userInput = new Scanner(System.in);
	Queue<String> storeOne = new LinkedList<String>();
	Queue<String> storeTwo = new LinkedList<String>();	
	private int peopleToAdd;
	
	public void setPeopleToAdd(int A)
	{
		peopleToAdd = A;
	}
	public int getPeopleToAdd()
	{
		return peopleToAdd;
	}
	
	public void populateStores()
	{
		int k;
		
		this.setPeopleToAdd(3);
		
		for(k = 0; k < this.getPeopleToAdd(); k++)
		{
			System.out.println("Please enter a person to add to the first checkout line.");
			storeOne.add(userInput.nextLine());
		}	
		System.out.println("\n\tThe line for register one is: [front,...,back]"+storeOne.toString()+"\n");
		
		this.setPeopleToAdd(4);
		
		for(k = 0; k < this.getPeopleToAdd(); k++)
		{
			System.out.println("Please enter a person to add to the second checkout line.");
			storeTwo.add(userInput.nextLine());
		}	
		System.out.println("\n\tThe line for register two is: [front,...,back]"+storeTwo.toString()+"\n");
	}
	
	public void checkoutGuests()
	{
		int k,m;
		
		System.out.println("The line for register one is: [front,...,back]"+storeOne.toString());
		for(k = 0; k < 2; k++)
		{
			System.out.println(storeOne.remove()+" has checked out.");
			System.out.println("The line for register one is: [front,...,back]"+storeOne.toString());
		}		
		System.out.println(storeOne.remove()+" has checked out.");		
		
		System.out.println("\n\nThe line for register two is: [front,...,back]"+storeTwo.toString());
		for(m = 0; m < 3; m++)
		{
			System.out.println(storeTwo.remove()+" has checked out.");
			System.out.println("The line for register two is: [front,...,back]"+storeTwo.toString());
		}
		System.out.println(storeTwo.remove()+" has checked out.");		
	}
}
