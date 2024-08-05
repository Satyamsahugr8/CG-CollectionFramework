package com.java.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumOfNumbers(List<Integer> integerList) { // Integer is a wrapper class with int primitive class
		return integerList.stream()
				.reduce(0, (x,b)->x+b); // unboxing to convert Integer to int     
		// wasted to effert
	}
	
	public static int sumOfNumbersIntStream() {
		return IntStream.rangeClosed(1, 5) //1,2,3,4,5
				//1
				//2
				//3
				//4
				//5
				        .sum();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		System.out.println(sumOfNumbers(integerList));
		System.out.println(sumOfNumbersIntStream());

	}

}
