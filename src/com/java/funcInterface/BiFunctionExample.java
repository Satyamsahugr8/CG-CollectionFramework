package com.java.funcInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class BiFunctionExample {

	public static void main(String[] args) {

		List<Student> studentList = StudentDatabase.getAllStudents();
		
		BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bi1 = (students, studentPredicate)->{
			Map<String, Double> studentGradMap = new HashMap<>();
			
			studentList.forEach(student->{
			if(studentPredicate.test(student)) {
				studentGradMap.put(student.getName(), student.getGpa());
				
			}
		});
			
		return studentGradMap;
		};
		System.out.println(bi1.apply(studentList, PredicateStudentExample.p1));
	}

}
