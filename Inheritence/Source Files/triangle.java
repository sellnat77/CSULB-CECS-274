/**
 * Name: Russell Tan
 * Class:CECS 274
 * Description: This class instantiates a triangle with a base length and
 * a height, once constructor is called it displays available methods
 *
 */

import java.util.Scanner;

public class triangle 
{
	triangle(){}
	triangle(int A)
	{
		System.out.println("\nTriangle class has the following methods:");
		System.out.println("\n\t* setBaseLen\n"                         );
		System.out.println("\t* setHeight\n"                            );
		System.out.println("\t* getBaseLen\n"                           );
		System.out.println("\t* getHeight\n"                            );
		System.out.println("\t* calcArea = height*base/2\n"             );
		System.out.println("\t* defineDimensions\n"                     );
		System.out.println("\t* doCalculations\n"                       );
		System.out.println("\t* showInfo\n"                             );		
	}	
	
	public void setBaseLen(double len)
	{
		baseLen = len;
	}
	public void setHeight(double triHeight)
	{
		height = triHeight;
	}
	
	public double getBaseLen()
	{
		return baseLen;
	}
	public double getHeight()
	{
		return height;
	}
	
	public double calcArea()
	{
		double area;
		
		area = (this.getHeight()*this.getBaseLen())/2;
		
		return area;
	}
	
	public void defineDimensions()
	{
		System.out.print("What is the length of the base of the triangle: ");
		this.setBaseLen (userInput.nextDouble()                            );
		
		System.out.print("\nWhat is the height of the triangle: ");
		this.setHeight  (userInput.nextDouble()                  );		
	}	
	
	public void doCalculations()
	{
		System.out.format("The area is: %2.2f\n\n",this.calcArea());
	}
	
	public void showInfo()
	{
		this.defineDimensions();
		this.doCalculations  ();
	}
	
	Scanner userInput = new Scanner(System.in);
	private double baseLen;
	private double height ;
}
