package org.omkaringawale.difive;

import java.util.List;

public class Student {

	private int sno;
	private String sname;
	private int sage;
	private List<String> list;
	
	public Student(int sno, String sname, int sage, List<String> list) {
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.list = list;
	}
	
	public void displayStudent(){
		
		System.out.println(sno + " " + sname + " " + sage);
		
		System.out.println("******** Hobbies ********");
		
		for(String str : list){
			
			System.out.println(str);
			
		}
		
		System.out.println("*************************");
		
	}
	
}
