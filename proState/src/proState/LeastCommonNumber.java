package proState;

import java.util.Scanner;

/*
 * Problem Statement : The Least Common Number multiple, lowest common multiple, or smallest common multiple of two
 *                     integers a and b, usually denoted by LCM(a, b), is the smallest positive integers that is divisble 
 *                     by both a and b.
 * Example : 15 and 18 is 90
 * @Author : Omkar Ingawale                    
 */

public class LeastCommonNumber {

	public static void main(String[] args) {
		
		int a, b, gcd = 1, lcm = 1;
		System.out.print("Enter A Number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Enter B Number : ");
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
		
		lcm = (a * b) / gcd;
		System.out.println("Least Common Number : " + lcm);
		
	}

}
