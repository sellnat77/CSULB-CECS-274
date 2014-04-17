import java.util.PriorityQueue;
import java.util.Scanner;


public class priorityQueue 
{
	private String priority;
	private String people[] = new String[5];
	private PriorityQueue<String> printer = new PriorityQueue<String>();
	private Scanner userInput = new Scanner(System.in);
	
	public void setPriority(String A)
	{
		priority = A;
	}
	public void setPeople(int k,String A)
	{
		people[k] = A;
	}
	
	public String getPriority()
	{
		return priority;
	}
	public String getPeople(int k)
	{
		return people[k];
	}
	
	public void assignJobs()
	{
		int k;
		for( k = 0; k < people.length; k++)
		{
			System.out.println("Whos print job is this?");
			this.setPeople(k, userInput.nextLine());
			printer.add(this.getPeople(k));
		}
	}
	
	public void assignPriority()
	{
		System.out.println("Who gets priority?");
		this.setPriority(userInput.nextLine());
	}
	
	public void carryOutPrint()
	{
		int k;
		System.out.println(printer.toString());
		for(k = 0; k < printer.size(); k++)
		{
			if(printer.contains(this.getPriority()))
			{
				System.out.println("Printed: " +this.getPriority());
				printer.remove(this.getPriority());
				System.out.println("\n"+printer.toString());
			}
			else
			{
				System.out.println("Printed: " + printer.remove());
				System.out.println("\n"+printer.toString());
			}
		}
		System.out.println("Printed: " + printer.remove());
		System.out.println("\n"+printer.toString());
		System.out.println("Printed: " + printer.remove());
	}

}
