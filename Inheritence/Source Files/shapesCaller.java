/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This is the calling program for the shapes menu class
 * which calls upon all the other shape classes and places them in a recursive 
 * menu to display the methods of each and perform the calculations
 */

public class shapesCaller 
{
	public static void main(String args[])
	{
		shapesMenu menu = new shapesMenu();
		
		menu.printBaseMenu();
		menu.shapeChooser(menu.getUserChoice());		
	}
}
