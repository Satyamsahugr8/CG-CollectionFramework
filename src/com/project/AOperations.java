package com.project;

public class AOperations {

	public static void main(String[] args) {
		
		// TODO Basic operations
		
		byte b = (byte) 200 ;
		System.out.println(b); // -56
		
		long l = 1000000 ;
		System.out.println(l); // 1000000
		
		int million = 1_000_000;
		long billion = 1_000_000_000;
		float pi = 3.141_592_653f;
		
		System.out.println(million); // 1000000
		System.out.println(billion); // 1000000000
		System.out.println(pi); // 3.1415927
		
		int x = 3;
		int y = 4;
		
		float w = x/y ; 
		System.out.println("w = "+w); // 0.0
		
		float z = (float) x / y;
		System.out.println("z = "+z); // 0.75
		
		
		float pi2 = 3.14F;
		float result = pi2 % 0;
		System.out.println(result); // Prints: NaN
		
		float result2 = pi2 / 0;
		System.out.println(result2); // Prints: Infinity
		
		int a = 5;
		int c = 3;
		 
		int d = a++ + c++;
		System.out.println(d); // 8
		System.out.println(a); // 6
		System.out.println(c); // 4

	}

}
