package com.project;

import java.util.Arrays;
import java.util.List;

public class ArrayOpertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nameList = {"Tom", "Mary", "Peter", "John", "Adam", "Justin"};
		 
		for (String aName : nameList) {
		    System.out.println(aName);
		}
		
		String[] arr = {"Tom", "Mary", "Peter", "John"};
		List<String> lst = Arrays.asList(arr);
		System.out.println(lst);
		
//		System.arraycopy();
		
		
	}

}
