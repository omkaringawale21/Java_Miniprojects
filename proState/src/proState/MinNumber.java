package proState;

public class MinNumber {
	
	static int printMinNumber(int num){
		
		// Array to store count of digits
		// Initialize frequency of each digit to zero
		int freq[] = new int[10];
		// Checking number is positive or negative
		boolean is_pos = (num > 0);
		// Getting absolute value of number i.e the positive value would be return
		num = Math.abs(num);
		// Count frequency of each digit in the number
		while(is_pos){
			int d = num % 10; // Extract last digit
			freq[d]++; // Increment counting
			num = num / 10; // Remove last digit
		}
		int result = 0;
		// It is positive number than it should be smallest
		if(is_pos){
			// Set the LEFTMOST digit to minimum expect 0
			for(int i=1; i<=9; i++){
				if(freq[i] != 0){
					result = i;
					freq[i]--;
					break;
				}
			}
			// Arrange all remaining digits in ascending order
			for(int i=0; i<=9; i++){
				while(freq[i]-- != 0){
					result = result * 10 + i;
				}
			}
		}else{
			// If all negative number should be largest
			// Set RIGHTMOST digit to maximum expect 0
			for(int i=9; i>=1; i--){
				if(freq[i] != 0){
					result = i;
					freq[i]--;
					break;
				}
			}
			// Arrange all remaining digits in decending order
			for(int i=9; i>=0; i--){
				while(freq[i]-- != 0){
					result = result * 10 + i;
					// Negative number should be return here
					result = -result;
				}
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
//		int n1 = Integer.parseInt(args[0]);
//		int num1 = n1;
		int num1 = 1234567;
		System.out.println("The smallest number is = " + printMinNumber(num1));
		
//		int n2 = Integer.parseInt(args[0]);
//		int num2 = n2;
		int num2 = 1234567;
		System.out.println("The smallest number is = " + printMinNumber(num2));
			
	}

}
