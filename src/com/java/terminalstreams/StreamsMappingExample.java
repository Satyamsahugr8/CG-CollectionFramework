package com.java.terminalstreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.data.Student;
import com.java.data.StudentDatabase;


public class StreamsMappingExample {

    public static void main(String[] args) {

    	// 1 new method
        List<String> namesList = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        System.out.println("namesList : " + namesList);

        
        
        // 1 old method
        List<String> namesList2 = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("namesList2 : " + namesList2);


        
        
        
        // 2 new method
        Set<String> namesSet = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));

        System.out.println("namesSet : " + namesSet);

    }
}
