package proState;

import java.util.Scanner;

public class DigitTOWord {

	public static void main(String[] args) {
		
		int n, num, r;
		String digitWords = "";
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10;  // Extract the digit number
			switch(r){
			case 0:
				digitWords = " Zero " + digitWords;
				break;
			case 1:
				digitWords = " One " + digitWords;
				break;
			case 2:
				digitWords = " Two " + digitWords;
				break;
			case 3:
				digitWords = " Three " + digitWords;
				break;
			case 4:
				digitWords = " Four " + digitWords;
				break;
			case 5:
				digitWords = " Five " + digitWords;
				break;
			case 6:
				digitWords = " Six " + digitWords;
				break;
			case 7:
				digitWords = " Seven " + digitWords;
				break;
			case 8:
				digitWords = " Eight " + digitWords;
				break;
			case 9:
				digitWords = " Nine " + digitWords;
				break;
			}
			num = num / 10;  // Remove the digit number
		}
		
		System.out.println("Digit: " + n);
		System.out.println("Digit in Words: " + digitWords);
		
	}

}
