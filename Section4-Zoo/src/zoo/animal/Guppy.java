package zoo.animal;

public class Guppy extends Fish implements Swim{
	
	/**
	 * Set the fish's type
	 */
	protected final String type = "Guppy";
	

	/**
	 * Set the guppy's default values
	 */
	public Guppy() {
		super();
		
	}
	
	/**
	 * Allows creating a guppy using default values
	 * @param <T> birthdate
	 * @param birthdate The guppy's birth date
	 * @param weight The guppy's fish's weight
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T> Guppy(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a guppy plus setting the birth date, weight and water type 
	 * @param <T1> birthdate
	 * @param <T2> water
	 * @param birthdate The guppy's birth date
	 * @param weight The guppy's weight
	 * @param water The guppy's water type
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T, S> Guppy(T birthdate, float weight, S water) throws Exception {
		super(birthdate, weight, water);
	}
	
	/**
	 * Set the type to "Guppy"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	/**
	 *Gives guppy the ability to eat
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating...");
	}

	/**
	 *Gives guppy the ability to propel
	 */
	@Override
	public void propel() {
		System.out.println("This " + this.type + " is propelling...");
		
	}

	/**
	 *Gives guppy the ability to drift
	 */
	@Override
	public void drift() {
		System.out.println("This " + this.type + " is drifting...");
		
	}

}
