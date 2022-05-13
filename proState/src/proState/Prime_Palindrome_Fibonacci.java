package proState;

import java.util.Scanner;

public class Prime_Palindrome_Fibonacci {
	
	static int i = 2;
	
	public static boolean isPrime(int n){
		
		if(n == 0 || n == 1){
			return false;
		}
		if(n == i){
			return true;
		}
		if(n % i == 0){
			return false;
		}
		i++;
		
		return isPrime(n);
	}
	
	public static int isPalindrome(int no){
		
		int copyNum = no;
		int revNum = 0;
		
		while(!(copyNum == 0)){
			int digit = copyNum % 10;
			revNum = revNum * 10 + digit;
			copyNum = copyNum / 10;
		}
		
		if(revNum == no){
			System.out.println(revNum + " is a Palindrome Number");
		}else{
			System.out.println(revNum + " is not a Palindrome Number");
		}
		
		return revNum;
		
	}
	
	public static int isFibonacci(int n){
		
		int num1 = 0, num2 = 1;
		int counter = 0;
		
		while(counter < n){
			System.out.println("The Fibonacci series no : " + num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			counter = counter + 1;
		}
		
		return num1;
		
	}
	
	public static void main(String[] args) {
		
		// Prime Number
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isPrime(n)){
			System.out.println("This is Prime Number : " + n);
		}else{
			System.out.println("This is not a Prime Number : " + n);
		}
		
		// Palindrome Number
		isPalindrome(n);
		
		// Fibonacci Series Number
		isFibonacci(n);
		
	}
	
}
