import java.util.ArrayList;
import java.util.List;

public class Team {
	
	/**
	 * The team's name.
	 */
	private String name;
	
	/**
	 * Creates a list of player's on a team
	 */
	private List<Player> players;
	
	/**
	 * Set the team's properties to default values
	 */
	public Team() {
		
		this.name = "Unknown";
		this.players = new ArrayList<Player>();
		
	}
	
	/**
	 * Allows creating a team by setting the team's name
	 * @param name The team's name
	 */
	public Team(String name) {
		this();
		this.setName(name);
	}
	
	/**
	 * Get the teams name
	 * @return The players name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set the Team's name
	 * @param name The Team's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Add a player to the Team, by using the overload constructor that allows setting their name and jersey number too.
	 * This method will verify that the jersey number is not already used by another player by calling the Team.getPlayer method.
	 * and if it is, then it will throw an exception back to the calling method
	 * @param name The player's name.
	 * @param jersey The player's jersey number.
	 * @throws Exception Jersey number # already assigned.
	 */
	public void addPlayer(String name, int jersey) throws Exception{
		
		Player dup = this.getPlayer(jersey);
		
		if(dup == null) {
			this.players.add(new Player(name, jersey));
		}
		else {
			throw new Exception("Jersey #" + jersey + " already assigned to " + dup.getName());
		}
	}
	
	/**
	 * Get a Player by their jersey number using the ArrayList.indexOf method
	 * If the indexOf method returns -1 then this method returns null otherwise,
	 * it returns the Player object associated with the jersey number.
	 * @param jersey The player's jersey number.
	 * @return If a player is found, it will return the Player object otherwise a null value.
	 * @throws Exception Creating a player with a invalid jersey number could throw an error
	 */
	public Player getPlayer(int jersey) throws Exception{
		
		int index = this.players.indexOf(new Player(jersey));
		
		if (index == -1) {
			return null;
		}
		else 
		{
			return this.players.get(index);
		}
	}
	
	/**
	 * Get the total number of points for the entire Team by calling the Player.getPoints method.
	 * @return The teams's points.
	 */
	public int getTeamPoints() {
		
		int teamPoints = 0;
		
		for(int i = 0; i < players.size(); i++) {
			teamPoints += this.players.get(i).getPoints();
		}
		return teamPoints;
	}
	
	/**
	 * Get the total number of fouls for the entire Team using the Player.getFouls method.
	 * @return The total number of fouls for the Team.
	 */
	public int getTeamFouls() {
		
		int teamFouls = 0;
		for(int i = 0; i < players.size(); i++) {
			teamFouls += this.players.get(i).getFouls();
		}
		return teamFouls;
	}
	
	/**
	 * Displays each Player's detail stats for the entire Team using the Player's getter methods.
	 * This method uses the printf method for proper stats alignment.
	 */
	public void displayDetailStats() {
		
		System.out.printf("%2s   %8s   %2s   %2s   %2s   %2s   %2s  %n", "Jersey", "Name", "Fouls", "1pt", "2pt", "3pt", "Total");
		System.out.println("-------------------------------------------------------");
		 
		
		for(int i = 0; i < players.size(); i++) {
			String name = players.get(i).getName();
			int jersey = players.get(i).getJersey();
			int fouls = players.get(i).getFouls();
			int pts1 = players.get(i).getFieldGoals_1pt();
			int pts2 = players.get(i).getFieldGoals_2pt();
			int pts3 = players.get(i).getFieldGoals_3pt();
			int totalPoints = players.get(i).getPoints();
			
			
			System.out.printf("| %1d | %10s | %4d | %4d | %4d | %4d | %4d |%n", jersey, name, fouls, pts1, pts2, pts3, totalPoints);
			
			
		}
		System.out.println();
	}
	
	/**
	 * Display the Team's summary stats using the Team.getTeamFouls and getTeamPoints methods.
	 */
	public void displayTeamStats() {
		
		System.out.println("Team " + getName() + " Fouls = " + getTeamFouls() + " Points = " + getTeamPoints());
		// sysout "Team" + this.name() + "Fouls" +
	}

}
