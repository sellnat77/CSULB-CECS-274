
public class LinkedCaller
{
	public static void main(String args[])
	{
		LinkedListExample ex = new LinkedListExample();
		
		ex.askForNames();
		ex.insertName();
		ex.printLList(ex.origNames);
		ex.deleteNameMatch();
	}
}
