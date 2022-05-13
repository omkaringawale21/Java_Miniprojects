package javaProject;

import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
	
		// Declare  and initialize balance, withdraw and deposite
		int balance  = 0, withdraw, deposit;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("ATM Machine \n");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT \n");
			System.out.print("Choose the Operation : ");
			
			// Get choice from user
			int choice = sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.print("Enter money to be Withdraw : ");
				
				// Get withdrawl money from user
				withdraw = sc.nextInt();
				
				// Check whether the balance is greater than or equal to the withdrawl amount
				if(balance >= withdraw){
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				}else{
					System.out.println("Insufficient Balance");
				}
			System.out.println();
			break;
			
			case 2:
				System.out.print("Enter Money to be Deposited : ");
				
				// Get deposite money from user
				deposit = sc.nextInt();
				
				// Add the deposite amount to the total balance
				balance = balance + deposit;
				System.out.println("Your Money has been Successfully Deposited");
				System.out.println();
			break;
			
			case 3:
				// Displaying the total balance of the user
				System.out.println("Balance : " + balance);
				System.out.println();
			break;
			
			case 4:
				// Exit from the menu
			System.exit(0);
				
			}
			
		}

	}

}
