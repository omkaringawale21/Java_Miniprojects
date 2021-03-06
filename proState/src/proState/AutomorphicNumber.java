package proState;

import java.util.Scanner;

/*
 * Problem Statement : An automorphic number is a number whose square ends in the same digit as the number itself.
 * Example: 5*5=25, 6*6=36, 25*25=625
 * @Author Omkar Ingawale
 */

public class AutomorphicNumber {

	public static void main(String[] args) {
		
		int n, sqrNum, temp, sqrNumRemainder, d = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		temp = n;
		 
		while(temp > 0){
			temp = temp / 10;
			d++;
		}
		
		sqrNum = n * n;
		sqrNumRemainder = sqrNum % (int)Math.pow(10, d);
		
		if(sqrNumRemainder == n){
			System.out.println(sqrNumRemainder + " is Automorphic Number");
		}else{
			System.out.println(sqrNumRemainder + " is not Automorphic Number");
		}
		
	}

}
