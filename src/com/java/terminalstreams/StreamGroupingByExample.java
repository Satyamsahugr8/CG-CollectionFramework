package com.java.terminalstreams;

import java.util.*;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;


public class StreamGroupingByExample {

	
    public static void groupStudentsByGender(){

       Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
        
        // Extra
        System.out.println();
        studentMap.forEach((gender, student) -> {
        	System.out.println(gender);
        	System.out.println();
        	student.forEach(student1-> System.out.println(student1));
        	System.out.println();
        });
    }

    
    // customised grouping
    public static void customizedGroupingBy(){

        Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream() //Stream<Students>
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println(studentMap);
        
    }

    
    
    public static void twoLevelGrouping_1(){

        Map<Integer,Map<String,List<Student>>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                		Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(studentMap);
    }

    
    
    
    public static void twoLevelGrouping_2(){

        Map<String,Integer> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                		Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }

    
    
    
    
    public static void threeArgumentGroupBy(){

       LinkedHashMap<String,Set<Student>> studentLinkedHashmap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));

        System.out.println(studentLinkedHashmap);
    }

    
    
    
    public static void calculateTopGpa(){

        Map<Integer,Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                		Collectors.maxBy(Comparator.comparing(Student::getGpa)))); // returns optional

        System.out.println(studentMapOptional);
        System.out.println();

        
        Map<Integer,Student> studentMapOptional1 = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)) // returns student
                        ,Optional::get)));

        System.out.println(studentMapOptional1);
    }

    public static void calculateleastGpa(){

        Map<Integer,Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                		Collectors.minBy(Comparator.comparing(Student::getGpa))));

         System.out.println(studentMapOptional);
         System.out.println();

         
         
        Map<Integer,Student> studentMapOptional1 = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                		Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa))
                                ,Optional::get)));

        System.out.println(studentMapOptional1);
    }




    public static void main(String[] args) {

//        groupStudentsByGender();
//        customizedGroupingBy();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
//        calculateTopGpa();
//        calculateleastGpa();

    }
}
