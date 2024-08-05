package com.java.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsMapExample {
	
	public static void main(String[] args) {
		
		//  List
		List<String> studentList = StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(studentList);
		
		//  Set
		Set<String> studentList2 = StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
		System.out.println(studentList2);
	}

}
