package com.java.funcInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Integer> c1 = (a, b) -> a.compareTo(b);

		BinaryOperator<Integer> b2 = (i, b) -> i * b;
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(c1);
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(c1);
		System.out.println(b2.apply(4, 2));
		System.out.println(minBy.apply(4, 5));
		System.out.println(maxBy.apply(4, 5));
//		System.out.println();
	}

}
