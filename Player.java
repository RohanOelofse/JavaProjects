/**
 * Class to create Player objects
 * @author Rohan & Jackson 
 *
 */
public class Player {
	
	/**
	 * This is a class level field - share across all players
	 * this is used to generate the next player id
	 */
	private static int lastId = 0;
	
	//Instance level fields - unique per player
	/**
	 * The player id that is unique across all players
	 */
	private int id;
	
	/**
	 * The current total wins of a player
	 */
	private int addWin;
	
	/**
	 * The highest amount of attempts a player used to guess the number
	 */
	private int highestAttempts;
	
	/**
	 * The lowest amount of attempts the player used to guess the number
	 */
	private int lowestAttempts;
	
	/**
	 * Randomly generated answer that the player tries to guess
	 */
	private int correctAnswer;
	
	/**
	 * The player's name
	 */
	private String playerName;
	
	/**
	 * Default constructor automatically assigns the next player id
	 * and initializes default values
	 * 
	 * Default constructor that will return a unique player object
	 */
	public Player () {
		this.id = ++Player.lastId;
		this.addWin = 0;
		this.highestAttempts = 0;
		this.lowestAttempts = 0;
		this.playerName = "Unknown";
	} // end of default constructor
	
	/**
	 * The overload constructor calls the default constructor
	 * and allows overriding the default values
	 * 
	 * Overload constructor that allows setting the object's fields
	 * @param playerName      The players name
	 * @param addWin          The players current total wins
	 * @param highestAttempts The player's current highest attempts
	 * @param lowestAttempts  The player's current lowest attempts
	 */
	public Player(String playerName, int addWin, int highestAttempts, int lowestAttempts) {
		this(); // Call the default constructor
		
		this.playerName = playerName;
		this.addWin = addWin;
		this.highestAttempts = highestAttempts;
		this.lowestAttempts = lowestAttempts;
	} // end of overload constructor

	/**
	 * Allows setting the number of attempts used by the player
	 * Stores it in lowest or highest attempts if it exceeds the current
	 * highest or lowest attempts
	 * @param attempts The number of attempts used to guess the correct number
	 */
	public void setAttempts(int attempts) {
		
		if (attempts > this.highestAttempts)
			this.highestAttempts = attempts;
		
		if (attempts < this.lowestAttempts)
			this.lowestAttempts = attempts;
		else if (this.lowestAttempts == 0)
			this.lowestAttempts = attempts;
	}
	
	/**
	 * Allows getting the player's name
	 * @return the player's name
	 */
	public String getName() {
		return playerName;
	}
	
	/**
	 * Allows setting the player's name
	 * @param playerName  The player's name
	 * @throws Exception  Throws exception if the no name was entered
	 */
	public void setName(String playerName) throws Exception{
		
		playerName = playerName.trim();
		
		if(playerName.isEmpty())
			throw new Exception("Name can not be empty.");
		
		this.playerName = playerName;	
	}
	
	/**
	 * Adds a win every time the player guessed correctly
	 */
	public void addWin() {
		this.addWin = ++addWin; 
	}
	
	/**
	 * Allows getting the last id used
	 * @return the last id used
	 */
	public static int getLastId() {
		return lastId;
	}
	
	/**
	 * Allows setting the last id used
	 * @param  lastId The last player id used
	 * @return        The last id used
	 */
	public static int setLastId(int lastId) {
		Player.lastId = lastId;
		return lastId;
	}
	
	/**
	 * Allows getting the player id
	 * @return the player id
	 */
	public  int getId() {
		return id;
	}
	
	/**
	 * Allows setting the player id
	 * @param id the player id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Allows getting the player's total wins
	 * @return the player's wins
	 */
	public int getAddWin() {
		return addWin;
	}
	
	/**
	 * Allows setting the player's total wins
	 * @param addWin The player's total wins
	 */
	public void setAddWin(int addWin) {
		this.addWin = addWin;
	}
	
	/**
	 * Allows getting the player's highest attempts
	 * @return the player's highest attempts
	 */
	public int getHighestAttempts() {
		return highestAttempts;
	}
	
	/**
	 * Allows setting the player's highest attempts
	 * @param highestAttempts The player's highest amount of attempts
	 */
	public void setHighestAttempts(int highestAttempts) {
		this.highestAttempts = highestAttempts;
	}
	
	/**
	 * Allows getting the player's lowest attempts
	 * @return the player's lowest attempts
	 */
	public int getLowestAttempts() {
		return lowestAttempts;
	}
	
	/**
	 * Allows setting the players lowest attempts
	 * @param lowestAttempts The player's lowest amount of attempts
	 */
	public void setLowestAttempts(int lowestAttempts) {
		this.lowestAttempts = lowestAttempts;
	}
	
	/**
	 * Allows getting the correct answer
	 * @return the randomly generated answer
	 */
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	/**
	 * Allows setting the randomly generated answer
	 * @param correctAnswer The randomly generated number
	 */
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
} // end of player class

 