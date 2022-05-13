package proState;

import java.util.Scanner;

public class starPrint {

	public static void printAngle(int n){
		for(int i = 0; i < n; i++){
			
			// For space
			for(int j = n - i; j > 1; j--){
				System.out.print(" ");
			}
			
			// To print a star
			for(int j = 0; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number of Stars : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printAngle(a);
		
	}

}
