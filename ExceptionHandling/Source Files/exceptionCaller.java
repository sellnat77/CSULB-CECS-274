
public class exceptionCaller 
{
	public static void main(String[] args)
	{		
		int dividend       = 42;
		double floater     = 17.89;
		String countries[] = {"USA","CAN"};		
		try
		{
			System.out.println(""+(dividend/0));
			//System.out.println(""+(floater/0));
		}
		catch(ArithmeticException whoops)
		{
			System.out.println("You cant divide by zero!");
		}
		try
		{
			int k;
			for(k=0; k<3; k++)
			{
				System.out.println(countries[k]);
			}
		}
		catch(IndexOutOfBoundsException whoops)
		{
			System.out.println("You dont have enough countries!");
		}
		finally
		{
			System.out.println("Goodbye!");
		}
	}
}
