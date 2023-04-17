package zoo.animal;

public abstract class Bird extends Animal {
	
	/**
	 * The bird's type
	 */
	protected final String type = "Bird";
	
	/**
	 * The bird's wing span
	 */
	protected float wingspan;

	/**
	 * Set the bird's wing span to default values
	 */
	public Bird() {
		super();
		this.wingspan = 0;
		
	}
	
	/**
	 * Set's the bird's properties to default values
	 * @param <T>
	 * @param birthdate The bird's birth date
	 * @param weight The bird's weight
	 * @throws Exception Could throw exception for invalid wing span
	 */
	public <T> Bird(T birthdate, float weight) throws Exception {
		super(birthdate, weight);

	}
	
	/**
	 * Allows creating a bird plus setting the birth date, weight and wing span
	 * @param <T>
	 * @param birthdate The bird's birth date
	 * @param weight The bird's weight
	 * @param wingspan The bird's wing span
	 * @throws Exception Could throw exception for invalid wing span
	 */
	public <T> Bird(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.setWingspan(wingspan);

	}
	
	/**
	 * Get the bird's wing span
	 * @return The bird's wing span
	 */
	public float getWingsan() {
		return wingspan;
	}
	
	/**
	 * Set the bird's wing span
	 * @param wingspan The bird's wing span
	 * @throws Exception Could throw exception if the wingspan is less than zero
	 */
	public void setWingspan(float wingspan) throws Exception {
		
		if (wingspan > 0) {
			this.wingspan = wingspan;
		}
		else {
			throw new Exception("Invalid wingspan: " + wingspan);
		}
	}
	
	/**
	 *Set the bird's type to "bird"
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}

}
