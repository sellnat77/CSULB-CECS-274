
public class node 
{
	public node left, right;
	private int dataToBeWritten;
	
	public node(){}
	
	public node (int A)
	{
		setLeft(null);
		right = null;
		setDataToBeWritten(A);
	}

	public int getDataToBeWritten() {
		return dataToBeWritten;
	}

	public void setDataToBeWritten(int dataToBeWritten) {
		this.dataToBeWritten = dataToBeWritten;
	}

	public node getLeft() {
		return left;
	}

	public void setLeft(node left) {
		this.left = left;
	}

}
