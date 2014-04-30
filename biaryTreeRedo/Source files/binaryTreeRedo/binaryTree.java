package binaryTreeRedo;

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
	
	public void insert(int data)
	{
		node newNode = new node();
		newNode.data = data;
		newNode.leftChild=null;
		newNode.rightChild=null;
		root.insert(newNode, root);		
	}
	
	public void delete(Integer data)
	{
		node nodeToDel = root;
		node parentNode = null;
		boolean found = false;
		
		while (!found && nodeToDel != null)
		{
			int comp = nodeToDel.data.compareTo(data);
			
			if(comp == 0)
			{
				found = true;
			}
			else
			{
				parentNode = nodeToDel;
				if(comp > 0)
				{
					nodeToDel = nodeToDel.leftChild;
				}
				else
				{
					nodeToDel = nodeToDel.rightChild;
				}
			}
		}
			
			if(!found)
			{
				return;
			}
			
			if(nodeToDel.leftChild==null || nodeToDel.rightChild==null)
			{
				node newChild;
				if(nodeToDel.leftChild==null)
				{
					newChild = nodeToDel.rightChild;
				}
				else
				{
					newChild = nodeToDel.leftChild;
				}
				if(parentNode == null)
				{
					root = newChild;
				}
				else if(parentNode.leftChild==nodeToDel)
				{
					parentNode.leftChild=newChild;
				}
				else
				{
					parentNode.rightChild=newChild;
				}
				return;
			}
			node smallestParent = nodeToDel;
			node smallest = nodeToDel.rightChild;
			while(smallest.leftChild!=null)
			{
				smallestParent=smallest;
				smallest=smallest.leftChild;
			}
			
			nodeToDel.data = smallest.data;
			if(smallestParent==nodeToDel)
			{
				smallestParent.rightChild=smallest.rightChild;
			}
			else
			{
				smallestParent.leftChild=smallest.rightChild;
			}
		}
	

	
	public void print() 
	{
		print(root);
		System.out.println(); 
	}
	public void printPre() 
	{
		printPre(root);
		System.out.println(); 
	}
	public void printPost() 
	{
		printPost(root);
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
	private static void printPre(node parentNode) 
	{
		if (parentNode == null) 
		{ 
			return; 
		}		
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
		print(parentNode.leftChild);
		print(parentNode.rightChild);
	}
	private static void printPost(node parentNode) 
	{
		if (parentNode == null) 
		{ 
			return; 
		}
		
		print(parentNode.leftChild);
		print(parentNode.rightChild);
		
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
	}
}
