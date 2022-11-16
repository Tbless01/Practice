package chapterTwo;

import java.util.Scanner;

public class Receipt{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
			
	System.out.print("Cashier: ");
	String cashier = input.nextLine();


	System.out.print("Customer name: ");
	String customerName = input.nextLine();

	System.out.print("Good purchased: ");
	String goodPurchased = input.nextLine();

	System.out.print("Rate: ");
	int rate = input.nextInt();

	
	System.out.print("Quantity: ");
	int quantity = input.nextInt();

	
	System.out.print("Date:\n ");
	int day = input.nextInt();
	int month = input.nextInt();
	int year = input.nextInt();
	
	
	int totalBalance = rate * quantity;


	System.out.print("Amount paid: ");
	int paid = input.nextInt();

	int balance = totalBalance - paid;
	
	
		


		System.out.printf(" \t\t\t\t\t %n");
		
		System.out.printf(" ========================================%n");
		
		System.out.printf("| \t\tREGNOS LTD\t\t |%n");

		System.out.printf("|----------------------------------------|%n");
		
		System.out.printf("| \t\tInvoice\t\t\t |%n");
		
		System.out.printf("|----------------------------------------|%n");

		System.out.printf(" \t\t\t\t\t %n");
		
		System.out.printf(" Date:  %s-%s-%s\t\t\t\t\t %n",day, month, year );
		
		System.out.printf(" Cashier:  %s\t\t\t\t %n", cashier);
		
		System.out.printf(" Customer's name:  %s\t %n", customerName);
			
		System.out.printf(" Good bought:  %s\t\t\t\t %n", goodPurchased );

		System.out.printf(" Quantity:  %d\t\t\t\t %n", quantity);	

		System.out.printf(" Rate:  =N=%d\t\t\t\t\t %n", rate);
		
		System.out.printf("----------------------------------------%n");
		
		System.out.printf(" \tTotal Balance: =N=%d\t %n", totalBalance );

		System.out.printf("----------------------------------------%n");

		System.out.printf(" \t\t\t\t\t %n");

		System.out.printf(" Amount paid: =N=%d\t\t\t\t %n",paid);
		  
		System.out.printf(" \t\tBalance: =N=%d\t\t %n",balance);

				

		System.out.printf("|________________________________________|%n");
		

		
	

	}


}
