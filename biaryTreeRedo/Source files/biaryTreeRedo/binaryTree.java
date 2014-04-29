package biaryTreeRedo;

public class binaryTree 
{
	private node root;
	
	binaryTree()
	{
		root = null;
	}
	public void add(Integer data) 
	{
		node newNode = new node(); 
		newNode.data = data; 
		newNode.leftChild = null; 
		newNode.rightChild = null;
		if (root == null) 
		{ 
			root = newNode; 
		}
		else 
		{ 
			root.addNode(newNode); 
		} 
	}
	
	public void insert(Integer data)
	{
		node newNode = new node();
		newNode.data = data;
		newNode.leftChild=null;
		newNode.rightChild=null;
		root.insert(newNode, root);		
	}
	
	
	public void print() 
	{
		print(root);
		System.out.println(); 
	}
	private static void print(node parentNode) 
	{
		if (parentNode == null) 
		{ 
			return; 
		}
		
		print(parentNode.leftChild); 
		
		if (parentNode.leftChild == null && parentNode.rightChild == null)
		{
			System.out.print("[" + parentNode.leftChild + " " + parentNode.data + " " + parentNode.rightChild + "]");
		}
		
		else if(parentNode.leftChild == null)
		{
			int rightData = parentNode.rightChild.data;
			System.out.print("[" + parentNode.leftChild + " " + parentNode.data + " " + rightData + "]");
		}
		
		else if (parentNode.rightChild == null)
		{
			int leftData = parentNode.leftChild.data;
			System.out.print("[" + leftData + " " + parentNode.data + " " + parentNode.rightChild + "]");	
		}
		else
		{
			int leftData = parentNode.leftChild.data;
			int rightData = parentNode.rightChild.data;
			System.out.print("[" + leftData + " " + parentNode.data + " " + rightData + "]");
		}
		print(parentNode.rightChild);
	}

}
