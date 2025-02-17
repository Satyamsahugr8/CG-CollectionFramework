package com.java.terminalstreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;


public class StreamsParitioninigByExample {

    public static void partitioningBy_1(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean,List<Student>> partitioningMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println("partitioningMap : " + partitioningMap);
    }

    public static void partitioningBy_2(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean,Set<Student>> partitioningMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                		Collectors.toSet()));

        System.out.println("partitioningMap_2 : " + partitioningMap);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        System.out.println();
        partitioningBy_2();

    }
}
