package zoo.animal;

public class Chicken extends Bird{
	
	/**
	 * The bird's type
	 */
	protected final String type = "Chicken";
	

	/**
	 * Set the chicken's default values
	 */
	public Chicken() {
		super();
		
	}
	
	/**
	 * Allows creating a chicken using default values
	 * @param <T>
	 * @param birthdate The chicken's birth date
	 * @param weight The chicken's weight
	 * @throws Exception Could throw number of exceptions
	 */
	public <T> Chicken(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a chicken plus setting birth date, weight and wing span
	 * @param <T>
	 * @param birthdate The chicken's birth date
	 * @param weight The chicken's weight
	 * @param wingspan The chicken's wing span
	 * @throws Exception Could throw number of exceptions
	 */
	public <T> Chicken(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
	}
	
	/**
	 *Sets the chicken's type to "Chicken"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	/**
	 *Gives chicken the ability to eat
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating...");
	}

}
