public class BankApp {
	
	public static void printAccount(Account account) {
		System.out.println("Ref Val: " + account);
		System.out.println("Account: " + account.getNumber());
		System.out.println("Name: " + account.getFirstName() + " " + account.getLastName());
		System.out.println("Balance: " + account.getBalance());
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// Instantiate a new Account object using the default constructor
		Account account1 = new Account(); // account1 is a reference variable
		BankApp.printAccount(account1);

		// Change the instance's field values
		account1.setBalance(1000.10);
		account1.setFirstName("Debbie");
		account1.setLastName("Johnson");
		BankApp.printAccount(account1);
		
		// Instantiate another new Account object using the overload constructor
		Account account2 = new Account("Sam", "Smith", 2000.20);
		BankApp.printAccount(account2);
		
		// Displaying class level field's value
		//System.out.println("Class level field lastNumber: " + Account.lastNumber);
		
	}

}
