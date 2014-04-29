package biaryTreeRedo;

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
	
	public void delete(Integer deleteNum, node parentNode)
	{
		int comp = parentNode.data-deleteNum;
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
