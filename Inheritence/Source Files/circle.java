/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class instantiates a circle with a radius
 * once the default constructor is called, is displays the available methods
 */

import java.util.Scanner;

public class circle 
{
	circle(){}
	
	circle(int A)
	{
		System.out.println("\nCircle class has the following methods:");
		System.out.println("\n\t* setRadius\n"                        );
		System.out.println("\t* getRadius\n"                          );
		System.out.println("\t* calcPerimeter = 2*PI*r\n"             );
		System.out.println("\t* calcArea = PI*r*r\n"                  );
		System.out.println("\t* defineDimensions\n"                   );		
		System.out.println("\t* doCalculations\n"                     );
		System.out.println("\t* showInfo\n"                           );			
	}		
	
	public void setRadius(double rad)
	{
		radius = rad;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calcPerimeter()
	{
		double perimeter;
		
		perimeter = 2 * Math.PI * this.getRadius();
		
		return perimeter;
	}
	
	public double calcArea()
	{
		double area;
		
		area = Math.PI*this.getRadius()*this.getRadius();
		
		return area;
	}
	
	public void defineDimensions()
	{
		System.out.print("What is the radius of the circle: ");
		this.setRadius(userInput.nextDouble());		
	}
	
	public void doCalculations()
	{
		System.out.format("The perimeter of this circle is: %2.2f\n",
				           this.calcPerimeter());
		System.out.format("The area of the circle is: %2.2f\n\n", 
				           this.calcArea());
	}
	
	public void showInfo()
	{
		this.defineDimensions();
		this.doCalculations  ();
	}	
	
	Scanner userInput = new Scanner(System.in);
	private double radius;
}
