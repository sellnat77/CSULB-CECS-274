/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the linked list class which contains the list
 * it has methods to add elements to a list of objects as well as 
 * insertions and deletions. It can also check if an element is present 
 * and print the entire list 
 * This class also inherits the russellLink class to instantiate the 
 * objects to be added to the list
 */

import java.util.LinkedList;

public class russellLinkedList extends russellLink
{
	russellLink first = new russellLink();
	LinkedList<russellLink> theList = new LinkedList<russellLink>();
	
	russellLinkedList(){}
	
	//Sets the first element
	public void setFirstNode()
	{
		first = new russellLink("Russell",1001);
		theList.add(first);
	}
	
	//Adds an element at the end of the list
	public void addElement(String name, int ID)
	{
		russellLink newPerson = new russellLink(name,ID);
		
		theList.add(newPerson);		
	}
	
	//Inserts an element at the beginning of the list
	public void insertAtBeginning(String nameToAdd, int newID)
	{
		super.setNext(nameToAdd,newID);
		theList.push(super.getNext());
	}
	
	//Inserts an element after a specified name in the list
	public void insertAfter(String nameToSearch, String nameToAdd, int newID)
	{
		super.setNext(nameToAdd,newID);
		int k;
		for(k = 0; k < theList.size(); k++)
		{
			if(theList.get(k).getName()==nameToSearch)
			{
				theList.add((k+1),super.getNext());
				break;
			}			
		}			
	}
	
	//Checks if a name is present in the list
	public void isPresent(String nameToSearch)
	{
		int k;
		boolean found = false;
		
		System.out.println("\tSearching for "+nameToSearch+
							" within the list...");
		
		for(k = 0; k < theList.size(); k++)
		{
			if(theList.get(k).getName()==nameToSearch)
			{
				System.out.println("\tYes, "+nameToSearch+
									" is present at index:"+k);
				found = true;
				break;
			}
		}		
		if(!found)
		{
			System.out.println("\t"+nameToSearch+
								" was not found within the list\n");
		}
	}
	
	//Deletes an object based on a specified name
	public void delete(String nameToSearch)
	{
		int k;
		System.out.println("\n\n\tDeleting "+nameToSearch+
							" from the list...\n\n");
		
		for(k = 0; k < theList.size(); k++)
		{
			if(theList.get(k).getName()==nameToSearch)
			{
				theList.remove(k);
				break;
			}
		}		
	}
	
	//Prints the entire list
	public void printList()
	{
		int k;
		for(k = 0; k < theList.size(); k++)
		{
			System.out.println("Index: " +k+".) "+theList.get(k).getID()+", "+
								theList.get(k).getName());
		}
		System.out.println("\n");
	}
}