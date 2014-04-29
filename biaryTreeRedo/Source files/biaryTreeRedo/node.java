package biaryTreeRedo;

public class node {
	public Integer data;
	public node leftLink;
	public node rightLink;

	public void addNode(node newNode)
	{
		int compare = newNode.data.compareTo(data);
		if(compare < 0)
		{
			if(leftLink == null)
			{
				leftLink = newNode;
			}
			else
			{
				leftLink.addNode(newNode);
			}
		}
		else if(compare > 0)
		{
			if(rightLink == null)
			{
				rightLink = newNode;
			}
			else
			{
				rightLink.addNode(newNode);
			}
		}
	}
}
