package com.java.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangeExample {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 50);
		System.out.println(intStream.count());
		
		IntStream.range(1, 50).forEach(v->System.out.print(v+","));
		System.out.println("-------------");
		IntStream.rangeClosed(1, 50).forEach(v->System.out.print(v+","));
		System.out.println("-------------");
		// same as LongStream perform these opearations
		
		// as we have discussed double does not
		// support range and rangeClosed
		// but we have a handy method
		
		IntStream.range(1, 50).asDoubleStream().forEach(v->System.out.print(v+","));
		
	}

}
