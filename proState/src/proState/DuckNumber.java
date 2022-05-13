package proState;

import java.util.Scanner;

/*
 * Problem Statement : A Duck Number is a number which has zeros present in it, but there should be
 *                     no zero present in the beginning of the number.
 * @Author: Omkar Ingawale
 */

public class DuckNumber {

	public static void main(String[] args) {
		
		int n , r, num;
		boolean flag = false;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10;
			if(r == 0){
				flag = true;
			}
			num = num / 10;
		}
		
		if(flag){
			System.out.println("Duck Number!");
		}else{
			System.out.println("Not Duck Number!");
		}
		
	}

}
