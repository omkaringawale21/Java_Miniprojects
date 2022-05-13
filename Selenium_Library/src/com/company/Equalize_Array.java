package com.company;

// Needed to equalize an array

public class Equalize_Array {

	// Returns minimum operations needed to equalize an array
	public static int minOperations(int arr[], int n){
		// Sum of the elements
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += arr[i];
		}
		//If average of array is not integer, then it is not possible to equalize
		if(sum % n !=0){
			return -1;
		}		
		//Compute sum of absolute differences bet^n array elements & average or equalized value
		int diff_sum = 0;
		int eq = sum/n;
		for(int i=0; i<n; i++){
			diff_sum += Math.abs(arr[i] - eq);
			return(diff_sum/2);
		}
		return eq;
		
	}
	
	public static void main(String[] args) {

		int arr[] = {5, 3, 2, 6};
		int n = arr.length;
		System.out.println(minOperations(arr, n));
		
	}

}
