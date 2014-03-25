/**
 * Name:Russell Tan
 * Class: CECS274
 * Description: this is the calling program for both the person name class 
 * and the string sorter class
 */

package stringSort;

public class stringSortCall
{
	public static void main(String args[])
	{
		stringSorter sentence = new stringSorter();
		personName person = new personName();
		
		person.askForName();
		System.out.println("The name you input is:" + person.getPersonName());
		sentence.getAndSort();		
	}

}
