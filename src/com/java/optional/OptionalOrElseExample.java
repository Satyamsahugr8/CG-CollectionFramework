package com.java.optional;



import java.util.Optional;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class OptionalOrElseExample {

	
    //orElse
    public static String optionalOrElse(){

		
		 Optional<Student> studentOptional =
		 Optional.ofNullable(StudentDatabase.studentSupplier.get());
		 
        Optional<Student> studentOptional2 = Optional.ofNullable(null); // Option.empty
        String name = studentOptional.map(Student::getName).orElse("Default");
        String name2 = studentOptional2.map(Student::getName).orElse("Default");
        
        return name;
    }
    
    
    //orElseGet
    public static String optionalOrElseGet(){
        Optional<Student> studentOptional =
                Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    

    //orElseThrow
    public static String optionalOrElseThrow(){
        Optional<Student> studentOptional =
                Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName)
                .orElseThrow(()->new RuntimeException("No Data Available"));
        return name;
    }
    
    
    public static void main(String[] args) {

        System.out.println("orElse : " + optionalOrElse());
        System.out.println("orElseGet :  " + optionalOrElseGet());
        System.out.println("orElseThrow :  " + optionalOrElseThrow());
    }
}
