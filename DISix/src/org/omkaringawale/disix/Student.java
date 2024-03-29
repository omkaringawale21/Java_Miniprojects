package org.omkaringawale.disix;

import java.util.List;

public class Student {

	private int sno;
	private String sname;
	private int sage;
	private List<Receipt> list;
	
	public Student(int sno, String sname, int sage, List<Receipt> list) {
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.list = list;
	}
	
	int total = 0;
	
	void displayStudent(){
		
		System.out.println(sno + " : " + sname + " : " + sage);
		
		System.out.println("******* Student Info *******");
		
		for(Receipt rep : list){
			
			rep.displayReceipt();
			total = total + rep.getRamt();
			
			System.out.println("Grand Total : " + total);
			
		}
		
		System.out.println("****************************");
		
	}
	
}
