package proState;

/*
 * Problem Statement: Anonomus Function Method to make abstract class object
 * @Author: Omkar Ingawale
 */

abstract class show{
	abstract void display();
}

interface show1{
	public void display1();
} 

public class Anonomus_Method {

	public static void main(String[] args) {
		
		// Anonomus Function Method to make abstract class object
		show sh = new show(){
			@Override
			public void display(){
				System.out.println("Hello Omkar Here!");
			}
		};
		sh.display();
		
		show1 sh1 = new show1(){
			@Override
			public void display1(){
				System.out.println("Hello Omkar Ingawale here!");
			}
		};
		sh1.display1();
		
	}

}
