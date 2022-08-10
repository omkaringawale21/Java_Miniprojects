package org.omkaringawale.dieight;

public class Course {

	private String cid;
	private String cname;
	
	public Course(String cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	
	public void diplayCourse(){
		System.out.println(cid + " : " + cname);
	}
	
}
