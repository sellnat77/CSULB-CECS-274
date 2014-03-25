/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This is the person class which initializes a person with 
 * a name and ID using a full constructor
 */

package arrayListsHW;

public class person
{
	private String persName;
	private int persID;

	person(){}

	person(int number)
	{
		persID = number;
	}

	person(int number, String name)
	{
		persID   = number;
		persName = name;
	}

	public void setPersID(int num)
	{
		persID = num;
	}
	public void setPersName(String name)
	{
		persName = name;
	}

	public int getPersID()
	{
		return persID;
	}
	public String getPersName()
	{
		return persName;
	}

	public void displayInfo()
	{
		System.out.print("ID: "+this.getPersID());
		System.out.print("\tName: "+this.getPersName());
		System.out.println("\n");
	}
}