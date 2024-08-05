package com.java.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

	public static List<Integer> boxing() {

		return IntStream.rangeClosed(1, 10) // IntStream of 10 element
		         //int
		         .boxed()
		         //Integer
		         .collect(Collectors.toList());
	}

	public static int unBoxing() {
		// wrapper to primitive
		return boxing().stream()
				// wrapper int value
				.mapToInt(Integer::intValue) 
				.sum();
		 

	}

	public static void main(String[] args) {

	System.out.println(boxing());
	System.out.println(unBoxing());
	}

}
