package com.java.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		Map<String, List<String>> studentMap = studentList.stream()
				.filter(s->s.getGradeLevel()>=3)
				.filter(s->s.getGpa()>=3.9)
		.collect(Collectors.toMap(student->student.getName(), student->student.getActivities()));
		
		
		System.out.println(studentMap);
	
	}

}
