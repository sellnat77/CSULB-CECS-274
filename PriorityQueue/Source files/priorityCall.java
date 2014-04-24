/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the priority queue class
 * it creates the print jobs, asks for the top priority then performs
 * the rest of the print jobs in aplha order
 */

public class priorityCall 
{
	public static void main(String args[])
	{
		priorityQueue office = new priorityQueue();
		
		office.assignJobs();
		office.assignPriority();
		//office.carryOutPrint();
		office.simplePrint();
	}
}
