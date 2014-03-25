/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This is the calling program for the matrix multiplier class
 * its asks the user for the dimensions and multiplies the matrices
 */

package matrixMult;

//AB = sum of (a[i][k]*b[k][j])
public class matrixCall 
{
	public static void main(String Theory[])
	{
		matrixMultiplier matrix = new matrixMultiplier();
		
		matrix.askForDimension();
		matrix.assignArrays();
		matrix.multiplyMatrices();
		
	}
}
