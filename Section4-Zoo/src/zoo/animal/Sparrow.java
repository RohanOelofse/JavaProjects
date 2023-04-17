package zoo.animal;

public class Sparrow extends Bird implements Flying{
	
	/**
	 * The bird's type
	 */
	protected final String type = "Sparrow";

	/**
	 * Set the sparrow's default values
	 */
	public Sparrow() {
		super();
		
	}
	
	/**
	 * Allows creating a sparrow using default values
	 * @param <T>
	 * @param birthdate The sparrow's birth date
	 * @param weight The sparrow's weight
	 * @throws Exception Could throw number of exceptions
	 */
	public <T> Sparrow(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a sparrow plus setting birth date, weight and wing span
	 * @param <T>
	 * @param birthdate The sparrow's birth date
	 * @param weight The sparrow's weight
	 * @param wingspan The sparrow's wing span
	 * @throws Exception Could throw number of exceptions
	 */
	public <T> Sparrow(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
	}
	
	/**
	 *Sets the sparrow's type to "Sparrow"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}

	/**
	 *Gives sparrow the ability to fly
	 */
	@Override
	public void fly() {
		System.out.println("This " + this.type + " is flying...");
		
	}

	/**
	 *Gives sparrow the ability to soar
	 */
	@Override
	public void soar() {
		System.out.println("This " + this.type + " is soaring...");
		
	}
	
	/**
	 *Gives sparrow the ability to eat
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating...");
	}

}
