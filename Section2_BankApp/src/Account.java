
public class Account {
	
	// this is a class level field - all accounts share this field
	public static int nextAccount = 0;
	
	// instance level fields - unique per account
	// each account object fields
	public int number;
	public double balance;
	public String firstName;
	public String lastName;
	
	//default constructor that will return a unique account object
	public Account () {
		System.out.println("Default constructor");
		
		this.number = ++Account.nextAccount;
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
	
} // end of Account class
