/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the sudoku solver class
 * it assigns the board and prints the unsolved matrix, then it solves the board
 * and prints out the solution
 */

package sudokuSolver;

public class sudokuCaller 
{
	public static void main(String args[])
	{
		matrixOps sudoku = new matrixOps();
		
		sudoku.assignTheBoard();
		System.out.println("The orginal, unsolved sudoku board is:");
		sudoku.printTheBoard(sudoku.getMatrix());
		sudoku.solveSudoku();
		sudoku.printFinalSolution();
	}
}
