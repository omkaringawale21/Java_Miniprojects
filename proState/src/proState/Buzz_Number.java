package proState;

import java.util.Scanner;

/*
 * Problem Statement: Buzz Number
 * If number is said to be Buzz Number if it ends with 7 OR is divisible by 7.
 * @Author Omkar Ingawale
 * 
 */

public class Buzz_Number {

	public static void main(String[] args) {
		
		int n;
		
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n % 10 == 7 || n % 7 == 0){
			System.out.println(n + " it is a Buzz Number");
		}else{
			System.out.println(n + " it is not a Buzz Number");
		}
		
	}

}