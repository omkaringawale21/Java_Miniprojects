package com.company;

import java.util.Scanner;
import java.util.Random;;


public class problem_Statement1 {

	public static void main(String[] args) {
		// OR-Gate Problem Statement
		// Range of the number is from 0 to 100
		
//		Scanner sc = new Scanner(System.in);
//		Random rm = new Random();
//		int or_ans, guess;
//		// Put a limit i.e range
//		final int MAX = 100;
//		boolean correct = false;
//		// Correct answer
//		or_ans = rm.nextInt(MAX) + 1;
//		
//		while(!correct){
//			System.out.println("Guess a number between 1 to 100 : ");
//			// Guess a value
//			guess = sc.nextInt();
//			if(guess < or_ans){
//				System.out.println("Too low number, try it again!");
//			}
//			else if(guess > or_ans){
//				System.out.println("Too high number, try it again!");
//			}
//			else{
//				System.out.println("Your number is correct!");
//				correct = true;
//			}
//		}
//		System.exit(0);
		
		// Range of the number is from 0 to 10
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		int or_ans, guess;
		// Put a limit i.e range
		final int MAX = 10;
		boolean correct = false;
		// Correct answer
		or_ans = rm.nextInt(MAX) + 1;
		
		while(!correct){
			System.out.println("Guess a number between 1 to 10 : ");
			// Guess a value
			guess = sc.nextInt();
			if(guess < or_ans){
				System.out.println("Too low number, try it again!");
			}
			else if(guess > or_ans){
				System.out.println("Too high number, try it again!");
			}
			else{
				System.out.println("Your number is correct!");
				correct = true;
			}
		}
		System.exit(0);
	}

}
