import java.util.LinkedList;
import java.util.Scanner;


public class tree 
{
	Scanner userInput = new Scanner(System.in);
	private int data;
	private node treeNode;
	private LinkedList<Integer> tree = new LinkedList<Integer>();
	private node root;
	
	tree()
	{
		root = null;
	}
	
	tree(int treeData, node left, node right)
	{
		root = new node();
		root.setDataToBeWritten(treeData);
		root.left = left.root;
		root.right = right.root;
	}
	
	public void setData(int A)
	{
		data = A;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setRoot()
	{

	}
	
	public void insert(int data)
	{
		
		
	}

}
