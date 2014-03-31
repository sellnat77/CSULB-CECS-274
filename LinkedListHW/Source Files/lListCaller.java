

/**
 * Name Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the russellLink class
 * 
 */

public class lListCaller
{
	public static void main(String args[])
	{
		russellLinkedList tan = new russellLinkedList();
		
		tan.setFirstNode();
		tan.insertAtBeginning("first", 1002);
		tan.insertAtBeginning("new first", 1003);
		tan.insertAtBeginning("newest first", 1003);
		
		tan.insertAfter("new first", "POOP", 1006);
		
		tan.printList();

		
	}

}
