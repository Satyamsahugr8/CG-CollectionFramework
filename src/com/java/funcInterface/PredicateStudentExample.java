package com.java.funcInterface;

import java.util.List;
import java.util.function.Predicate;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	static Predicate<Student> p3 = (s) -> s.getGender().equals("female");


	public static void main(String[] args) {
		
		listStudentUsingGradeCondition();
		System.out.println("-----------------");
		listStudentUsingGpaCondition();
		System.out.println("-----------------");
		listStudentUsingFemaleCondition();
		System.out.println("-----------------");
		listStudentUsingAndGradeAndGpaCondition();
		System.out.println("-----------------");		
		listStudentUsingOrGradeAndGpaCondition();
		System.out.println("-----------------");
		listStudentUsingOrNegateGradeAndGpaCondition();
		System.out.println("-----------------");
		listStudentUsingOrGradeGpaGenderCondition();
	}

	
	public static void listStudentUsingGradeCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	

	public static void listStudentUsingGpaCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	

	public static void listStudentUsingFemaleCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p3.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void listStudentUsingAndGradeAndGpaCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void listStudentUsingOrGradeAndGpaCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p1.or(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void listStudentUsingOrGradeGpaGenderCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p1.or(p2).or(p3).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void listStudentUsingOrNegateGradeAndGpaCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(student -> {
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			}else{
                System.out.println(student);
            }
		});
	}
	
	
}
