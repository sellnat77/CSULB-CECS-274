/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: this is the calling program for the person class
 * it creates an array lists and adds 4 people with corresponding ID's 
 * then adds another person then deletes a person from the list
 * lastly, it searches for a person within the list
 */

package arrayListsHW;

import java.util.*;

public class arrayListsHWCall
{
	public static void main(String theory[])
	{
		int k;
		String nameToSearch;
		Scanner userInput = new Scanner(System.in);

		ArrayList<person> people = new ArrayList<person>();

		people.add(new person(1001,"Russell"));
		people.add(new person(1002,"Jeimmi" ));
		people.add(new person(1003,"Jose"   ));
		people.add(new person(1004,"Bailey" ));

		for(k = 0; k < people.size(); k++)
		{
			System.out.print("Index: "+k + "\t");
			people.get(k).displayInfo();
		}
		System.out.println("\t\tSize = "+people.size());

		System.out.print("\n\nAdding a new person and ID at index 2\n\n");
		people.add(2,new person(1005,"Charles"));

		for(k = 0; k < people.size(); k++)
		{
			System.out.print("Index: "+k + "\t");
			people.get(k).displayInfo();
		}
		System.out.println("\t\tSize = "+people.size());

		System.out.print("\n\nRemoving a person from index 0\n\n");
		people.remove(0);

		for(k = 0; k < people.size(); k++)
		{
			System.out.print("Index: "+k + "\t");
			people.get(k).displayInfo();
		}
		System.out.println("\t\tSize = "+people.size());

		System.out.println("What name do you want to search for?");
		nameToSearch = userInput.next();

		boolean flag = false;
		for(k = 0; k < people.size(); k++)
		{
			if(people.get(k).getPersName().equals(nameToSearch))
			{
				System.out.println("You found it at index: " + k);
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println("Name not found!");
		}
	}
}