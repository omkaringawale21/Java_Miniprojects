package proState;

import java.util.Scanner;

/*
 * Problem Statement: Armstrong Number
 * If 153 = (1 * 1 * 1)+(5 * 5 * 5)+(3 * 3 * 3) =
 * (1) + (125) + (27) = 153 this mean's Armstrong Number
 * @Author Omkar Ingawale
 */

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int n, cubeSum = 0, num, r;
		
		System.out.print("Enter a Number: ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10; // Extract the digit number
			cubeSum = cubeSum + (r * r * r);  // Summation of the Number
			num = num / 10;  // Remove the digit number
		}
		
		if(n == cubeSum){
			System.out.println(cubeSum + " it is a Armstrong Number.");
		}else{
			System.out.println(cubeSum + " it is not a Armstrong Number.");
		}
		
	}

}
