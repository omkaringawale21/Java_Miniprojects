package proState;

/*
 * Problem Statement : Two Integers a and b are said to be relatively prime, mutually prime, or 
 *                     coprime if the only positive integer that divides both of them is 1.
 * Example : 13 and 15 are co prime.
 * @Author : Omkar Ingawale
 */

import java.util.Scanner;

public class CoPrimeNumber {

	public static void main(String[] args) {
		
		int a, b, gcd = 1;
		System.out.print("Enter Number a : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Enter Number b : ");
		b = sc.nextInt();
		
		int max, min;
		min = a;
		if(min > b){
			min = b;
			max = a;
		}else{
			min = a;
			max = b;
		}
		
		while(max > min){
			int r = max % min;
			if(r == 0){
				gcd = min;
				break;
			}else{
				max = min;
				min = r;
			}
		}
		
		if(gcd == 1){
			System.out.println("Co Prime Number!");
		}else{
			System.out.println("Not Co Prime Number!");
		}
		
	}

}
