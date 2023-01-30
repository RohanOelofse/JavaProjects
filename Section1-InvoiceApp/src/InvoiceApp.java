import java.util.Scanner;

/*******************************************************
 
Description: First assignment
Programmer Rohan Oelofse
Date written: 2023.01.26
GitHub: https://github.com/RohanOelofse/JavaProjects
 ******************************************************/

public class InvoiceApp {

    public static void main(String[] args) {
    	
    	// initialize variables for use in calculating averages
    	int invoiceCount = 0;
    	int lineItems = 0;
        double invoiceTotal = 0.0;
        double discountTotal = 0.0;
        double discountPercent = 0.0;
        double subTotal = 0.0;
        double discountAmount = 0.0;
        double total = 0.0;
        
        String choice = "y";
        String input = "?";
        
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator V2");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        

        // perform invoice calculations until choice is "n" or "N" 
       
        while (!choice.equalsIgnoreCase("n")) {
        	
        	// get the invoice line items from the user
            System.out.print("Enter the number of invoice line items:   ");
            lineItems = sc.nextInt();
        	
        	for(int i = 0; i < lineItems; i++)
        	{
        		System.out.print("Enter line item amount:   ");
                subTotal += sc.nextDouble();
        	}
           

            // calculate the discount amount and total
            if (subTotal >= 500) {
                discountPercent = 0.25;
            } else if (subTotal >= 200) {
                discountPercent = 0.2;
            } else if (subTotal >= 100) {
                discountPercent = 0.1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subTotal * discountPercent;
            total = subTotal - discountAmount;
            
            // accumulate the invoice count and invoice total
            invoiceTotal = invoiceTotal + total;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;  

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
        // calculate and display invoice count, average invoice, and average discount
        String message = "Number of invoices: " + invoiceCount + "\n"
                       + "Average invoice:    " + invoiceTotal / invoiceCount + "\n"
                       + "Average discount:   " + discountTotal / invoiceCount + "\n";
        System.out.println(message);
    }
}