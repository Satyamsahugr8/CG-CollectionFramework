package com.java.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsDistinctCountSortedExample {
	
	public static List<String> printStudentDistinctActivities() {
		return StudentDatabase.getAllStudents().stream()
		.map(Student::getActivities) // <List<String>>
		.flatMap(List::stream) // <String>
		.distinct()
		.collect(Collectors.toList()); // to desired result	
	}
	
	public static long printStudentDistinctCountActivities() {
		return StudentDatabase.getAllStudents().stream()
		.map(Student::getActivities) // <List<String>>
		.flatMap(List::stream) // <String>
		.distinct()
		.count();
	}
	
	public static List<String> printStudentDistinctSortedActivities() {
		return StudentDatabase.getAllStudents().stream()
		.map(Student::getActivities) // <List<String>>
		.flatMap(List::stream) // <String>
		.distinct()
		.sorted()
		.collect(Collectors.toList()); // to desired result	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("printStudentDistinctActivities ="+printStudentDistinctActivities());
		System.out.println("printStudentDistinctCountActivities ="+printStudentDistinctCountActivities());
		System.out.println("printStudentDistinctSortedActivities ="+printStudentDistinctSortedActivities());
		
	}
}
