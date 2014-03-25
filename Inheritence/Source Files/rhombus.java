/**
 * Name:Russell Tan
 * Class: CECS 274
 * Description: This class instantiates a rhombus with a side length
 * it inherits properties from the triangle class and calculates 
 */
public class rhombus extends triangle
{
	rhombus()
	{
		System.out.println("\nRhombus class has the following methods:");
		System.out.println("\n\t* calcArea = 4* area of triangle\n"    );
		System.out.println("\t* defineDimensions\n"                    );
		System.out.println("\t* doCalculations\n"                      );
		System.out.println("\t* showInfo\n"                            );			
	}
	
	public double calcArea()
	{
		double area;
		
		area = super.calcArea() * 4;
		
		return area;		
	}
	
	public void defineDimensions()
	{
		System.out.print("What is the base side length of the rhombus?");
		super.setBaseLen(userInput.nextDouble()                        );
		
		System.out.print("\nWhat is the height of the rhombus?");
		super.setHeight (userInput.nextDouble()                );		
	}
	
	public void doCalculations()
	{
		System.out.format("The area of this rhombus is: %2.2f\n\n"
				          ,this.calcArea());
	}
	
	public void showInfo()
	{
		this.defineDimensions();
		this.doCalculations();
	}	
}
