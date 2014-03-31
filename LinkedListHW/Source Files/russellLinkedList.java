import java.util.LinkedList;


public class russellLinkedList extends russellLink
{
	russellLink first = new russellLink();
	LinkedList<russellLink> theList = new LinkedList<russellLink>();
	
	russellLinkedList(){}
	
	public void setFirstNode()
	{
		first = new russellLink("Russell",1001);
		theList.add(first);
	}
	
	public void insertAtBeginning(String nameToAdd, int newID)
	{
		super.setNext(nameToAdd,newID);
		theList.push(super.getNext());
	}
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
	public void isPresent(String nameToSearch)
	{
		
		
	}
	public void delete()
	{
		
	}
	public void printList()
	{
		int k;
		for(k = 0; k < theList.size(); k++)
		{
			System.out.print(theList.get(k).getID()+", "+theList.get(k).getName()+"||||");
		}
		
	}

}
