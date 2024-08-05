package com.java.funcInterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (i) -> {return i % 2 == 0;};
	static Predicate<Integer> p2 = (i) -> {return i % 5 == 0;};

	public static void predicateAnd() {

		System.out.println(p1.and(p2).test(4));
		System.out.println(p1.and(p2).test(10));
	
	}

	public static void predicateOr() {
		
		System.out.println(p1.or(p2).test(9));
		System.out.println(p1.or(p2).test(10));

	}

	public static void predicateNegate() {


		System.out.println(p1.negate().test(6));
	}

	public static void main(String[] args) {

		Boolean a = p1.test(2);
		System.out.println(a);
		predicateAnd();
		predicateOr();
		predicateNegate();
		
	}

}
