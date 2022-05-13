package proState;

import java.util.Scanner;

public class Diamond {

	public static void printDiamond(int n){
		
		int space = n - 1;
		
		// Print Upper Pyramid
		for(int i = 0; i < n; i++){
			// For Space
			for(int j = 0; j < space; j++){
				System.out.print(" ");
			}
			// Print the Star
			for(int j = 0; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		
		space = 0;
		
		// Print Lower Pyramid
		for(int i = n; i > 0; i--){
			// For Space
			for(int j = 0; j < space; j++){
				System.out.print(" ");
			}
			// Print the Star
			for(int j = 0; j < i; j++){
				System.out.print("* ");
			}
			System.out.println();
			space++;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter number to print a star : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		printDiamond(a);
		
	}

}
