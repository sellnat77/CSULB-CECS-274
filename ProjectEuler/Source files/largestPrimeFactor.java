/**
 * 
 * @author Russell Tan
 *
 */
public class largestPrimeFactor extends userInput
{
	largestPrimeFactor(){}
	
	public void setLargestFactor(double lF)
	{
		largestFactor = lF;
	}
	
	public double getLargestFactor()
	{
		return largestFactor;
	}
	
	public void askForANumber()
	{
		System.out.print("Please enter a number to find its"
				+ " prime factorization");
		this.setLargestFactor(super.getDouble());
	}
	
	public void checkIfPrime(double theNumber)
	{
		int k;
		k = 2;
		boolean isPrime = true;
		while(isPrime)
		{
			if(theNumber%k == 0)
			{
				isPrime = false;
			}
			k++;
		}
		
		
	}
	
	private double largestFactor;

}
