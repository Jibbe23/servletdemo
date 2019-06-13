package com.jibbedehibbe.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		// create an empty List
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Patrizia", "Hukule", "p.hukule@java.de"));
		students.add(new Student("Kim", "Kong", "kong@java.de"));
		students.add(new Student("Jibbe", "Hibbe", "jibbedehibbe@java.de"));
		
		//return the List
		return students;
	}

}
