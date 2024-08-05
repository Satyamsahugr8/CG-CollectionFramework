package com.java.terminalstreams;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsSumAvgExample {

	public static int sum() {

		return StudentDatabase.getAllStudents().stream()
				.collect(summingInt(Student::getNoteBooks)); // return int and take intFunction
	}

	public static double average() {

		return StudentDatabase.getAllStudents().stream()
				.collect(averagingInt(Student::getNoteBooks)); // return double take intFunction
	}

	public static void main(String[] args) {

		System.out.println("Total No of notebooks : " + sum());

		System.out.println("Average No of notebooks : " + average());
	}
}
