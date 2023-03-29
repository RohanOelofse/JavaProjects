
public class Player {
	
	/**
	 * The Player's name.
	 */
	private String name;
	
	/**
	 * The Player's jersey.
	 */
	private int jersey;
	
	/**
	 * The Player's number of fouls.
	 */
	private int fouls;
	
	/**
	 * The Player's number of 1pt field goals.
	 */
	private int fieldGoals_1pt;
	
	/**
	 * The Player's number of 2pt field goals.
	 */
	private int fieldGoals_2pt;
	
	/**
	 * The Player's number of 3pt field goals.
	 */
	private int fieldGoals_3pt;
	
	/*
	 * Set the Player's properties to default values.
	 */
	public Player(){
		this.name = "Unknown";
		this.jersey = 0;
		this.fouls = 0;
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;
		
	}
	
	/**
	 * Allow creating a Player by ONLY setting the jersey number.
	 * This is necessary when trying to find a Player in the Team's ArrayList.
	 * The constructor calls this.setJersey method for data validation
	 * @param jersey      Player's jersey number
	 * @throws Exception  Throws custom Exception
	 */
	public Player(int jersey) throws Exception {
		this();
		try {
			this.setJersey(jersey);
		}catch (Exception e) {
			throw e;
		}
	}
	
	/**
	 * Allow creating a Player plus setting their name and jersey number
	 * The constructor calls both the this.setName and setJersey methods for data validation
	 * @param name        Player's name
	 * @param jersey	  Player's jersey number
	 * @throws Exception  Could throw exception if an invalid jersey number is entered
	 */
	public Player(String name, int jersey) throws Exception {
		this();
		this.setName(name);
		this.setJersey(jersey);
		
	}
	
	/**
	 * Get the Player's name.
	 * @return The player's name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set the Player's name.
	 * @param name The player's name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the Player jersey number
	 * @return The player's jersey number.
	 */
	public int getJersey() {
		return this.jersey;
	}
	
	/**
	 * Set the Player's jersey number if it's a positive number between 1 and 99.
	 * @param jersey The player's jersey number
	 * @throws Exception Invalid jersey number
	 */
	public void setJersey(int jersey) throws Exception {
		
		if(jersey > 0 && jersey <= 99) {
			this.jersey = jersey;
		}
		else {
			throw new Exception("Invalid jersey number. Must be between 1-99");
		}
	}
	
	/**
	 * Get the player's number of fouls.
	 * @return The number of fouls by the player.
	 */
	public int getFouls() {
		return fouls;
	}
	
	/**
	 * Get the player's number of 1pt field goals made.
	 * @return The number of 1pt field goals made by the Player.
	 */
	public int getFieldGoals_1pt() {
		return fieldGoals_1pt;
	}
	
	/**
	 * Get the player's number of 2pt field goals made.
	 * @return The number of 2pt field goals made by the player.
	 */
	public int getFieldGoals_2pt() {
		return fieldGoals_2pt;
	}
	
	/**
	 * Get the player's number of 3pt field goals made.
	 * @return The number of 3pt field goals made by the player.
	 */
	public int getFieldGoals_3pt() {
		return fieldGoals_3pt;
	}
	
	/**
	 * Increment the Player's fouls by 1.
	 */
	public void foul() {
		this.fouls++;
	}
	
	/**
	 * Increment the appropriate field goal type, using a switch that also handles for invalid data.
	 * @param shotType	The shot type made 1=1pt Field Goal Shot, 2=2pt Field Goal Shot, 3=3pt Field Goal
	 */
	public void shot(int shotType) {
		
		switch (shotType) {
			case 1:
				this.fieldGoals_1pt++;
				break;
			case 2:
				this.fieldGoals_2pt++;
				break;
			case 3:
				this.fieldGoals_3pt++;
				break;
		}		
	}
	
	/**
	 * Get the Player's total points by calculating it by field goal types.
	 * @return The player's total points
	 */
	public int getPoints() {
		return (fieldGoals_1pt + (fieldGoals_2pt * 2) + (fieldGoals_3pt * 3));
	}
	
	/**
	 * Display the Player's jersey number, name, # of fouls, and # of points via getPoints method
	 */
	public void displayStats() {
		System.out.println("#" + getJersey() + " " + getName() + "Fouls = " + getFouls() + " Points = " + getPoints());
	}
	
	/*
	 * Instead of verifying two players are identical by equal identities.
	 * This method will verify two players are the same by ONLY their jersey number.
	 * This allows the ArrayList.getIndex() method to return a player's by only checking their jersey number.
	 */
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Player))
			return false;
		
		Player other = (Player)object;
		
		if(this.jersey == other.getJersey())
			return true;
		else
			return false;
	}

}
