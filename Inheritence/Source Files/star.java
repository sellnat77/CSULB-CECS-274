/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class instantiates a 5 pointed star and calculates 
 * the area of it based on heron's formula with the 10 congruent triangles
 * the parameter given is the side length of one of the stars sides and from 
 * that all the other triangles area can be calculated
 */

public class star extends triangle
{
	star()
	{
		System.out.println("\nStar class has the following methods:");
		System.out.println("\n\t* calcArea = "
				           + "10*sqrt(s*(s-side1)*(s-side2)*(s-side3))\n" );
		
		System.out.println("\t* defineDimensions\n"                 );
		System.out.println("\t* doCalculations\n"                   );
		System.out.println("\t* showInfo\n"                         );
	}
	
	public double calcArea()
	{
		double area;
		double side2,side3,s;
		
		side2 =  super.getBaseLen() * Math.sin(Math.toRadians(18));
		side3 =  super.getBaseLen() * Math.sin(Math.toRadians(36));
		s     = (super.getBaseLen() + side2 + side3) / 2;

		area  = Math.sqrt(Math.abs(s *(s - super.getBaseLen()) * (s - side2)*(s-side3)));
		
		area *= 10;
		
		return area;
	}
	
	public void defineDimensions()
	{
		System.out.print("What is the length from center to tip of the star?");
		super.setBaseLen(userInput.nextDouble()                     );
	}
	
	public void doCalculations()
	{
		System.out.format("The area of this star is: %2.2f\n\n", 
				           this.calcArea());
	}
	
	public void showInfo()
	{
		this.defineDimensions();
		this.doCalculations();
	}	
}
