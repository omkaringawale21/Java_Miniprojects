package proState;

import java.util.Scanner;

// Java program to print the maximum number from the set of digits of a given number

public class MaxNumber {

	// METHOD-1
//	// Function to print maximum number
//	static int printMaxNum(int num){
//		
//		// Array to store count of digits
//		int count[] = new int[10];
//		
//		// Converting given number to string
//		String str = Integer.toString(num);
//		
//		// Updating the count array
//		for(int i = 0; i < str.length(); i++){
//			count[str.charAt(i) - '0']++;
//		}
//		
//		// Result is to store the final number
//		int result = 0, multiplier = 1;
//		
//		// Traversing the count array to calculate maximum number
//		for(int i = 0; i <= 9; i++){
//			while(count[i] > 0){
//				result = result + (i * multiplier);
//				count[i]--;
//				multiplier = multiplier * 10;
//			}
//		}
//		
//		// Return the result
//		return result;
//		
//	}

	// METHOD-2
	static String max;
	
	static void printMaxNum(char[] str, int k){
		if(k == 0){
			return;
		}
		
		int n = str.length;
		// Consider every digit
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				// Digit at position i is less than digit at position j, swap it and check max numbers
				// so far and recurse for remaining swaps
				if(str[i] < str[j]){
					// swap i with j
					char t = str[i];
					str[i] = str[j];
					str[j] = t;
				}
				// If current number is more than maximum so far
				if(String.valueOf(str).compareTo(max) > 0){
					max = String.valueOf(str);
				}
				// Recurse of the other
				// k - 1 swap
				printMaxNum(str, k-1);
				// Backtrack
				char c = str[i];
				str[i] = str[j];
				str[j] = c;
			}
		}
	}
	
	public static void main(String[] args) {
		
		// METHOD-1
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num = 289645096;
		
//		System.out.println("The maximum number is = " + printMaxNum(num));
		
		// METHOD-2
		String str = "28964596";
		int k = 4;
		max = str;
		printMaxNum(str.toCharArray(), k);
		
		System.out.println("The maximum number is = " + max + "\n");
		
	}

}
