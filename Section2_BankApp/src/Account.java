
public class Account {
	
	// this is a class level field - all accounts share this field
	private static int lastNumber = 0;
	
	// instance level fields - unique per account
	// each account object fields
	private int number;
	private double balance;
	private String firstName;
	private String lastName;
	
	//default constructor that will return a unique account object
	public Account () {
		System.out.println("Default constructor");
		
		this.number = ++Account.lastNumber;
		this.balance = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	} // end of default
	
	// overload constructor that allows setting the object's fields
	public Account(String firstName, String lastName, double balace) {
		this(); // call the default constructor
		
		// can not run before calling default constructor
		System.out.println("Overload constructor");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balace;
	} // end of overload constructor

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
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
} // end of Account class
