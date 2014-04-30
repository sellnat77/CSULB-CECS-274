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
