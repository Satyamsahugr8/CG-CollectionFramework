package com.java.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		
		int a = IntStream.rangeClosed(1, 50).sum();
		System.out.println(a);
		
		OptionalInt oi = IntStream.rangeClosed(1, 50).max(); // return OptionalInt
		System.out.println(oi.getAsInt());
	
	    OptionalLong ol = LongStream.rangeClosed(50, 100).min(); // return OptionalLong
	    System.out.println(ol.getAsLong());
	    
	    OptionalDouble od = IntStream.rangeClosed(1, 50).average(); // return OptionalLong
	    System.out.println(od.getAsDouble());
	
	
	}
}
