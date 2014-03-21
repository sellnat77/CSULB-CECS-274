
public class primeFinder extends largestPrimeFactor
{
	private int thePrime;
	
	primeFinder(){}
	
	public void setThePrime(int A)
	{
		thePrime = A;
	}
	public int getThePrime()
	{
		return thePrime;
	}
	
	public void getPrime()
	{
		int k,nthPrime,count;
		boolean found = false;
		k = 2;
		count = 1;
		System.out.println("What nth prime do you want to find?");
		nthPrime = userInput.nextInt();
		
		while(!found)
		{
			System.out.println(""+k);
			if(super.checkIfPrime(k))
			{
				System.out.println("PRIME\t\t" + count);
				count ++;
			}
			else if(nthPrime == count)
			{
				found = true;
			}
			k++;
		}
		System.out.println("\t\tFOUND"+k);
	}
}
