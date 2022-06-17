package proState;

/*
 * Problem Statement : String reversing.
 * @Author : Omkar Ingawale
 */

import java.util.Scanner;

class ReverseString2 {

	public static void main(String[] args) {

		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Before Reversing : " + str);

		System.out.print("After Reversing : ");
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
	}

}
