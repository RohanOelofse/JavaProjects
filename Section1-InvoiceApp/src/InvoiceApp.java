import java.util.Scanner;

/*******************************************************
 
Description: This program asks the user to input the 
			 number of invoices the proceeds to calculate the
			 subtotal, discount percent, discount amount
			  and invoice total.
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
        double subtotal = 0.0;
        double discountAmount = 0.0;
        double discountInvoiceTotal = 0.0;
        
        String choice = "y";
        
     // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        // welcome the user to the program
        System.out.print("===============================================");
        System.out.println("Welcome to the Invoice Total Calculator V2");
          // print a blank line

        // perform invoice calculations until choice is "n" or "N" 
        while (!choice.equalsIgnoreCase("n")) {
        	
        	// get the invoice line items from the user
        	System.out.print("===============================================");
            System.out.println();
            System.out.print("Enter the number of invoice line items:   ");
            lineItems = sc.nextInt();
            System.out.println();  // print a blank line
            System.out.print("===============================================");
            System.out.println();  // print a blank line
        	
            //allow user to enter invoice line items
        	for(int i = 1; i <= lineItems; i++)
        	{
        		System.out.print("Enter line #" + i + " item amount:   ");
                subtotal += sc.nextDouble();
        	}
        	

            // calculate the discount amount and total
            if (subtotal >= 500) {
                discountPercent = 0.25;
            } else if (subtotal >= 200) {
                discountPercent = 0.2;
            } else if (subtotal >= 100) {
                discountPercent = 0.1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subtotal * discountPercent;
            discountInvoiceTotal = subtotal - discountAmount;
            
            // accumulate the invoice count and invoice total
            invoiceTotal = invoiceTotal + discountInvoiceTotal;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;  

            // display the discount amount and total
            System.out.println();
            System.out.print("===============================================");
            System.out.println();
            System.out.printf("%20s: %,10.2f\n", "Subtotal", subtotal);
            System.out.printf("%20s: %,10.2f\n", "Discount percent", discountPercent);
            System.out.printf("%20s: %,10.2f\n", "Discount amount", discountAmount);
            System.out.printf("%20s: %,10.2f\n", "Invoice total", discountInvoiceTotal);
            System.out.println();
            System.out.print("===============================================");
            System.out.println();
            
            choice = sc.nextLine(); // clear the return char still in input buffer

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
        System.out.println("Bye :(");
        
        sc.close();
    } // end of main
} // end of class