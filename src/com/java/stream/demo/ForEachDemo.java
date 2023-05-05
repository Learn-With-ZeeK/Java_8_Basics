package com.java.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	// filter----> conditional check

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("piter");
		list.add("marek");
		list.add("mac");

		         // For each loop that prints list of names that starts with m(small m case sensitive)
		for (String s : list) {
			if (s.startsWith("m")) {
				System.out.println(s);
			}
		}

		
		System.out.println("----------------------------------");

		      
		         // Stream and filter that prints list of names that starts with m(small m case sensitive)
		list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

		System.out.println("----------------------------------");

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

	}

}
