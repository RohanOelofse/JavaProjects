/**
 * Import java.util.Random to access generation of random number
 * Import java.util.Scanner to receive input from user
 */
import java.util.Random;
import java.util.Scanner;

/**
 * To run the HighLowApp
 * @author Rohan & Jackson 
 *
 */
public class HighLowApp {

	public static Scanner sc;

	public Player player1;
	public Player player2; 

	public int attempts;
	public int correctAnswer;
	
	/**
	 * Creates 2 unique players
	 */
	public HighLowApp() {
		HighLowApp.sc = new Scanner(System.in);

		this.player1 = new Player();
		this.player2 = new Player(); 

		this.attempts = 0;
		this.correctAnswer = 0;
		
	}
	
	/**
	 * Displays the game header with all of the game's rules
	 */
	public void displayHeader() {

		System.out.println("===============================================================================");
		System.out.println("|                                 High Low Game                               |");
		System.out.println("===============================================================================");
		
		System.out.println();
		
		System.out.println("Game Rules:");
		System.out.println("1). This is a game where two players try to guess Hank's (the computer) number.");
		System.out.println("    Each player will take turns and Hank will provide you a clue if you are hot");
		System.out.println("    or cold. First player to correctly answer the question is the winner!");
		System.out.println("2). The game will track how many guesses each player takes.");
		System.out.println("3). The game will provide hints. Here is a list and what they mean:");
		System.out.println("        - Freezing = off by 50 +");
		System.out.println("        - Cold = off by 25 +");
		System.out.println("        - Warm = off by 10 +");
		System.out.println("        - Hot = off by 5 +");
		System.out.println("        - Boiling = Less than 5 away");
		System.out.println();
		System.out.println("===============================================================================");
	}
	
	/**
	 * Uses the overload constructor to receive input and set player names
	 * @param player The player object
	 */
	public void setName(Player player) {
		
		String userInput = "?";
		
		System.out.println("Setting up the #" + player.getId() + " player");
		
		while (true) 
		{
			System.out.print("\tPlease enter the player's name: ");
			userInput = sc.nextLine();
			
			try 
			{
				player.setName(userInput);
				break;
			} 
			catch (Exception e) 
			{
				// Error message when the player name is blank
				System.out.println("\tERROR! " + e.getMessage());
			}
		}
		
		System.out.println();
		System.out.println("===============================================================================");
		System.out.println();
		
	}
	
	/**
	 * Sets the player's name
	 * @throws Exception The exception for blank names
	 */
	public void setupPlayers() throws Exception {
		
		this.setName(this.player1);
		
		this.setName(this.player2);
		
	}

	/**
	 * Takes input from player and determines if the player guessed the correct number
	 * @param player  The player object
	 * @return false if the player did not guess correctly and true if the player got it correctly
	 */
	public boolean guess(Player player) {
		int playerGuess = 0;
		int distance = 0;
		String playerName = player.getName();
		
	    attempts++;
		while(true) {
			
			System.out.print("What's your guess, " + playerName + ": ");
			
		    while (!sc.hasNextInt()) { // check if the input is a number before retrieving the data
		        System.out.println("That's not a number! Please try again: ");
		        sc.next(); // clear the invalid data
		    }
	
		    playerGuess = sc.nextInt();
		    
		    if (playerGuess >= 1 && playerGuess <= 100) 
		    	break;
		    else
		    	System.out.println("Error. Enter a number 1 -100");
		}

		if (playerGuess == this.correctAnswer) {
			System.out.println("Congratulations " + playerName +  " have guessed my number!");
			System.out.println();
			player.addWin();
			player.setAttempts(this.attempts);
			return true;
		} 
		
		//Calculates the amount between the player's guess and the correct answer
		distance = Math.abs(playerGuess - this.correctAnswer);

		if (distance >= 50)
			System.out.println("You are freezing!");
		
		else if (distance <= 49 && distance >= 25 )
			System.out.println("You are cold...");
		
		else if (distance >= 10 && distance <= 24 )
			System.out.println("You are warming up...");
		
		else if (distance >= 5 && distance <= 9 )
			System.out.println("You are hot...");
		
		else if (distance <= 4 )
			System.out.println("You are boiling...");
		
		return false;
	}
	
	/**
	 * Displays the player's statistics: Total wins, Highest amount of guesses, Lowest amount of guesses
	 * @param player  The player object
	 */
	public void displayStats(Player player) {
		// Use a printf to align report in columns
        String playerName = String.format("%-10s", player.getName()).replace(' ','.'); 
        
        System.out.printf("%-10s: %4d  %4d %4d\n",
				playerName,
				player.getAddWin(),
				player.getHighestAttempts(),
				player.getLowestAttempts());
	}
	
	/**
	 * Starts the game with a welcome message and generates the random correct answer
	 */
	public void playGame() {
		Random random = new Random();
		
		String cont = "yes";
		boolean correct = false;
		
		System.out.println("Welcome " + this.player1.getName() + " and " + this.player2.getName() + "! Lets get this game started.");
		System.out.println();
		System.out.println("===============================================================================");
		System.out.println();
		System.out.println("My name is Hank. I'm a computer.");
		System.out.println("Can you guess the number I'm thinking about 1- 100");
		System.out.println();

		while (cont.equals("y") || cont.equals("yes")) {
			
			this.attempts = 0;
		    this.correctAnswer = random.nextInt(100) + 1;
		    System.out.println();
		    // System.out.println("****ONLY for Testing - Correct Answer is  " + this.correctAnswer + " ****");
		    
		    correct = false;

		    while (!correct) {
		    	
			    if (attempts % 2 == 0) 
			    	correct = this.guess(this.player1);
			    else
			    	correct = this.guess(this.player2);
		    }
		    
		    sc.nextLine(); // clear input buffer, leftover from nextInt
		    System.out.print("Press the Enter key to display the game stats...");
		    sc.nextLine();
		    
		    System.out.println();
		    System.out.println("===============================================================================");
		    System.out.println();
		    System.out.println("          # of attempt");
		    System.out.println("Name          Win  High  Low ");
		    System.out.println("-----         ---  ----  --- ");
		    this.displayStats(player1);
		    this.displayStats(player2);
		    System.out.println();
		    System.out.println("===============================================================================");
		    System.out.println();
		    
		    while (true) {
		    	System.out.print("Do you want to play again (y=yes, n=no): ");
		    	cont = sc.nextLine();
		    	
		    	if (cont.equals("y") || cont.equals("yes") || cont.equals("n") || cont.equals("no"))
		    		break;
		    	else
		    		System.out.println("Invalid input! Please try again..");
		    	
		    } // end of y/n data validation while
		    
		    System.out.println();
		    System.out.println("===============================================================================");
		    
		} // end of outer while loop to keep the game running
		
	} // end of playGame method
	
	/**
	 * Displays the closing message and greets the players
	 */
	public void displayClosing() {
		System.out.println();
		System.out.println("Well it was fun while it lasted!");
		System.out.println("Good bye " + player1.getName() + " and " + player2.getName());
		System.out.println("Hopefully I can see you again!");
		System.out.println();
		System.out.println("===============================================================================");
	}
	
	/**
	 * Instantiate a new Player object using the default constructor
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		HighLowApp app = new HighLowApp();
		
		app.displayHeader();

		app.setupPlayers();

		app.playGame();
		
		app.displayClosing();

		sc.close();

	} // end of main

} // end of HighlowApp