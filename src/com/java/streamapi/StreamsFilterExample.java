package com.java.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsFilterExample {

	public static List<Student> filterStudents() {
		return StudentDatabase.getAllStudents().stream()
				.filter(s->s.getGender().equals("female"))
				.filter(s->s.getGpa()>=3.9)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(filterStudents());

	}

}
