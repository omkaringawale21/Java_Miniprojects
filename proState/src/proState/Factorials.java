package proState;

public class Factorials {

	public static void main(String[] args) {

		int t = Integer.parseInt(args[0]);
		int i = 1;
		int factorial = 1;
		while(t >= i){
			factorial *= i;
			i++;
		}
		
		System.out.println("The factorial number of n = " + factorial);
		
	}

}