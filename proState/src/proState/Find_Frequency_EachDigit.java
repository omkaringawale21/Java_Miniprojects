package proState;

import java.util.Scanner;

public class Find_Frequency_EachDigit {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = a;
		int temp, cnt;
		
		for(int d = 0; d <= 9; d++){
			
			temp = num;
			cnt = 0;
			
			while(temp > 0){
				if(temp % 10 == d)cnt++;
				temp = temp / 10;
			}
			
			if(cnt != 0)
			System.out.println("The digit " + d + " is present for " + cnt + " times");
			
		}
		
	}

}
