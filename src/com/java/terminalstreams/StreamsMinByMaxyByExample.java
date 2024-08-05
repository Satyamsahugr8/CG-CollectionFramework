package com.java.terminalstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;


public class StreamsMinByMaxyByExample {

    public static Optional<Student> minBy_example(){

       return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){

        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        System.out.println(minBy_example());
        System.out.println(maxBy_example());
    }
}
