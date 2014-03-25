/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class displays a peanut game board and assigns the location
 * based on a random number then checks if the user guessed correctly
 * then recursively calls itself to play the game multiple times
 * and when the user wishes to exit the statistics are shown
 */

import java.util.Scanner;

public class shellGame 
{
	//Default constructor
	shellGame(){}
	
	//Accessors
	public void setPeanutLoc(int pean)
	{
		peanutLoc = pean;
	}
	public void setGamesPlayed(int g)
	{
		gamesPlayed = g;
	}
	public void setGamesWon(int win)
	{
		gamesWon = win;
	}
	public void setGamesLost(int lose)
	{
		gamesLost = lose;
	}
	public void setUserGuess(int guess)
	{
		userGuess = guess;
	}
	
	//Mutators
	public int getPeanutLoc()
	{
		return peanutLoc;
	}
	public int getGamesPlayed()
	{
		return gamesPlayed;
	}
	public int getGamesWon()
	{
		return gamesWon;
	}
	public int getGamesLost()
	{
		return gamesLost;
	}	
	public int getUserGuess()
	{
		return userGuess;
	}	
	
	//Assigns location of peanut based on a rand number thats either 1,2, or 3 
	public void hidePeanut()
	{
		int randLoc;
		randLoc = (int)(Math.random()*3)+1;
		
		this.setPeanutLoc(randLoc);
	}	
	//Default board for shell guessing game
	public void dispShells()
	{		
		System.out.println("  __  \t  __  \t  __");
		System.out.println(" /  \\ \t /  \\ \t /  \\");
		System.out.println("/ 01 \\ \t/ 02 \\\t/ 03 \\");	
	}
	//Asks user to guess what shell the peanut is under, checks if guess is val
	public void guessForPeanut()
	{		
		System.out.println("Where do you think the peanut is?");
		this.setUserGuess(userInput.nextInt());	
		if(this.getUserGuess()<1 || this.getUserGuess()>3)
		{
			System.out.println("Invalid, try again.");
			guessForPeanut();			
		}
	}
	//Prints peanut based on location and message based on if the user guessed
	//right or wrong
	public void showPeanut(int location, boolean win)
	{
		String peanut = "##";
		switch(location)
		{
			case 1:
				System.out.println("  __  \t  __  \t  __");
				System.out.println(" /  \\ \t /  \\ \t /  \\");
				System.out.println("/ "+peanut+" \\ \t/ 02 \\\t/ 03 \\");
				break;
			case 2:
				System.out.println("  __  \t  __  \t  __");
				System.out.println(" /  \\ \t /  \\ \t /  \\");
				System.out.println("/ 01 \\ \t/ "+peanut+" \\\t/ 03 \\");
				break;
			case 3:
				System.out.println("  __  \t  __  \t  __");
				System.out.println(" /  \\ \t /  \\ \t /  \\");
				System.out.println("/ 01 \\ \t/ 02 \\\t/ "+peanut+" \\");
				break;
			default:
				System.out.println("Broked");
				break;	
		}
		if(win)
		{
			System.out.println("Congratulations! You guessed correctly!");
			gamesWon++;
			gamesPlayed++;
		}
		else
		{
			System.out.println("Sorry, you lost. The peanut was under shell " +
					this.getPeanutLoc());
			gamesLost++;
			gamesPlayed++;
		}
	}
	//Displays the statistics of the game after the user exits
	public void showInfo()
	{
		System.out.println("\t\t\nStatistics");
		System.out.println("\t\tGames played: " + this.getGamesPlayed());
		System.out.println("\t\tGames won   : " + this.getGamesWon());
		System.out.println("\t\tGames lost  : " + this.getGamesLost());
		System.out.format ("\t\tYou won %2.2f%% of the games you played.",
				((1.0*this.getGamesWon()/this.getGamesPlayed())*100));
	}
	//returns true if the users guess matches the location of the peanut
	public boolean checkIfWin(int loc, int guess)
	{
		if(loc == guess)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	//recursive method to display the menu and play the game until the 
	//user wants to quit, this also validates the users input
	public void playGame()
	{
		int choice;
		
		System.out.println("\n\n\t\tMain Menu:");
		System.out.println("\t\t1) Play the game!");
		System.out.println("\t\t2) Exit the program.");
		choice = userInput.nextInt();
		
		switch (choice)
		{
			case 1:
				this.dispShells();
				this.hidePeanut();
				this.guessForPeanut();
				this.showPeanut(this.getPeanutLoc(), this.checkIfWin
						(this.getPeanutLoc(), this.getUserGuess()));
				playGame();
				break;
			case 2:
				this.showInfo();
				break;
			default:
				System.out.println("invalid input! Try again!");
				playGame();
				break;
		}		
	}
	
	//Private members
	Scanner userInput = new Scanner(System.in);
	private static int gamesPlayed;
	private static int gamesWon;
	private static int gamesLost;
	
	private int peanutLoc;
	private int userGuess;
}
