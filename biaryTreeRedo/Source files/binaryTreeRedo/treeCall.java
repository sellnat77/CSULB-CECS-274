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
		tree.insert(5);
		tree.insert(4);
		tree.insert(6);
		tree.insert(12);
		tree.insert(0);
		tree.insert(9);
		tree.insert(4);
		tree.print();
		tree.delete(4);
		tree.print();
		System.out.println("pre");
		tree.printPre();
		System.out.println("post");
		tree.printPost();

		
	}
}
