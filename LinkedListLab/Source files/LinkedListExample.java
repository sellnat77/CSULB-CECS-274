import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListExample 
{
	Scanner userInput = new Scanner(System.in);
	
	LinkedList <String> origNames = new LinkedList<String>();
	LinkedList <String> newNames = new LinkedList<String>(); 	
	LinkedListExample(){}
	
	int getANumber()
	{
		return userInput.nextInt();
	}
	
	void askForNames()
	{
		int k,limit;
		System.out.println("How many names do you want to add to the list?");
		limit = this.getANumber();
		
		for( k = 0; k < limit; k++)
		{
			System.out.println("Enter a name:");
			origNames.add(userInput.next());
		}
		for( k = 0; k < limit; k++)
		{
			System.out.println(k+".) "+origNames.get(k));
		}
	}
	
	void insertName()
	{
		int loc;
		System.out.println("Where do you want to add a name?");
		loc = this.getANumber();
		System.out.println("What name do you want to add?");
		origNames.add(loc, userInput.next());
	}
	
	void deleteNameLocation()
	{
		int loc;
		System.out.println("Which index do you want to delete?");
		loc = this.getANumber();
		newNames = origNames;
		
		newNames.remove(loc);
		this.printLList(newNames);
	}
	
	void deleteNameMatch()
	{
		String name;
		newNames = origNames;
		System.out.println("What name do you want to delete?");
		name = userInput.next();
		
		newNames.removeFirstOccurrence(name);

		this.printLList(newNames);
	}
	
	void printLList(LinkedList<String> listToPrint)
	{
		int k;
		
		for(k = 0; k < listToPrint.size(); k++)
		{
			System.out.println(k+".) " + listToPrint.get(k));
		}		
	}
}
