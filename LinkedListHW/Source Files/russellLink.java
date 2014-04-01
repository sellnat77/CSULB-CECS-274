/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the super class for the russellLinkedList class
 * which allows the child to instantiate multiple objects of this class
 * This class creates a person with a name and an ID and it has a member 
 * variable for the next link in the linked list.
 */

public class russellLink 
{
	private String name;
	private int ID;
	private russellLink nextLink;
	
	russellLink(){}
	russellLink(String A)
	{
		name = A;
	}
	
	russellLink(String A, int B)
	{
		name = A; 
		ID   = B;
	}
	
	public void setName(String A)
	{
		name = A;		
	}
	public void setID(int A)
	{
		ID = A;
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	
	public void setNext(String A, int B)
	{
		nextLink = new russellLink(A,B);
	}
	
	public russellLink getNext()
	{
		return nextLink;
	}
}
