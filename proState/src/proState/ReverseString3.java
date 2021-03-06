package proState;

import java.util.Scanner;

/*
 * Problem Statement : String reversing but whole of the string could not be reverse,
 * Example be like, I/P : String str = "Hello Omkar Ingawale";
 *                  O/P : String str = "olleH rakmO elawagnI";
 * @Author : Omkar Ingawale
 */

class MyLogic{
	
	String revString(String str){
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
}

class ReverseString3 {

	public static void main(String[] args) {
		
		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print("Before Reversing : ");
		System.out.println(str);
		
		String arr[] = str.split(" ");
		MyLogic ml = new MyLogic();
		String newString = "";
		
		for(int i=0; i<arr.length; i++){
			arr[i] = ml.revString(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++){
			newString = newString + arr[i] + " ";
		}
		
		newString = newString.substring(0, newString.length() - 1);
		
		System.out.print("After Reversing : ");
		System.out.println(newString);
		
		System.out.println("String Reverse Complited!");
		
	}

}
