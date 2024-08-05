package com.java.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class TestingList {

	public static void main(String[] args) {
		
		
		List<Student> newListStudent = StudentDatabase.getAllStudents().stream().
				filter(s -> s.getName().equals("Adam")).collect(Collectors.toList());
		
		System.out.println(newListStudent);
		
		Student s = newListStudent.get(0);
		s = new Student("Adam", 3, 3., "female", Arrays.asList("volleyball"), 6);
		
		System.out.println(s);
		
		System.out.println(newListStudent);
		

	}

}
