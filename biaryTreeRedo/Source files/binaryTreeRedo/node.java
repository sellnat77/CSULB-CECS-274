/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the basic node class that has a variable for the data it
 * carries, the left child, and the right child. It also has a method to add a 
 * node, as well as insert a node given the node to add and the parent node
 */

package binaryTreeRedo;

public class node {
	public Integer data;
	public node leftChild;
	public node rightChild;

	public void addNode(node newNode)
	{
		int compare = newNode.data.compareTo(data);
		
		if(compare < 0)
		{
			if(leftChild == null)
			{
				leftChild = newNode;
			}
			else
			{
				leftChild.addNode(newNode);
			}
		}
		else if(compare > 0)
		{
			if(rightChild == null)
			{
				rightChild = newNode;
			}
			else
			{
				rightChild.addNode(newNode);
			}
		}
	}
	
	public void insert(node newNode, node parentNode)
	{
  		int comp = parentNode.data-newNode.data;
  		if(comp > 0)
	 	{
			if(leftChild == null)
			{
	 			leftChild = newNode;
	 		}
			else
			{
	 			leftChild.insert(newNode,leftChild);
	 		}
		}
  		else if(comp < 0)
	 	{
			if(rightChild == null)
			{
	 			rightChild = newNode;
	 		}
			else
			{
	 			rightChild.insert(newNode,rightChild);
	 		}
		}
	}
	
	
}
