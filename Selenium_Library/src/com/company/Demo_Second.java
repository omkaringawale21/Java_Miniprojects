package com.company;

class Check{
	int fno;
	int sno;
	int sum, sub, mult, div;
	
	Check(int fno, int sno){
		this.fno = fno;
		this.sno = sno;
	}
}

class CheckOut{
	void calculate(Check c){
		c.sum = c.fno + c.sno;
		c.sub = c.fno - c.sno;
		c.mult = c.fno * c.sno;
		c.div = c.fno / c.sno;
	}
}

public class Demo_Second {

	public static void main(String[] args) {
		
		Check obj = new Check(100, 20);
		CheckOut co = new CheckOut();
		co.calculate(obj);
		
		System.out.println("The summation of " + obj.fno + " and " + obj.sno + " is " + obj.sum);
		System.out.println("The subtraction of " + obj.fno + " and " + obj.sno + " is " + obj.sub);
		System.out.println("The multiplication of " + obj.fno + " and " + obj.sno + " is " + obj.mult);
		System.out.println("The division of " + obj.fno + " and " + obj.sno + " is " + obj.div);

	}

}
