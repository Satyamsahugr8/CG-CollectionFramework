package com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListForEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int[] ints = {1,2,3};
		ArrayList<Integer> list3 = (ArrayList<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		// forEach
//		for(Integer element : list) {
//			list.add(element);
//		}
		
		
//		System.out.println(list.add(6) 	);
		
		
		
		for (Integer element : list) {
			if(element != 6)
				System.out.print(element + ",");
			else
				System.out.print(element);
		}
		System.out.println("");
		System.out.print(list3);
		
		sc.close();
	}

}
