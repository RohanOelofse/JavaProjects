package zoo.animal;

public abstract class Fish extends Animal{
	
	/**
	 * Set's the fish's type
	 */
	protected final String type = "Fish";
	
	/**
	 * The fish's water type
	 */
	protected Water water;

	/**
	 * Sets the fish's default values
	 */
	public Fish() {
		super();
		this.water = Water.UNKNOWN;
	}
	
	/**
	 * Allows creating a fish using default values
	 * @param <T> birthdate
	 * @param birthdate The fish's birth date
	 * @param weight The fish's weight
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a fish plus setting the birth date, weight and water type 
	 * @param <T1> birthdate
	 * @param <T2> water
	 * @param birthdate The fish's birth date
	 * @param weight The fish's weight
	 * @param water The fish's water type
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T1, T2> Fish(T1 birthdate, float weight, T2 water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}
	
	/**
	 * Get the fish's water type
	 * @return The fish's water type
	 */
	public Water getWater() {
		return this.water;
	}
	
	/**
	 * Set the fish's water type
	 * @param <T> water
	 * @param water The fish's water type
	 * @throws Exception Throws exception for invalid water type
	 */
	public <T> void setWater(T water) throws Exception {
		
		if (water instanceof String) {
			
			String s = (String) water;
			
			s = s.toLowerCase();
			
			switch (s) {
			case "s":
			case "salt":
			case "saltwater":
				this.water = Water.SALT;
				break;
			case "f":
			case "fresh":
			case "freshwater":
				this.water = Water.FRESH;
				break;
			default:
				this.water = Water.UNKNOWN;
				break;
			}
		}
		else if (water instanceof Water){
			Water w = (Water) water;
		}
		else {
			throw new Exception("Invalid water: " + water);
		}
	}
	
	/**
	 *Set the fish's type to "Fish"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}

}
