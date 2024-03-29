package org.omkaringawale.diseven;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private int sno;
	private String sname;
	private int sage;
	private Map<String, String> map;
	
	public Student(int sno, String sname, int sage, Map<String, String> map) {
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.map = map;
	}
	
	public void displayStudent(){
		
		System.out.println(sno + " : " + sname + " : " + sage);
		
		System.out.println("********** List **********");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		Entry<String, String> e = null;
		String subject = "";
		String mark = "";
		
		while(it.hasNext()){
			e = it.next();
			subject = e.getKey();
			mark = e.getValue();
			
			System.out.println(subject + " : " + mark);
			
		}
		
		System.out.println("**************************");
		
	}
	
}
