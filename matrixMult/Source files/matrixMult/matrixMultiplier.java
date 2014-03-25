/**
 * Name: Russell Tan
 * Class: CECS274
 * Description: This class asks the user for the dimensions of two square
 * matrices, then using another method, the class assigns random numbers to 
 * the matrices until they have all been assigned
 * lastly, it multiplies the two matrices
 */

package matrixMult;

import java.util.*;

public class matrixMultiplier
{
	matrixMultiplier(){}
	
	public void setRows(int ro)
	{
		rows = ro;
	}
	public void setCols(int co)
	{
		cols = co;
	}
	
	public int getRows()
	{
		return rows;
	}
	public int getCols()
	{
		return cols;
	}
	
	public void askForDimension()
	{
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("What is the dimension of the square matrix? ");
		this.setRows(userInput.nextInt());
		this.setCols(this.getRows());	
		
        arrayOne = new int [this.getRows()][this.getCols()];
		arrayTwo = new int [this.getRows()][this.getCols()];
		answer   = new int [this.getRows()][this.getCols()];
	}
	
	public void assignArrays()
	{
		int j,k;
		
		System.out.println("The first matrix is:");
		
		for(j = 0; j < this.getRows(); j++)
		{
			System.out.print("\t");
			for(k = 0; k < this.getCols(); k++)
			{
				arrayOne[j][k] = (int)(Math.random()*3);
				if(k == this.getCols()-1)
				{
					System.out.format("%2d ",arrayOne[j][k]);	
				}
				else
				{
					System.out.format("%2d, ",arrayOne[j][k]);				
				}
			}
			
			System.out.println("");
		}
		
		System.out.println("\n\nThe second matrix is:");
		
		for(j = 0; j < this.getRows(); j++)
		{
			System.out.print("\t");
			for(k = 0; k < this.getCols(); k++)
			{
				arrayTwo[j][k] = (int)(Math.random()*3);
				if(k == this.getCols()-1)
				{
					System.out.format("%2d ",arrayTwo[j][k]);	
				}
				else
				{
					System.out.format("%2d, ",arrayTwo[j][k]);				
				}							
			}
			
			System.out.println("");
		}
		
		System.out.println("\n\n\n");
	}
	
	public void multiplyMatrices()
	{
		int i,j,k;
		
		System.out.println("The solution after multiplying is:");
		
		for(i = 0; i < this.getRows(); i++)
		{
			System.out.print("\t");
			
			for(j = 0; j < this.getRows(); j++)
			{
				
				for(k = 0; k < this.getCols(); k++)
				{
					answer[i][j] += arrayOne[i][k]*arrayTwo[k][j]; 
				}
				
				if(j == this.getCols()-1)
				{
					System.out.format("%2d ",answer[i][j]);
				}
				else
				{
					System.out.format("%2d, ",answer[i][j]);
				}
			}
			
			System.out.println("");			
		}
	}
	
	private int rows;
	private int cols;
	private int arrayOne[][] = new int [rows][cols];
	private int arrayTwo[][] = new int [rows][cols];
	private int answer  [][] = new int [rows][cols];
}
