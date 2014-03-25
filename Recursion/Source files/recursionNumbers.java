
public class recursionNumbers 
{
	int k;
	
	double getYourNumber()
	{
		return yourNumber;
	}
	double getResult()
	{
		return result;
	}
	int getPower()
	{
		return power;
	}
	
	public void setYourNumber(double theNumber)
	{
		yourNumber = theNumber;
	}
	public void setPower( int thePower)
	{
		power = thePower;
	}
	public void setResult(double res)
	{
		result += res;
	}
	
	public void setNumbers()
	{
		this.setYourNumber(2.0);
		this.setPower(0);
	}

	public double multiplyTwo(int pow)
	{	
		if(pow == 0)
		{
			return 1;
		}
		else
		{
			return 2* multiplyTwo(pow-1);
		}
	}
	
	public void multiplyTwoWhile(int pow)
	{
		double result;
		double number;
	
		number = 2;
		result = 2;
		while( k < pow )
		{
			if(pow == 0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2 to the nth:"+result);
				result = result*number;
			}
			k++;
		}
	}
	private double yourNumber;
	private double result;
	private int power;
}
