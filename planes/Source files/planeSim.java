/**
 * 
 * Name: Russell Tan
 * Class:CECS 274
 * Description:This class initializes two random altitude and checks if
 * they crash using a comparison method
 * it also prints the percentage o crashes by keeping
 * track of times crashed and times run with static variables
 *
 */
public class planeSim 
{
	planeSim(){}
	
	public int getPlaneAlt()
	{
		return planeAlt;
	}
	public int getLowerLim()
	{
		return lowerAlt;
	}	
	public int getUpperLim()
	{
		return upperAlt;
	}
	
	public void setPlaneAlt(int a)
	{
		planeAlt = a;
	}	
	public void setUpperLim(int u)
	{
		upperAlt = u;
	}
	public void setLowerLim(int low)
	{
		lowerAlt = low;
	}
	
	public int assignPlaneAlt(int lowerLim, int upperLim)
	{
		planeAlt = lowerLim+(int)(Math.random()*((upperLim-lowerLim)+1));
		return planeAlt;
	}
	
	public void checkCrash()
	{

		deltaAlt = this.assignPlaneAlt(30000,35000);
		blueAlt  = this.assignPlaneAlt(29200,32500);
		
		System.out.print("\nSim #" + timesRun);
		System.out.println("\ndelta: " +deltaAlt);
		System.out.println("blue : " + blueAlt);
		if(deltaAlt == blueAlt)
		{
			System.out.format("\n\n\tResult: CRASH\n");
			timesCrashed++;
			timesRun++;
		}
		else
		{
			System.out.format("\tResult: Safe Passage");
			timesRun++;
		}
	}
	
	public void finishSim()
	{
		System.out.format("\n\nThe crash percentage was: %2.2f percent",(1.0*timesCrashed/timesRun)*100);
	}
	static int timesRun;
	static int timesCrashed;	
	private int deltaAlt;
	private int blueAlt;
	private int planeAlt;
	private int upperAlt;
	private int lowerAlt;

}
