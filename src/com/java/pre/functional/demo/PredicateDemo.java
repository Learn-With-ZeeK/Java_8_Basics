package com.java.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
	
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		              //Providing conditional check by using filter in stream(Extension of predicate demo)
		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Even: " + t));
	}

}
