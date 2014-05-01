/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the second
 * iteration of the binary tree program. it asks for the inital
 * amount of numbers to be addded to the tree and prints the tree each iteration
 * then it calls on a recursive method to ask for more number, delete a number, 
 * or finish the program
 */

package binaryTreeRedo;
import java.util.Scanner;

public class treeCall 
{
	public static void main(String[] args) 
	{
		int numbs;
		int count;

		Scanner userInput = new Scanner(System.in);
	    binaryTree tree = new binaryTree();
	    
		System.out.print("How many numbers do you want to add to the tree? ");
		numbs = userInput.nextInt();
		System.out.println("");
		
		count = 0;
		while (count != numbs)
		{
			System.out.println("What number do you want to add?");
			
			tree.add(userInput.nextInt());
			tree.print();
			
			count++;
		}	
		tree.askForMore();

		
	}
}
