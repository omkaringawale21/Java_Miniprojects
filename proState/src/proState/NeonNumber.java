package proState;

import java.util.Scanner;

/*
 * Problem Statement : Neon Number is a number where the sum of digits of square of the number is equal to the number is 9.
 * Example : its 9 * 9 = 81 and sum of the digits is 9 i.e. 9 is a Neon Number.
 * @Author : Omkar Ingawale
 */

public class NeonNumber {

	public static void main(String[] args) {
		
		int n, sqr = 1, sum = 0, r;
		System.out.print("Enter a Number : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		sqr = n * n;
		
		while(sqr > 0){
			r = sqr % 10;
			sum = sum + r;
			sqr = sqr / 10;
		}
		
		if(n == sum){
			System.out.println("Neon Number");
		}else{
			System.out.println("Not Neon Number");
		}
		
	}

}
