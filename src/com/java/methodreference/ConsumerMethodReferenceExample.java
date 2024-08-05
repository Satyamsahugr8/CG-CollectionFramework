package com.java.methodreference;



import java.util.function.Consumer;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class ConsumerMethodReferenceExample {

    /**
     * classname::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * classname::instancemethodname
     */
    static Consumer<Student> c2 = Student::printListOfActivities;
    static Consumer<Student> c3 = Student::printListOfBikes;


    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(c1);
        StudentDatabase.getAllStudents().forEach(c2);
        StudentDatabase.getAllStudents().forEach(c3);
    }
}
