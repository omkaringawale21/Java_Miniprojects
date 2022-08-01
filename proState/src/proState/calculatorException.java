package proState;

class invalidInputException extends Exception{
	@Override
	public String toString(){
		return "Can not add 8 & 9!";
	}
	
	public String toGetMassage(){
		return "Can not add 8 & 9!";
	}
}

class maximumInputException extends Exception{
	@Override
	public String toString(){
		return "Input can not be greater than 100000!";
	}
	
	public String toGetMassage(){
		return "Input can not be greater than 100000!";
	}
}

class cannotDivideByZero extends Exception{
	@Override
	public String toString(){
		return "Can not divid by 0";
	}
	
	public String toGetMassage(){
		return "Can not divid by 0";
	}
}

class multiplicationInputException extends Exception{
	@Override
	public String toString(){
		return "Can not mutiply by 0";
	}
	
	public String toGetMassage(){
		return "Can not mutiply by 0";
	}
}

class calculator1{
	public double addition(double a, double b) throws invalidInputException, maximumInputException{
		if(a==8 && b==9){
			throw new invalidInputException();
		}
		if(a==100000 && b==100000){
			throw new maximumInputException();
		}
		return a + b;
	}
	
	public double subtraction(double a, double b) throws invalidInputException, maximumInputException{
		if(a==8 && b==9){
			throw new invalidInputException();
		}
		if(a==100000 && b==100000){
			throw new maximumInputException();
		}
		return a - b;
	}
	
	public double multiplication(double a, double b) throws invalidInputException, multiplicationInputException{
		if(a==8 && b==9){
			throw new invalidInputException();
		}
		if(a==0 || b==0){
			throw new multiplicationInputException();
		}
		return a * b;
	}
	
	public double dividation(double a, double b) throws invalidInputException, cannotDivideByZero{
		if(a==8 && b==9){
			throw new invalidInputException();
		}
		if(b==0){
			throw new cannotDivideByZero();
		}
		return a / b;
	}
	
}

public class calculatorException { 

	public static void main(String[] args) throws invalidInputException, maximumInputException, multiplicationInputException, cannotDivideByZero{
		
		calculator1 cal = new calculator1();
		cal.addition(8, 9);
//		cal.subtraction(8, 9);
//		cal.subtraction(100000, 100000);
//		cal.multiplication(8, 0);
//		cal.dividation(8, 9);
		
	}

}
