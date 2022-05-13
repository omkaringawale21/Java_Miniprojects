package ExceptionHandling;

import java.util.Scanner;

class invalidLessInputLengthException extends Exception{
	
	String str;
	invalidLessInputLengthException(String str){
		this.str = str;
	}
	
	@Override
	public String toString(){
		return "Invalid Lenght because length is less than 3! Input Value : " + str;
	}
	
	public String toGetMessage(){
		return "Invalid Lenght because length is less than 3! ";
	}
}

class invalidAboveInputLengthException extends Exception{
	
	String str;
	invalidAboveInputLengthException(String str){
		this.str = str;
	}
	
	@Override
	public String toString(){
		return "Invalid Lenght because length is more than 10! Input value : " + str;
	}
	
	public String toGetMessage(){
		return "Invalid Lenght because length is more than 10! ";
	}
}

class myStringInput{
	public void input(String str) throws invalidLessInputLengthException, invalidAboveInputLengthException{
		if(str.length() < 3){
			throw new invalidLessInputLengthException(str);
		}
		if(str.length() > 10){
			throw new invalidAboveInputLengthException(str);
		}
		System.out.println("The Output : " + str);
	}
	

}

public class String_Exception {

	public static void main(String[] args) {
		
//		String str = "Omk";
		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		
//		String str = "OmkarOmkarI";
		String str = sc.next();
		
		try{
			myStringInput ms = new myStringInput();
			ms.input(str.toUpperCase());
		}catch(invalidAboveInputLengthException e){
			System.out.println("I am handling exception my own way Above!");
			e.printStackTrace();
		}catch (invalidLessInputLengthException e) {
			System.out.println("I am handling exception my own way Less!");
			e.printStackTrace();
		}
		
	}

}