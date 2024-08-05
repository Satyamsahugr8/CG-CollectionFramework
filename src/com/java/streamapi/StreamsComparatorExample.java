package com.java.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsComparatorExample {
	public static List<Student> sortStudentByName() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByGpa() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByGpaRev() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println(sortStudentByName());
		System.out.println("=--------------------------=");
		System.out.println(sortStudentByGpa());
		System.out.println("=--------------------------=");
		System.out.println(sortStudentByGpaRev());

	}

}
