package Tema6;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		try {
			Customer customer = new Customer("Dragos", "Splaiul Unirii", "dragos@gmail.com");
			
			SavingsAccount savings = new SavingsAccount(customer, 500.0, 1020304050);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Hi, " + customer.getName());
			System.out.println("Please enter the amount to widraw:");
			int amount = scan.nextInt();
		
		if (amount<savings.getBalance()) {
			System.out.println("Your new balance is: " + savings.getBalance());
			System.out.println("Thank you for using our ATM!");
		}else if(amount>savings.getBalance()); {
			System.out.println("The amount you entered is greater than the available balance: " + savings.getBalance());
			System.out.println("Thank you for using our ATM!");
		}
		}
		catch (InsuficientFundsException exception) {
			exception.printStackTrace();
		}
	}
}