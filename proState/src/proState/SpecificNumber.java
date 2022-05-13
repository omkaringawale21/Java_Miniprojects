package proState;

import java.util.Scanner;

/*
 * Problem Statement : A number is said to be Special number when the sum of factorial of its digits is equal
 *                     to the number itself.
 * Example : 145 is a Special Number as 1! + 4! + 5! = 145 this is a Krishnamurthy Number.
 * @Author : Omkar Ingawale                    
 */

public class SpecificNumber {

	public static void main(String[] args) {
		
		int n, num, r, sumOfFactorial = 0;
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10;
			int fact = 1;
			for(int i = 1; i <= r; i++){
				fact = fact * i;
			}
			sumOfFactorial = sumOfFactorial + fact;
			num = num / 10;
		}
		
		if(n == sumOfFactorial){
			System.out.println("Special Number");
		}else{
			System.out.println("Not Special Number");
		}
		
	}

}
