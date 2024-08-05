package com.java.funcInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.data.Student;
import com.java.data.StudentDatabase;

// predicate and consumer 
// bipredicate and consumer
//
public class PredicateConsumerBipredicateBiConsumerExample {

	public static void main(String[] args) {

		// Predicate
		Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

		// BiPredicate
		BiPredicate<Integer, Double> bi1 = (grade, gpa) -> grade >= 3 && gpa >= 3.9;

		// BiConsumer
		BiConsumer<String, List<String>> bi2 = (name, activities) -> {
			System.out.println(name + " : " + activities);
		};

		// Predicate and Consumer
		Consumer<Student> c1 = (student) -> {
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		};

		// BiPredicate and Consumer
		Consumer<Student> c2 = (student) -> {
			if (bi1.test(student.getGradeLevel(), student.getGpa())) {
				System.out.println(student);
			}
		};

		// BiPredicate and BiConsumer in Consumer c2
		Consumer<Student> c3 = (student) -> {
			if (bi1.test(student.getGradeLevel(), student.getGpa())) {
				bi2.accept(student.getName(), student.getActivities());
			}
		};

		List<Student> studentList = StudentDatabase.getAllStudents();
		System.out.println(studentList);
		System.out.println("-------------------------");
		studentList.forEach(c1);
		System.out.println("-------------------------");
		studentList.forEach(c2);
		System.out.println("-------------------------");
		studentList.forEach(c3);

	}

}
