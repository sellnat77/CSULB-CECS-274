/**
 * Name Russell Tan
 * Class: CECS274
 * Description: this is the string sorter class which sorts a given string of 
 * words by lexicographical order
 * the method used to do this is splitting the string by the spaces and 
 * adding them to an array to which Arrays.sort() is implemented
 * then the strings both sorted and unsorted are converted into capitals by the 
 * .toUpperCase() method 
 */

package stringSort;

import java.util.Arrays;

public class stringSorter extends personName
{
	stringSorter(){}
	
	public void setSentence(String sent)
	{
		sentence = sent;
	}
	
	public String getSentence()
	{
		return sentence;
	}
	
	public void askForSentence()
	{
		System.out.println("Enter the sentence to be sorted");
		this.setSentence(userInput.nextLine());
		
		System.out.println("\n\tThe unsorted sentence is...");
		System.out.println("\t"+this.getSentence());
		
		words = this.getSentence().split("\\s");
	}
	
	public void sortSentence()
	{
		int k;
		StringBuilder builder = new StringBuilder();
		
		sortedArray = this.getSentence().toLowerCase().split("\\s");		
		
		for (String words : sortedArray) 
		{
		    builder.append(words + " ");
		}

		Arrays.sort(sortedArray);
		
		System.out.println("\tThe sorted sentence by lexicographical order is:");
		System.out.print("\t");
		
		for(k = 0; k < sortedArray.length; k++)
		{
			System.out.print(sortedArray[k]+" ");
			
		}
		System.out.println("");
	}
	
	public void convertToCaps(String baseString[])
	{
		StringBuilder builder = new StringBuilder();
		
		for (String words : baseString) 
		{
		    builder.append(words + " ");
		}
		String caps = builder.toString().toUpperCase();
		System.out.println("\nThe sentence in capital letters is: "+caps+"\n");
	}
	
	public void getAndSort()
	{
		this.askForSentence();
		this.convertToCaps(words);
		this.sortSentence();
		this.convertToCaps(sortedArray);
	}	
	
	private String sentence;
	private String[] sortedArray;
	private String[] words;
}
