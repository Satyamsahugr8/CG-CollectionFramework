package com.java.funcInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		UnaryOperator<String> u1 = name->name.concat("sahu");
		
		System.out.println(u1.apply("satyam "));
		
		
		
		
	}

}
