package proState;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Problem Statement : To reverse a String but without using reversing method whole of the String program.
 *                     But one word only word can be reversed, not whole of the String has been reversed.
 * @Author : Omkar Ingawale
 */


public class ReverseString {

	public static void main(String[] args) {

		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("Before Reversing : " + str);
		
		char[] tempRev = str.toCharArray();
		int left, right = 0;
		right = tempRev.length - 1;
		
		for(left = 0; left < right; left++, right--){
			char temp = tempRev[left];
			tempRev[left] = tempRev[right];
			tempRev[right] = temp;
		}
		
		System.out.print("After Reversing : ");
		for(char c: tempRev){
			System.out.print(c);
		}
		
	}

}
