/**
 * Name Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the russellLink class
 */
public class lListCaller
{
	public static void main(String args[])
	{
		russellLinkedList tan = new russellLinkedList();
		
		tan.setFirstNode();
		
		tan.addElement("Patrice", 1002);
		tan.addElement("Denise" , 1003);
		tan.addElement("Percy"  , 1004);
		tan.addElement("Jordan" , 1005);
		
		System.out.println("This is the original list:\n");
		tan.printList();
		
		tan.insertAfter("Patrice", "Phillip", 1006);
		System.out.println("After the isertion the list is as follows:\n");
		tan.printList();
		
		tan.isPresent("Phillip");		
		tan.delete   ("Phillip");		
		tan.isPresent("Phillip");
		
		System.out.println("\nThe list after deleting is as follows:\n");
		tan.printList();		
	}
}
