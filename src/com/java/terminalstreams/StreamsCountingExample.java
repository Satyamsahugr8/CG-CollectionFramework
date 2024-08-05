package com.java.terminalstreams;


import java.util.stream.Collectors;

import com.java.data.StudentDatabase;

public class StreamsCountingExample {

    public static long count(){
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9) // takes predicate
                .collect(Collectors.counting()); // return long
    }

    public static void main(String[] args) {

        System.out.println(count());
    }
}
