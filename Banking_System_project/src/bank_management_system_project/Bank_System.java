package bank_management_system_project;

import java.util.Comparator;
import java.util.Scanner;

public class Bank_System  {
	
	//- show balance method 
	void showBalance(double balance) {
		System.out.println("$"+balance);
	}
	//---------------------------------------------------------
	
	//-  Deposit method  
	double diposite() {  // return type is double for user can deposit in . value as well as 
		
		double amount; // amount to deposit 
		
		// user input
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter An Amount To Be deposite:");
		amount=scanner.nextDouble();
//********
		// if user deposit -negative value its get error
		if (amount <= 0) {
			amount = 0;
			System.err.println("Amount can't be negative");
		} 
		return amount;
		
		
	}
	
	//-----------------------------------------------
	// withdraw() method 
	static double withdraw(double balance) {  

		double amount;
		
// user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		amount = scanner.nextDouble();
//********
		
		// if user try to withdraw amount more than current balance its give error massage
		if (amount > balance) {
			amount=0;
			System.err.println("INSUFFICIENT FUNDS");
		}
		
		// or user try to withdraw negative amount its give massage error "Amount can't be negative  "
		else if (amount<0) {
			System.err.println("Amount can't be negative");
			
		}
		// else return amount 
		
		return amount;

	
	}}
