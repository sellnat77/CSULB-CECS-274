
public class recursionCaller {

	public static void main(String[] args)
	{
		recursionNumbers recurs = new recursionNumbers();
		fibonacci fibo = new fibonacci();
		
		
		recurs.setNumbers();
		System.out.println("Recursive 2 to the nth:  "+recurs.multiplyTwo(11) + "\n");
		recurs.multiplyTwoWhile(11);
		System.out.println("Recursive fibonacci:  "+fibo.doFibo(5) + "\n");
		fibo.doFiboWhile(5);
	}

}
