package org.omkaringawale.dieight;

public class Student {
	
	private int sno;
	private String sname;
	private int sage;
	
	public Student(int sno, String sname, int sage) {
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
	}
	
	public void displayStudent(){
		System.out.println(sno + " : " + sname + " : " + sage);
	}
	
}
