/**
 * Name:Russell Tan
 * Class:CECS 274
 * Description: This is the calling program for the planeSim
 * class and runs the simulation 100 times 
 * after the sim, the crash percentage is printed out
 *
 */
public class planeCall {
	public static void main(String args[])
	{
		planeSim delta = new planeSim();
		
		for(int k = 0; k < 100; k++)
		{
			delta.checkCrash();
		}
		delta.finishSim();
	}

}
