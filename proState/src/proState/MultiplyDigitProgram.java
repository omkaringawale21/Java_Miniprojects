package proState;

import java.util.Scanner;

/*
 * Problem Statement : Multiply Digit Program in Java
 * Example : if Number 1234, then 1 * 2 * 3 * 4 = 24 thats a Multiply Digit.
 * @Author : Omkar Ingawale
 */

public class MultiplyDigitProgram {

	public static void main(String[] args) {
		
		int r, n, num, mul = 1;
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10;
			mul = mul * r;
			num = num / 10;
		}
		
		System.out.println("Multiply Digit Program Number : " + mul);
		
	}

}
