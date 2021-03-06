package proState;

import java.util.Scanner;

/*
 * Problem Statement : Perfect Number Program in Java
 * Example : 6(1, 2, 3) is the perfect numbers.
 * @Author : Omkar Ingawale
 */

public class PerfectNumber {

	public static void main(String[] args) {
		
		int n, sum = 0, mul = 1;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				sum = sum + i;
				mul = mul * i;
			}
		}
		
		if(sum == mul){
			System.out.println("Perfect Number");
		}else{
			System.out.println("Not Perfect Number");
		}
		
	}

}
