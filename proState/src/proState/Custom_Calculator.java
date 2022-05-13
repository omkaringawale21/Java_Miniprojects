package proState;

import java.util.Scanner;

class circle{
	public int radius;
	
	circle(int r){
		this.radius = r;
	}
	
	public double area(){
		return Math.PI * this.radius * this.radius;
	}
}

class cylinder extends circle{
	public int height;
	
	cylinder(int r, int h){
		super(r);
		this.height = h;
	}
	
	public double volume(){
		return 2 * Math.PI * this.radius * this.height;
	}
}

public class Custom_Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter the two parameters : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		cylinder cyl = new cylinder(a, b);
		System.out.println(cyl.area());
		System.out.println(cyl.volume());
		
	}

}
