package com.java.funcInterface;

import java.util.List;
import java.util.function.Consumer;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class ConsumerExample {

	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

	public static void main(String[] args) {

		Consumer<String> c0 = (s) -> System.out.println(s.toUpperCase());
//		c0.accept("java8");

		System.out.println("printStudents():=========================\n");
		printStudents();
		System.out.println();
		System.out.println("printNameAndActivities():=========================\n");
		printNameAndActivities();
		System.out.println();
		System.out.println("printNameAndActivitiesUsingCondition():=========================\n");
		printNameAndActivitiesUsingCondition();
		System.out.println();
		System.out.println("printgenderFemale():=========================\n");
		printgenderFemale();
		System.out.println();

	}

	public static void printStudents() {

		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(c1);

	}

	public static void printNameAndActivities() {

		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(c2.andThen(c3)); // consumer chaining

	}

	public static void printNameAndActivitiesUsingCondition() {

		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (student.getGradeLevel() >= 3) {
				c1.accept(student);
			}
		});
	}

	public static void printgenderFemale() {

		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (student.getGender().equals("female")) {
				c1.accept(student);
			}
		});
	}

}
