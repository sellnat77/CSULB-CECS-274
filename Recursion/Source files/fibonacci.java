
public class fibonacci 
{
	int k;
	public int doFibo(int nthTerm)
	{
		if (nthTerm == 1 || nthTerm == 2)
		{
			return 1;
		}
		else
		{
			return doFibo(nthTerm-1) + doFibo(nthTerm-2);
		}
	}
	
	public void doFiboWhile(int nthTerm)
	{
		int next;
		int first;
		int second;
		next = 1;
		first = 0;
		second = 1;
		while(k<nthTerm )
		{
			System.out.println("Fibonacci:"+next);			
			next = first+second;		
			first = second;
			second = next;
			k++;			
		}
	}
}
