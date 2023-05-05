package com.java.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		// Using consumer Interface
		Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
		consumer.accept(10);

		System.out.println("--------------------");
		
		// Using extension of Consumer Interface(forEach loop in stream)
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().forEach(t -> System.out.println("print  : " + t));

	}

}
