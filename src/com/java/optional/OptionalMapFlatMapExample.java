package com.java.optional;



import java.util.Optional;

import com.java.data.Bike;
import com.java.data.Student;
import com.java.data.StudentDatabase;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){

        Optional<Student> studentOptional =
            Optional.ofNullable(StudentDatabase.studentSupplier.get()); //Optional<Student>

        studentOptional.
                filter(student -> student.getGpa()>=4.0)
                    .ifPresent(student -> System.out.println(student));
    }

    //map
    public static  void optionalMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDatabase.studentSupplier.get()); //Optional<Student>

        if(studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }

    }

    //flatmap

    public static void optionalFlatMap(){

        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDatabase.studentSupplier.get()); //Optional<Student>

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println("name : " + s));

    }


    public static void main(String[] args) {

        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
