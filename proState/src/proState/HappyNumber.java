package proState;

import java.util.Scanner;

/*
 * Problem Statement : a Happy Number is a natural number in a given number base that eventually reaches 1
 *                     when iterated over the perfect digital invariant function for.
 *                     Those numbers that do not end in 1 are unhappy numbers.
 * Example : 31, 70                 
 * @Author : Omkar Ingawale                    
 */

public class HappyNumber {

	public static void main(String[] args) {
		
		int n, num, r = 1 ,sum = 0;
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 9){
			while(num > 0){
				r = num % 10;
				sum = sum + (r * r);
				num = num /10;
			}
			num = sum;
			sum = 0;
		}
		
		if(num == 1){
			System.out.println("Happy Number");
		}else{
			System.out.println("Not Happy Number");
		}
		
	}

}
