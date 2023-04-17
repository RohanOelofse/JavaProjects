package zoo.animal;

public class FlyingFish extends Fish implements Flying, Swim{
	
	/**
	 * Set the fish's type
	 */
	protected final String type = "FlyingFish";

	/**
	 * Set the flying fish's default values
	 */
	public FlyingFish() {
		super();
	}
	
	/**
	 * Allows creating a flying fish using default values
	 * @param <T> birthdate
	 * @param birthdate The flying fish's birth date
	 * @param weight The flying fish's weight
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T> FlyingFish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a flying fish plus setting the birth date, weight and water type 
	 * @param <T1> birthdate
	 * @param <T2> water
	 * @param birthdate The flying fish's birth date
	 * @param weight The flying fish's weight
	 * @param water The flying fish's water type
	 * @throws Exception Could throw exception for invalid water type
	 */
	public <T, S> FlyingFish(T birthdate, float weight, S water) throws Exception {
		super(birthdate, weight, water);
	}
	
	/**
	 * Set the type to "FlyingFish"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	/**
	 *Gives flying fish the ability to fly
	 */
	@Override
	public void fly() {
		System.out.println("This " + this.type + " is flying...");
		
	}

	/**
	 *Gives flying fish the ability to soar
	 */
	@Override
	public void soar() {
		System.out.println("This " + this.type + " is soaring...");
		
	}
	
	/**
	 *Gives flying fish the ability to eat
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating...");
	}

	/**
	 *Gives flying fish the ability to propel
	 */
	@Override
	public void propel() {
		System.out.println("This " + this.type + " is propelling...");
		
	}

	/**
	 *Gives flying fish the ability to drift
	 */
	@Override
	public void drift() {
		System.out.println("This " + this.type + " is drifting...");
		
	}

}
