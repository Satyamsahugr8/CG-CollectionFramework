package com.java.funcInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String, String> b1 = (a, b) -> {System.out.println("a :" + a + " , b : " + b);};
		b1.accept("abbu", "ballu");
		printNameAndActivities();

	}

	public static void printNameAndActivities() {
		
		//1
//		BiConsumer<Student,Student> b2 = ( student, student2 )-> {System.out.println("name : "+student.getName()+", activites : "+student2.getActivities());};
		
		BiConsumer<String, List<String>> b2 = (name, activities)->{System.out.println("name : "+name+", activites : "+activities);}; 
		
		Consumer<Student> c2 = (student) -> System.out.print(student.getName());
		Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

		List<Student> studentList = StudentDatabase.getAllStudents();
		
		//1
//		studentList.forEach(b2);
//		studentList.forEach((student)->b2.accept(student, student));
		
		
		// we know only consumer can take as argument for foreach
		// forEach(Consumer c);
		// so here Consumer calling BiConsumer [ (Student) -> b2.accept(a, b); ]
		studentList.forEach((student)->b2.accept(student.getName(), student.getActivities()));


		
    }
}
