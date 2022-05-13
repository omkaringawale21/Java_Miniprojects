package Java_Miniproject1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
		
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		// Validate Login Information Customer Number and Pin Number
		public void getLogin() throws IOException{
			int x = 1;
			
			do{
				try{
					
					data.put(9876543, 9876);
					data.put(3489898, 1890);
					data.put(5989329, 2130);
					data.put(8921329, 1256);
					data.put(8124293, 2156);
					data.put(3658942, 1285);
					
					System.out.println("Welcome to the ATM Project!");
					
					System.out.print("Enter Your Customer Number : ");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.print("Enter Your Pin Number : ");
					setPinNumber(menuInput.nextInt());
					
				}catch(Exception e){
					System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
					x = 2;
				}
				for(Entry<Integer, Integer> entry : data.entrySet()){
					if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
						getAccountType();
					}
				}
				System.out.println("\n" + "Wrong Customer Number and Pin Number." + "\n");
			}while(x == 1);
			
		}
		
		// Display Account Type Menu with Selection
		public void getAccountType() {
			System.out.println("Select the Account you want to Access :");
			System.out.println("Type 1 - Checking Account : ");
			System.out.println("Type 2 - Saving Account : ");
			System.out.println("Type 3 - Exit");
			System.out.print("Choice : ");
			
			selection = menuInput.nextInt();
			
			switch(selection){
			case 1:
				getChecking();
				break;
			
			case 2:
				getSaving();
				break;
				
			case 3:
				System.out.println("Thank you for Using This ATM, bye.");
				break;
				
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getAccountType();
			}
		}
		
		// Display Checking Account Menu with Selections
		public void getChecking(){
			System.out.println("Checking Account : ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposite Funds");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice : ");
			
			selection = menuInput.nextInt();
			
			switch(selection){
			case 1:
				System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for Using This ATM, bye.");
				System.exit(0);
				break;
				
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getChecking();
			}
		}
		
		// Display Saving Account Menu with Selections
		public void getSaving(){
			System.out.println("Saving Account : ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposite Funds");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice : ");
			
			selection = menuInput.nextInt();
			
			switch(selection){
			case 1:
				System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for Using This ATM, bye.");
				System.exit(0);
				break;
				
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getSaving();
			}
		}
		int selection;
		
}
