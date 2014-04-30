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
	/*
	 * NOTES:
	 * 
	 * int comp = prentnode.data-newnode.data
	 * 	if(comp>0)
	 * {
	 * 		place child on left
	 * }
	 * 
	 *******INSERTION********
	 * public void insert(myNode newNode, myNode parentNode)
	 * {
	 * 		int comp = parentNode.data-newNode.data;
	 * 		if(comp > 0)
	 **		{
	 *			if(leftChild == null)
	 *			{
	 *				lftChild = newNode;
	 *			}
	 *			else
	 *			{
	 *				leftChild.insert(newNode,leftChild);
	 *			}
	 *		}
	 *		else if(comp < 0)
	 *		{
	 *			if(rightChild == null)
	 *			{
	 *				rightChild = newNode;
	 *			}
	 *			else
	 *			{
	 *				rightChild.insert(newNode,rightChild);
	 *			}
	 *		}
	 * }
	 * 
	 * ************DELETION********
	 * public void delete(int deleteNum, myNode parentNode)
	 * {
	 * 		int comp = parentNode.data-deleteNum; 
     *		if(comp > 0)
	 *		{
	 *			if(leftChild == null)
	 *			{
	 *				leftChild = newNode;
	 *			}
	 *			else
	 *			{
	 *				leftChild.insert(newNode,leftChild);
	 *			}
	 *		}
	 *		else if(comp < 0)
	 *		{
	 *			if(rightChild == null)
	 *			{
	 *				rightChild = newNode;
	 *			}
	 *			else
	 *			{
	 *				rightChild.insert(newNode,rightChild);
	 *			}
	 *		}
	 *		else if( comp == 0)
	 *		{
	 *			parentNode.leftChild = null;
	 *		}	 
	 * }
	 * 
	 */

}
