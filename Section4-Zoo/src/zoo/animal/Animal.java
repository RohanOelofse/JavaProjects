package zoo.animal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Animal {

	/**
	 * The animal's number
	 */
	private static int counter = 0;
	
	/**
	 * Format of date
	 */
	protected static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	/**
	 * The animal's ID
	 */
	protected final int id;
	
	/**
	 * The animal's type
	 */
	protected final String type;
	
	/**
	 * The animal's gender
	 */
	protected Gender gender;
	
	/**
	 * https://www.baeldung.com/java-creating-localdate-with-values
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 *
	 *The animal's date of birth
	 * 
	 */
	private LocalDate birthdate;
	
	/**
	 * The animal's weight
	 */
	private float weight;
	
	/**
	 * Set the animal's properties to default values
	 */
	public Animal() {
		this.id = ++Animal.counter;
		this.type = "Animal";
		this.gender = Gender.UNKNOWN;
		this.birthdate = null;
		this.weight = 0;
	}
	
	/**
	 * Allows creating an animal plus setting their birth date and weight
	 * @param <T> Type
	 * @param birthdate The animal's date of birth
	 * @param weight The animal's weight
	 * @throws Exception Could throw exception for invalid gender, date or weight
	 */
	public <T> Animal(T birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}

	/**
	 * get the animal's id
	 * @return The animal's id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Get the animal's gender
	 * @return The animal's gender
	 */
	public Gender getGender() {
		return this.gender;
	}
	
	/**
	 * Get the animal's birth date
	 * @return The animal's birth date
	 */
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	/**
	 * Get the animal's birth date in correct format
	 * @return The anmial's birth date
	 */
	public String getBirthdateStr() {
		if (this.birthdate == null)
			return "unknown";
		else
			return Animal.FORMAT.format(this.birthdate);
	}
	
	/**
	 * Get the anmial's type
	 * @return The animal's type
	 */
	public String getType() {
		return this.getType();
	}
	
	/**
	 * Get the animal's weight
	 * @return The animal's weight
	 */
	public float getWeight() {
		return this.weight;
	}
	
	/**
	 * Set the animals gender using a switch that also handles invalid gender
	 * @param <T>
	 * @param gender The animals gender
	 * @throws Exception Invalid gender
	 */
	public <T> void setGender(T gender) throws Exception {
		
		if (gender instanceof String) {
			
			String s = (String) gender;
			
			s = s.toLowerCase();
			
			s = s.toLowerCase();
			
			switch(s) {
			case "m":
			case "male":
				this.gender = Gender.MALE;
				break;
			case "f":
			case "female":
				this.gender = Gender.FEMALE;
				break;
			default:
				this.gender = Gender.UNKNOWN;
				break;
			}
		}
		
		else if (gender instanceof Gender) {
			Gender g = (Gender) gender;
			this.gender = g;
		}
		else {
			throw new Exception("Invalid gender: " + gender);
		}
	}
	
	/**
	 * Set the animal's birth date
	 * @param <T>
	 * @param birthdate The animals birth date
	 * @throws Exception Could throw exception for invalid birth date
	 */
	public <T> void setBirthdate(T birthdate) throws Exception {


		if (birthdate instanceof String) {
			
			String date = (String) birthdate;
		    this.birthdate = LocalDate.parse(date, Animal.FORMAT);;
		    
		} else if (birthdate instanceof LocalDate){
			
			this.birthdate = (LocalDate) birthdate;
			
			
		} else {
			
			throw new Exception("Invalid date MM-dd-yyyy: " + birthdate);
			
		}
			
	}
	
	/**
	 * Set the animal's weight
	 * @param weight The animal's weight
	 * @throws Exception Could throw exception if weight is less than zero
	 */
	public void setWeight(float weight) throws Exception {
		
		if (weight > 0)
			this.weight = weight;
		else
			throw new Exception("Invalid weight: " + weight);
	}
	
	/**
	 *Sets the animal's type to display correctly
	 */
	@Override
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	/**
	 * All animals have the method "eat"
	 */
	abstract public void eat();

}
