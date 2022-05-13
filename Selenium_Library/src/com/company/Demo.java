package com.company;

class Frist{
	int num;
	String result1;
	String result2;
	
	Frist(int num){
		this.num = num;
	}
}

class myClass{

	void check(Frist f){
		if(f.num%2 == 0){
			f.result1 = "This is Even Number";
		}else{
			f.result1 = "This is Odd Number";
		}
		
		int num = f.num;
		int rev = 0;
		// Pallidrome number logic
		while(num > 0){
			rev = rev * 10 + num %10;
			num = num / 10;
		}
		if(rev == f.num){
			f.result2 = "This is Pallidrome Number";
		}else{
			f.result2 = "This is not Pallidrome Number";
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		Frist f1 = new Frist(44);
		myClass ms = new myClass();
		ms.check(f1);
		
		System.out.println("The number " + f1.num + " is " + f1.result1 + " and " + f1.result2);
		
	}
	
}
