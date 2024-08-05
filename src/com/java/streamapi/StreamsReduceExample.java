package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.data.Student;
import com.java.data.StudentDatabase;

public class StreamsReduceExample {

	public static int reduceInteger() {
		List<Integer> integer = Arrays.asList(1, 3, 5, 7);
		return integer.stream().reduce(1, (a, b) -> a + b); // return identity type here it is int
	}

	public static Optional<Integer> reduceIntegerWithO() {
		List<Integer> integer = Arrays.asList(1, 3, 5, 7);
		return integer.stream().reduce((a, b) -> a + b);  // return Optional
	}

	public static Optional<Student> reduceStudents() {
		return StudentDatabase.getAllStudents().stream().reduce((s1, s2) -> {
			if (s1.getGpa() > s2.getGpa()) {
				return s1;
			} else
				return s2;
		});
	}

	public static void main(String[] args) {
		System.out.println("reduceInteger() = \n"+reduceInteger());
		System.out.println();
		System.out.println("reduceIntegerWithO() = \n"+reduceIntegerWithO());
		System.out.println();
		System.out.println("reduceIntegerWithO().get() = \n"+reduceIntegerWithO().get());
		System.out.println();
		System.out.println("reduceStudents() = \n"+reduceStudents());
		System.out.println();
		System.out.println("reduceStudents().get() = \n"+reduceStudents().get());
	}

}
