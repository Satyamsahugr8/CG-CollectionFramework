package com.CollectionsFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_ {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(null, null);
		map.put(0, "Satyam");
		map.put(1, "Sahu");
		map.put(2, "Mayank");
		map.put(3, "Sahuji");
		map.put(5, "Mukul");
		map.put(6, "SahujiIsro");

		System.out.println(map);
		map.remove(3);
		System.out.println(map);

		// Enhanced For loop
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.print(e + ",");
		}

		Map<Integer, String> map4 = new LinkedHashMap<Integer, String>();
		map4.put(0, "Satyam");
		map4.put(1, "Sahu");
		map4.put(2, "Mayank");
		map4.put(3, "Sahuji");
		map4.put(5, "Mukul");
		map4.put(6, "SahujiIsro");

		
		
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(6, "SahujiIsro");
		map2.put(2, "Mayank");
		map2.put(0, "Satyam");
		map2.put(1, "Sahu");
		map2.put(3, "Sahuji");
		map2.put(5, "Mukul");
		System.out.println(map2);

		// Iterator in map2
		for (Integer key : map2.keySet()) {
			String value = map2.get(key);
			System.out.println(key + " -> " + value);

		//
		for (Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
		
		Map<Integer, String> map3 = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("map3 :"+map3);

	}

}
