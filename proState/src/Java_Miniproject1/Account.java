package Java_Miniproject1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		// Set the Customer Number
		public int setCustomerNumber(int customerNumber){
			this.customerNumber = customerNumber;
			return customerNumber;
		}
		// Get the Customer Number
		public int getCustomerNumber(){
			return customerNumber;
		}
		
		// Set the Pin Number
		public int setPinNumber(int pinNumber){
			this.pinNumber = pinNumber;
			return pinNumber;
		}
		// Get the Pin Number
		public int getPinNumber(){
			return pinNumber;
		}
		
		// Get Checking Account Balance
		public double getCheckingBalance(){
			return checkingBalance;
		}
		
		// Get Saving Account Balance
		public double getSavingBalance(){
			return savingBalance;
		}
		
		// Calculate Checking Account Withdrawal
		public double calcCheckingWithdraw(double amount){
			checkingBalance = (checkingBalance - amount);
			return checkingBalance;
		}
		
		// Calculate Saving Account Withdrawal
		public double calcSavingWithdraw(double amount){
			savingBalance = (savingBalance - amount);
			return savingBalance;
		}
		
		// Calculate Checking Account Deposite
		public double calcCheckingDeposit(double amount){
			checkingBalance = (checkingBalance + amount);
			return checkingBalance;
		}
		
		// Calculate Saving Account Deposite
		public double calcSavingDeposit(double amount){
			savingBalance = (savingBalance + amount);
			return savingBalance;
		}
		
		// Customer Checking Account Withdraw Input
		public void getCheckingWithdrawInput(){
			System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
			System.out.print("Amount you want to withdraw from Checking Account : ");
			double amount = input.nextDouble();
			
			if((checkingBalance - amount) >= 0){
				calcCheckingWithdraw(amount);
				System.out.print("New Checking Account Balance : " + moneyFormat.format(checkingBalance) + "\n");
			}else{
				System.out.print("Balance cannot be negavite." + "\n");
			}
		}
		
		// Customer Saving Account Withdraw Input
		public void getSavingWithdrawInput(){
			System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to withdraw from Saving Account : ");
			double amount = input.nextDouble();
			
			if((savingBalance - amount) >= 0){
				calcSavingWithdraw(amount);
				System.out.print("New Saving Account Balance : " + moneyFormat.format(savingBalance) + "\n");
			}else{
				System.out.print("Balance cannot be negavite." + "\n");
			}
		}
		
		// Customer Checking Account Deposit Input
		public void getCheckingDepositInput(){
			System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
			System.out.print("Amount you want to deposit your Checking Account : ");
			double amount = input.nextDouble();
			
			if((checkingBalance + amount) >= 0){
				calcCheckingDeposit(amount);
				System.out.print("New Checking Account Balance : " + moneyFormat.format(checkingBalance) + "\n");
			}else{
				System.out.print("Balance cannot be negavite." + "\n");
			}
		}
		
		// Customer Saving Account Deposit Input
		public void getSavingDepositInput(){
			System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to deposit your Saving Account : ");
			double amount = input.nextDouble();
			
			if((savingBalance + amount) >= 0){
				calcSavingDeposit(amount);
				System.out.print("New Saving Account Balance : " + moneyFormat.format(savingBalance) + "\n");
			}else{
				System.out.print("Balance cannot be negavite." + "\n");
			}
		}
		
		private int customerNumber;
		private int pinNumber;
		private double checkingBalance = 0;
		private double savingBalance = 0;
		
}
