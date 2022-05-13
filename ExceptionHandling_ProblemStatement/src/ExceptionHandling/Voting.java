package ExceptionHandling;

import java.util.Scanner;

/*
 * Problem Statement: Voting system making machine
 * @Author Omkar Imgawale
 */

class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}

public class Voting {

	public static void main(String[] args) /*throws YoungerAgeException*/ {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a = sc.nextInt();
		
		try{
			if(a < 18){
				throw new YoungerAgeException("You are not eligible to vote!");
			}else if(a > 70){
				throw new YoungerAgeException("You are not eligible to vote!, Beacuse the your age above the limited age!");
			}else{
				System.out.println("Vote Successfully!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("This is the Voting Machine");
		
	}

}
