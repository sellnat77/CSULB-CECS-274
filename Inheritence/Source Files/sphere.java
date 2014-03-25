/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class instantiates a sphere and calculates the area 
 * and volume based on the users input of the radius
 */

public class sphere extends circle
{
	sphere()
	{
		System.out.println("\nSphere class has the following methods:");
		System.out.println("\n\t* calcVolume = 4/3 *PI*r*r*r\n"       );
		System.out.println("\t* calcArea = 4*PI*r*r\n"                );
		System.out.println("\t* defineDimensions\n"                   );
		System.out.println("\t* doCalculations\n"                     );
		System.out.println("\t* showInfo\n"                           );		
	}
	
	public double calcVolume()
	{
		double vol;
		
		vol = ( 4.0 / 3 ) * Math.PI * Math.pow(super.getRadius(), 3);
		
		return vol;		
	}
	
	public double calcArea()
	{
		double area;
		
		area = 4 * Math.PI * Math.pow(super.getRadius(),2);
		
		return area;
	}
	
	public void defineDimensions()
	{
		System.out.print("What is the length of the radius of the sphere?");
		super.setRadius (userInput.nextDouble()                           );		
	}
	
	public void doCalculations()
	{
		System.out.format("The volume of this sphere is: %2.2f\n",
				           this.calcVolume());
		System.out.format("And the area is: %2.2f\n\n", this.calcArea());		
	}
	
	public void showInfo()
	{
		this.defineDimensions();
		this.doCalculations  ();
	}	
}
