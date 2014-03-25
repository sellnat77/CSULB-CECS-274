/**
 * Name: Russell Tan
 * Class: CECS274
 * Decsription: Main class creates a random array of [10]
 * 				Assigns that array to a private array in sorter class
 * 				the other class implements a sorting 
 * 				algorithm to sort the array in descending 
 * 				order and finds the location(as printed) of the smallest value
 */
public class sortingCall 
{
	public static void main(String[] args)
	{
		int k;
		int randomArray[] = new int[10];
		int sortedArray[] = {10,20,30,40,50,60,70,80,90,100};

		sorter sort = new sorter();
		
		//Instantiates an array with random numbers between 1-100
		//and assigns the randomly generated array to the private array
		//in the sorter class at the same time
		System.out.println("The randomly assigned array is:");
		for(k = 0; k < randomArray.length; k++)
		{
			randomArray[k] = (int)(Math.random()*101);
			System.out.println((k+1)+".)  "+randomArray[k]);	
			sort.assignArray(k,randomArray[k]);
		}
		
		System.out.println("The location of the smallest\nnumber in the"
				+ " unsorted array is " + sort.getSmallestNumberLoc());		
		
		System.out.println("\nThe sorted array in descending order is:");

		sort.sortTheArray();	
	    sort.printTheArray(10);	

	    sort.insertSort(); 
	    sort.printTheArray(10);
	    
	    //START OF SORTED ARRAY	    
		System.out.println("\nThe sorted array is:");
		for(k = 0; k < sortedArray.length; k++)
		{
			System.out.println((k+1)+".)  "+sortedArray[k]);	
			sort.assignArray(k,sortedArray[k]);
		}
		
		System.out.println("The location of the smallest\nnumber in the"
				+ " sorted array is " + sort.getSmallestNumberLoc());		
		
		System.out.println("\nThe sorted array in descending order is:");

		sort.sortTheArray();		
	    sort.printTheArray(10);
		  
	    sort.insertSort(); 	       
	    sort.printTheArray(10);
	}
}
