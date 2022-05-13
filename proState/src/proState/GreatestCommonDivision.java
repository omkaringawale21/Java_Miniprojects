package proState;

import java.util.Scanner;

/*
 * Problem Statement : The Greatest Common Divisor(gcd) of two or more integers, which are not all zero,
 *                     is the largest positive integer that divides each of the integers.
 * Example :  The GCD of 8 and 12 is 4.
 * @Author : Omkar Ingawale                    
 */

public class GreatestCommonDivision {

	public static void main(String[] args) {
		
		int a, b, gcd = 1;
		System.out.print("Enter Number a : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Enter Number b : ");
		b = sc.nextInt();
		
		int min, max;
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
		
		System.out.println("Greatest Common Number : " + gcd);
		
	}

}
