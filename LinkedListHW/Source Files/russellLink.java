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
		ID = B;
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
