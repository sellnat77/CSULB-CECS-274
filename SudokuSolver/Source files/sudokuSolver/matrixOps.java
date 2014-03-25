/**
 * Name:Russell Tan
 * Class: CECS 274
 * Description:This class assigns a sudoku board using the file reader
 * and utilization of a text file within the project
 * the board is then printed and the unknowns are printed as .'s 
 * but initialized as 0's 
 * the sudoku is then solved by checking the validity and increasing a value if 
 * its invalid
 */

package sudokuSolver;

import java.io.*;
import java.util.Scanner;

public class matrixOps 
{
	//Default Constructor
	matrixOps(){}
	
	//Mutators
	public void setRows(int r) 
	{
		rows = r;
	}	
	public void setCols(int c)
	{
		cols = c;
	}
	
	//Accessors
	public int getRows()
	{
		return rows;
	}
	public int getCols()
	{
		return cols;
	}
	public int[][] getMatrix()
	{
		return theBoard;
	}
	
	//Assigns the board based on the txt file in the project
	public void assignTheBoard()
	{
		int i,j;
		
		this.setRows(9);
		this.setCols(this.getRows());
		
		theBoard = new int [this.getRows()][this.getCols()];
		
		try 
		{
			//Open the file to read
			FileReader     reader = new FileReader    ("SudokuBoard.txt");
			BufferedReader bRead  = new BufferedReader(reader           );
			 
			for(i = 0; i < theBoard.length; i++)
			{
				for(j = 0; j < theBoard[0].length; j++)
				{
					//Assign the board by line in the txt file
					theBoard[i][j] = Integer.parseInt(bRead.readLine());
				}
			}
			//Close the reader
			bRead.close();			
		} 
		//Catch all errors from file reading
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	//Prints the board in a formatted matrix
	public void printTheBoard(int [][]theMatrix)
	{
		int i,j,k;
		
		for(i = 0; i < theMatrix.length; i++)
		{
			if(i == 3||i == 6)
			{
				for( k = 0; k < theMatrix.length*3; k++)
				{
					System.out.print("-");
				}
				System.out.print("\n|");
			}
			else
			{
				System.out.print("|");
			}
			for(j = 0; j < theMatrix[0].length; j++)
			{
				if(j == 3 || j == 6)
				{
					System.out.format(" |%2d",theMatrix[i][j]);					
				}
				else if( theMatrix[i][j] == 0)
				{
					System.out.print(" .");
				}
				else
				{
					System.out.format("%2d",theMatrix[i][j]);
				}
			}
			System.out.println(" |");
		}
	}

	//Checks validity of the specified row, then the column, then the 3x3 boxes
    public boolean isValid(int i, int j, int[][] grid) 
    {
	  	// Check whether grid[i][j] is valid at the i row
	    for (int column = 0; column < 9; column++)
	    {
	        if (column != j && grid[i][column] == grid[i][j])
	        {
		        return false;
	        }
  	    }

	    // Check whether grid[i][j] is valid at the j's column
	    for (int row = 0; row < 9; row++)
	    {
  	        if (row != i && grid[row][j] == grid[i][j])
  	        {
		        return false;
  	        }
    	}

	    // Check whether grid[i][j] is valid in the 3 by 3 box
	    for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
	    {
  	        for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
  	        {
		        if (row != i && col != j && grid[row][col] == grid[i][j])
		        {
		            return false;
		        }
  	        }
	     }

         return true; 
    }

    //If a move is not valid or 0 then this method adds one to the cell until 
    //the move is valid
	public void solveSudoku()
	{
		int i,j;
		
		for(i = 0; i <theBoard.length; i++)
		{
			for(j = 0; j < theBoard.length; j++)
			{
				while(!this.isValid(i, j, theBoard) || theBoard[i][j] == 0)
				{
					theBoard[i][j] +=1;
				}				
			}
		}
	}
	
	//Prints the formatted sudoku board
	public void printFinalSolution()
	{
		System.out.println("\nThe final, solved sudoku is:");
		this.printTheBoard(this.getMatrix());		
	}
	
	//Private members	
	Scanner userInput = new Scanner(System.in);
	private int rows,cols;
	private int theBoard [][] = new int [rows][cols];
}
