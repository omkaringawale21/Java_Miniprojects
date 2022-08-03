package org.omkaringawale.difour;

public class Student {

	private int sno;
	private String sname;
	private int age;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayStudent(){
		System.out.println(sno + " : " + sname + " : " + age);
		address.displayAddress();
	}
	
}
