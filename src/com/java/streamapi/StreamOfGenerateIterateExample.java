package com.java.streamapi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("adam","dan","julie"); //Stream.of(T t)
		stringStream.forEach(System.out::println);
		
		Stream.iterate(1,x->x*2) //Stream.iterate(seed:1, unaryOperator)
		      .limit(10)
		      .forEach(System.out::println);
		
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier) //Stream.generate(Supplier)
		      .limit(5)
		      .forEach(System.out::println);
		
	}
}
