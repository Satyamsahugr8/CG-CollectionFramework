package com.java.funcInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<Student> s1 = ()->{
			return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
		};
		
		Supplier<List<Student>> s2 = ()->{
			return new StudentDatabase().getAllStudents();};
	

		System.out.println(s1.get());
		System.out.println("-------------");
		System.out.println(s2.get());
	}
	

	

}
