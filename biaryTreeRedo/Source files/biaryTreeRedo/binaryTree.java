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
			newNode.leftLink = null; 
			newNode.rightLink = null;
			if (root == null) 
			{ 
				root = newNode; 
			}
			else 
			{ 
				root.addNode(newNode); 
			} 
		}
		public void print() 
		{
			print(root);
			System.out.println(); 
		}
		private static void print(node parent) 
		{
			if (parent == null) 
			{ 
				return; 
			}
			print(parent.leftLink); 
			if (parent.leftLink == null && parent.rightLink == null)
			{
				System.out.print("[" + parent.leftLink + " " + parent.data + " " + parent.rightLink + "]");
			}
			else if(parent.leftLink == null)
			{
				Integer right = parent.rightLink.data;
				System.out.print("[" + parent.leftLink + " " + parent.data + " " + right + "]");
			}
			else if (parent.rightLink == null)
			{
				Integer left = parent.leftLink.data;
				System.out.print("[" + left + " " + parent.data + " " + parent.rightLink + "]");	
			}
			else
			{
				Integer left = parent.leftLink.data;
				Integer right = parent.rightLink.data;
				System.out.print("[" + left + " " + parent.data + " " + right + "]");
			}
			print(parent.rightLink);
		}

	}
