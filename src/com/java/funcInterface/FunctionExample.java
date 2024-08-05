package com.java.funcInterface;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		// <input, output>
		Function<String, String> f1 = (name) -> name.toUpperCase();
		Function<String, String> f3 = String::toUpperCase;
		
		// <input, output>
		Function<String, String> f2 = (name) -> name.toUpperCase().concat("Default");
		
		System.out.println(f1.apply("java8"));
		
		System.out.println(f2.apply("java8"));
		
		System.out.println(f1.andThen(f2).apply("java8"));
		
		System.out.println(f1.compose(f2).apply("java8"));
		
	}

}
