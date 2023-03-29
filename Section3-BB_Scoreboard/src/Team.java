import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String name;
	
	private List<Player> players;

	public Team() {
		
		this.name = "Unknown";
		this.players = new ArrayList<Player>();
		
	}
	
	public Team(String name) {
		this();
		this.setName(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPlayer(String name, int jersey) throws Exception{
		
		Player dup = this.getPlayer(jersey);
		
		if(dup == null) {
			this.players.add(new Player(name, jersey));
		}
		else {
			throw new Exception("Jersey #" + jersey + " already assigned to " + dup.getName());
		}
	}
	
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
	
	public int getTeamPoints() {
		
		int teamPoints = 0;
		
		for(int i = 0; i < players.size(); i++) {
			teamPoints += this.players.get(i).getPoints();
		}
		return teamPoints;
	}
	
	public int getTeamFouls() {
		
		int teamFouls = 0;
		for(int i = 0; i < players.size(); i++) {
			teamFouls += this.players.get(i).getFouls();
		}
		return teamFouls;
	}
	
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
	
	public void displayTeamStats() {
		
		System.out.println("Team " + getName() + " Fouls = " + getTeamFouls() + " Points = " + getTeamPoints());
		// sysout "Team" + this.name() + "Fouls" +
	}

}
