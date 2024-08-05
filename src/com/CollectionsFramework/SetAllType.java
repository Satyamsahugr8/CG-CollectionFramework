package com.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAllType {

	public static void main(String[] args) {
		
		Set <Integer> set = new HashSet<>();
		set.add(null);
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(4);
		set.add(44);
		set.add(32);
		set.add(34);
		set.add(53);
		set.add(43);
		set.add(5);
		set.add(12);
		set.add(122);
		set.add(211);
		
		System.out.println(set);
		
		Set <Integer> treeset1 = new TreeSet<>();
		treeset1.add(12);
		treeset1.add(2);
		treeset1.add(1);
		treeset1.add(4);
		treeset1.add(44);
		treeset1.add(32);
		treeset1.add(34);
		treeset1.add(53);
		treeset1.add(43);
		treeset1.add(5);
		treeset1.add(12);
		treeset1.add(122);
		treeset1.add(211);
		
		System.out.println(treeset1);
		
		Set <String> set3 =new TreeSet<>();
		set3.add("sag");
		set3.add("sagg");
		set3.add("saggy");
		set3.add("sa");
		set3.add("sagygyyy");
		
		System.out.println(set3);
		
	}

}
