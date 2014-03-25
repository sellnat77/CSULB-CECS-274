/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class creates an array list and adds/deletes/prints/copies
 * names  
 */

package arrayListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayPeople 
{
	arrayPeople(){}
	
	public void setPersonName(String name)
	{
		personName = name;		
	}
	
	public String getPersonName()
	{
		return personName;
	}
	
	public void setUser()
	{
		System.out.println("What is your name?");
		this.setPersonName(userInput.nextLine());
		people.add(this.getPersonName());
	}
	public void addNames()
	{
		int k, namesToAdd;
		String name;
		
		System.out.println("How many names do you want to add?");
		namesToAdd = userInput.nextInt();
			
		System.out.println("Enter the names: ");
		name = userInput.nextLine();
		for(k = 0; k < namesToAdd; k++)
		{
			name = userInput.nextLine();
			people.add(name);
		}			
	}
	
	public void addAName()
	{
		int location;
		String nameToAdd;
		
		System.out.println("Where do you want to add an element?");
		location = userInput.nextInt();
		
		System.out.println("What name do you want to add?");
		nameToAdd = userInput.nextLine();
		nameToAdd = userInput.nextLine();
		people.add(location,nameToAdd);
	}
	
	public void printList(ArrayList<String> listToPrint)
	{
		int k;
		for(k = 0; k < listToPrint.size(); k++)
		{
			System.out.println("\t"+k+".) "+listToPrint.get(k));
		}
		System.out.println("");
	}
	
	public void copyLists(ArrayList<String> original)
	{
		origPeople = new ArrayList<String>(original);
	}
	
	public void deleteElement()
	{
		int loc;
		
		System.out.println("Which element do you want to delete?");
		loc = userInput.nextInt();
		people.remove(loc);
	}
	
	public void performPepoleOps()
	{
		this.setUser();
		this.addNames();
		System.out.println("\nThe array list after creating it the first time:");
		this.printList(people);
		
		this.addAName();
		System.out.println("The list after adding a new element");
		this.printList(people);
		
		this.copyLists(people);
		System.out.println("\n");
		this.deleteElement();
		
		System.out.println("The list with deleted elements");
		this.printList(people);
		System.out.println("\nThe original list before deleting elements:");
		this.printList(origPeople);		
	}
	
	private String personName;
	private ArrayList<String> origPeople = new ArrayList<String>();
	private ArrayList<String> people = new ArrayList<String>();
	Scanner userInput = new Scanner(System.in);
}
