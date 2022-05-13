package com.company;

import java.util.*;
import java.util.Arrays;

public class problemStatement {
	// Frist Method
//	public static int missedNumbers(int[] nums){
//		int n = nums.length;
//		int sum = ((n+1)*(n+2))/2;
//		for(int i=0; i<n; i++){
//			sum -= nums[i];
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		
		// Frist Method
//		int[] arr = {1, 2, 3, 5, 5, 8};
//		System.out.println("The missing elements are : " + missedNumbers(arr));
		
		
		// Second Method
//		int numbers[] = {1, 2, 3, 5, 5, 8};
//		Arrays.sort(numbers);
//		int i=1;
//		
//		while(i<numbers.length){
//			if(numbers[i] - numbers[i-1] == 1){}
//			else{
//				System.out.println("Missing number is : " + (numbers[i-1] + 1));
//			}
//			i++;
//		}
//		System.out.print("Same number printing : ");
//		for(int z=0; z<numbers.length; z++){
//			for(int r=z+1; r<numbers.length; r++){
//				if(numbers[z]==numbers[r]){
//					System.out.println(numbers[r]);
//				}
//			}
//		}
		
		// Third Method
//      Problem Statement: Given an unsorted array a of size positive integers. One number 'a' from set{1, 2, N} is missing
//		and one number 'b' occurs twice in array. Find these two numbers
		int[] a = {1, 2, 3, 5, 5, 8, 9, 9, 11, 11};
		Arrays.sort(a);
		System.out.print("The Missing numbers are : ");
		for(int i=0; i<a.length-1; i++){
			if(a[i+1]-a[i]>0){
				int temp = a[i+1]-a[i];
				for(int j=1; j<temp; j++){
					System.out.print(a[i]+j+" ");
				}
				temp=0;
			}
		}
		System.out.println();
		System.out.print("Same number printing are : ");
		for(int z=0; z<a.length; z++){
			for(int r=z+1; r<a.length; r++){
				if(a[z]==a[r]){
					System.out.print(a[r] + " ");
				}
			}
		}
		
	}

}
