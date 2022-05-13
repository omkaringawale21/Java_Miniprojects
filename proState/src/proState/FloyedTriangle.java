package proState;

import java.util.Scanner;

/*
 * Problem Statement : Floyed Triangle Program
 * Example : For 5 Numbers
 *           1
 *           2  3
 *           4  5  6
 *           7  8  9  10
 *           11 12 13 14 15
 * @Author : Omkar Ingawale
 */

public class FloyedTriangle {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int k = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
	}

}
