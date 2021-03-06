package proState;

/*
 * Problem Statement : A Circular Prime Number with the property that the number generated at each
 *                     intermediate step when cyclically permuting its digits will be  prime.
 * Example : 1193 is a circular prime, since 1931, 9311 and 3119 all also prime. 
 * @Author Omkar Ingawale
 */

import java.util.Scanner;

public class CircularPrime {

	public static void main(String[] args) {
		
		boolean flag = true;
		int n, num, r, c = 0;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		while(num > 0){
			r = num % 10;
			c++;
			num = num / 10;
		}
		
		num = n;
		for(int i = 1; i <= c; i++){
			r = num % 10;
			num = num / 10;
			num = (r * (int)Math.pow(10, c - 1)) + num;
			if(!prime(num)){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println(num + " is Circular Prime!");
		}else{
			System.out.println(num + " is Not Circular Prime!");
		}
		
	}

	static boolean prime(int num) {
		int i = 2;
		boolean flag = true;
		while(num > i){
			if(num % 2 == 0){
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}

}
