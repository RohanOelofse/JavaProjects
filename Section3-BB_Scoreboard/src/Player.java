
public class Player {
	
	private String name;
	
	private int jersey;
	
	private int fouls;
	
	private int fieldGoals_1pt;
	
	private int fieldGoals_2pt;
	
	private int fieldGoals_3pt;
	
	private int points;
	
	
	/*
	 * 
	 */
	public Player(){
		this.name = "Unknown";
		this.jersey = 0;
		this.fouls = 0;
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;
		
	}
	
	public Player(int jersey) throws Exception {
		this();
		try {
			this.setJersey(jersey);
		}catch (Exception e) {
			throw e;
		}
	}
	
	
	public Player(String name, int jersey) throws Exception {
		this();
		this.setName(name);
		this.setJersey(jersey);
		
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getJersey() {
		return this.jersey;
	}
	
	public void setJersey(int jersey) throws Exception {
		
		if(jersey > 0 && jersey <= 99) {
			this.jersey = jersey;
		}
		else {
			throw new Exception("Invalid jersey number. Must be between 1-99");
		}
	}
	
	public int getFouls() {
		return fouls;
	}
	
	public int getFieldGoals_1pt() {
		return fieldGoals_1pt;
	}
	
	public int getFieldGoals_2pt() {
		return fieldGoals_2pt;
	}
	
	public int getFieldGoals_3pt() {
		return fieldGoals_3pt;
	}
	
	public void foul() {
		this.fouls++;
	}
	
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
	
	public int getPoints() {
		return (fieldGoals_1pt + (fieldGoals_2pt * 2) + (fieldGoals_3pt * 3));
	}
	
	public void displayStats() {
		System.out.println("#" + getJersey() + " " + getName() + "Fouls = " + getFouls() + " Points = " + getPoints());
	}
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
