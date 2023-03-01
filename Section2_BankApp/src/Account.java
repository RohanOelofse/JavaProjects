/**
 * Class used to create Account objects
 * @author rohan
 *
 */
public class Account {
	
	/**
	 * this is a class level field - all accounts share this field
	 * this is used to generate the next account number
	 */
	private static int lastNumber = 0;
	
	// instance level fields - unique per account
	// each account object fields
	/**
	 * The account number is unique 
	 */
	private int number;
	/**
	 * Current account balance
	 */
	private double balance;
	private String firstName;
	private String lastName;
	
	/**
	 * default constructor that will return a unique account object 
	 * Default constructor automatically assigns the next account number
	 * and initialize
	 */
	public Account () {
		System.out.println("Default constructor");
		
		this.number = ++Account.lastNumber;
		this.balance = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	} // end of default
	
	// 
	/**
	 * The overload constructor calls the default constructor 
	 * and allows overriding the default values
	 * Overload constructor that allows setting the object's fields
	 * @param firstName Account owner's first name
	 * @param lastName Account owner's last name
	 * @param balance Account current balance
	 */
	public Account(String firstName, String lastName, double balance) {
		this(); // call the default constructor
		
		// can not run before calling default constructor
		System.out.println("Overload constructor");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	} // end of overload constructor

	public static int getLastNumber() {
		return lastNumber;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == "")
			System.out.println("First name can not be blank");
		else
			this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == "")
			System.out.println("Last name can not be blank");
		else
			this.lastName = lastName;
		
	}
	
	public void deposit(double amount) {
		if (amount > 0)
			this.balance += amount;
		else
			System.out.println("Invalid amount, diposit canceled: " + amount);
	}
	
	public void withdrawal(double amount) {
		if (amount > this.balance)
			System.out.println("Invalid amount, withdrawal can not exceed balance: " + this.balance);
		else if (amount > 0)
			this.balance -= amount;
		else
			System.out.println("Invalid amount, withdrawal cancelled: " + amount);
			
	}

	
} // end of Account class
