/**
 * 
 * @author Russell Tan
 * Projecteuler.net problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 *
 */
public class largestPrimeFactor extends userInput
{
	largestPrimeFactor(){}
	
	public void setLargestFactor(long lF)
	{
		largestFactor = lF;
	}
	
	public long getLargestFactor()
	{
		return largestFactor;
	}
	
	public void askForANumber()
	{
		System.out.print("Please enter a number to find its"
				+ " prime factorization");
		this.setLargestFactor(super.getLong());
	}
	
	public boolean checkIfPrime(long theNumber)
	{
		int k;
		k = 2;
		boolean isPrime = true;
		while(isPrime && k<theNumber)
		{
			if(theNumber%k == 0)
			{
				isPrime = false;
				return isPrime;
				
			}
			k++;
		}
		return isPrime;		
	}
	
	//Finds the prime factors for smaller numbers but when they get big
	//either the program is still running or it just dont work
	public void findPrimeFactors()
	{
		long k;
		long theNumber = 67;//600851475143L;
		long primes[] = new long[(int) Math.sqrt(theNumber)];
		System.out.println(""+this.checkIfPrime(theNumber));
		for(k = 1; k < (int)(theNumber/2); k++)
		{
			if(this.checkIfPrime(k) && theNumber%k == 0)
			{
				primes[(int) k] = k;
				System.out.println(k+".)" + primes[(int) k]);				
			}			
		}
					
	}	
	private long largestFactor;
}
