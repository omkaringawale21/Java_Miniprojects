package proState;

import java.util.Scanner;

/*
 * Problem Statement : In Mathematics, Harshad Number(Niven Number) is a given number base is an integer that is divisible
 *                     by the sum of its digits when writter in that base.
 * Example : 6804                   
 * @Author : Omkar Ingawale                    
 */
public class HarshadNumber {

	public static void main(String[] args) {
		
		int n, r, num, sum = 0;
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num > 0){
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		
		if(n % sum == 0){
			System.out.println("Harshad Number");
		}else{
			System.out.println("Not Harshad Number");
		}
		
	}

}
