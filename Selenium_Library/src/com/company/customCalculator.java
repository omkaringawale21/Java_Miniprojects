package com.company;

class invalidInputException extends Exception{
	@Override
	public String toString(){return "Cannot add 8 and 9!"; }
	@Override
	public String getMessage(){return "Cannot add 8 and 9!"; }
}

class maxiInputException extends Exception{
	@Override
	public String toString(){return "Input can be greater than 7000!"; }
	@Override
	public String getMessage(){return "Input can be greater than 7000!"; }
}

class cannotDividByZeroException extends Exception{
	@Override
	public String toString(){return "Cannot divid by 0!"; }
	@Override
	public String getMessage(){return "Cannot divid by 0!"; }
}

class miniInputException extends Exception{
	@Override
	public String toString(){return "Input can not be greater than 100000!"; }
	@Override
	public String getMessage(){return "Input can not be greater than 100000!"; }
}

class calculator{
	double add(double a, double b) throws miniInputException, invalidInputException{
		if(a<100000 || b<100000){ throw new miniInputException(); }
		if(a==8 || b==9){ throw new invalidInputException(); }
		return a + b;
	}
	
	double substraction(double a, double b) throws miniInputException, invalidInputException{
		if(a==8 || b==9){ throw new invalidInputException(); }
		return a - b;
	}
	
	double multiply(double a, double b) throws cannotDividByZeroException, miniInputException{
		if(a==0 || b==0){ throw new cannotDividByZeroException(); }
		return a * b;
	}
	
	double divid(double a, double b) throws miniInputException, cannotDividByZeroException, maxiInputException{
		if(b==0){ throw new cannotDividByZeroException(); }
		return a / b;
	}
}

public class customCalculator {

	public static void main(String[] args) throws invalidInputException, maxiInputException, cannotDividByZeroException, miniInputException {
		calculator c = new calculator();
//		c.add(2, 4);
//		c.substraction(8, 9);
//		c.multiply(30000000, 0);
		c.divid(34, 0);
	}

}
