package com.java.terminalstreams;

import static java.util.stream.Collectors.joining;

import com.java.data.Student;
import com.java.data.StudentDatabase;


public class StreamsJoiningExample {

    public static String joining_1(){

       return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining()); // String
    }

    public static String joining_2(){

        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining("-"));
    }

    public static String joining_3(){

        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)//<Stream<String>>
                .collect(joining("-","(",")"));
    }

    public static void main(String[] args) {

        System.out.println("joining_1 : " + joining_1());

        System.out.println("joining_2 : " + joining_2());

        System.out.println("joining_3 : " + joining_3());
    }
}
