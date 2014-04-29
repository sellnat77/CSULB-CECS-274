package biaryTreeRedo;
import java.util.Scanner;

public class treeCall 
{
	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
	    binaryTree tree = new binaryTree();
		System.out.println("Please enter how many number to add to the tree:");
		int numbs = name.nextInt();
		int count = 0;
		while (count != numbs)
		{
			System.out.println("Enter the number to add:");
			tree.add(name.nextInt());
			tree.print();
			count++;
		}
		
	}


}
