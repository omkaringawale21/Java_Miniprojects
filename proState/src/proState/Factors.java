package proState;

import java.util.Scanner;

/*
 * Problem Statement : Factor a number or algebraic expression that divides another number or
 *                     expression evenly i.e. with no remainder.
 * Example : 3 and 6 are the Factors of 12 because 12 � 3 = 4 exactly and 12 � 6 = 2 exactly.
 *           The other Factors of 12 are 1, 2, 4, 6, 12.
 * @Author : Omkar Ingawale
 */

public class Factors {

	public static void main(String[] args){
		
		int n;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.print("Given Number Factors : ");
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				System.out.print(" " + i);
			}
		}
		
		
	}
	
}
