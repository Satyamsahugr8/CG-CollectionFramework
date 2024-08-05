package com.java.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsflatMapExample {

	public static List<String> printStudentActivities() {
		return StudentDatabase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
	}
	
	
	public static void main(String[] args) {
		
	    System.out.println(printStudentActivities());

	}

}
