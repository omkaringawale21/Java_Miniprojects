package proState;

class Frist{
	int num;
	Frist(int num){
		this.num = num;
	}
}

class Second{
	int sum, rev;
	Second(int sum, int rev){
		this.sum = sum;
		this.rev = rev;
	}
}

class Third{
	Second calculate(Frist f){
		int num = f.num;
		int sum = 0, rev = 0;
		while(num > 0){
			sum = sum + num % 10;
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
//		System.out.println(sum + " " + rev);
		Second s = new Second(sum, rev);
		return s;
	}
}

public class ReverseInteger {

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		Frist f1 = new Frist(n);
		Third t1 = new Third();
		Second s = t1.calculate(f1);

		System.out.println("The summation of this numbers is " + s.sum);
		System.out.println("The reverse of this numbers is " + s.rev);
	}

}
