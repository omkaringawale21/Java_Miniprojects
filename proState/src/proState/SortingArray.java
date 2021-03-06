package proState;

/*
 * Problem Statement : To Sort an Array without using Java Method like Array.sort();
 * @Author: Omkar Ingawale
 */

public class SortingArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				int temp = 0;
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Array Sorting : " + arr[i]);
		}
		
		System.out.println("Array is Sorting!");
		
	}
}
