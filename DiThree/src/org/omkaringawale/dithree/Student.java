package org.omkaringawale.dithree;

public class Student {

	private int sno;
	private String sname;
	private int age;
	private Address address;
	
	public Student(int sno, String sname, int age, Address address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
		this.address = address;
	}
	
	public void displayStudent(){
		System.out.println(sno + " : " + sname + " : " + age);
		address.displayAddress();
	}
	
}