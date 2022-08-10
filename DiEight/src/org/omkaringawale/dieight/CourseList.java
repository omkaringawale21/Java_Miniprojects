package org.omkaringawale.dieight;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CourseList {

	private List<Course> courseList;
	private Map<Student, ReceiptList> studentWise;
	
	public CourseList(List<Course> courseList,
			Map<Student, ReceiptList> studentWise) {
		this.courseList = courseList;
		this.studentWise = studentWise;
	}
	
	public void displayCourseList(){
		
		Set<Entry<Student, ReceiptList>> set = studentWise.entrySet();
		Iterator<Entry<Student, ReceiptList>> it = set.iterator();
		Entry<Student, ReceiptList> e = null;
		Student s = null;
		ReceiptList r = null;
		
		while(it.hasNext()){
			e = it.next();
			s = e.getKey();
			r = e.getValue();
			
			s.displayStudent();
			
			r.displayReceiptList();
			
		}
		
		System.out.println("******* CourseList *******");
		for(Course cou : courseList){
			cou.diplayCourse();
		}
		System.out.println("**************************");
		
		
	}
	
}
