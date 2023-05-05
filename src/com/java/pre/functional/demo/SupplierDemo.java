package com.java.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList();

		        // Output without input is supplier interface(extension is orElseGet)
        System.out.println(list1.stream().findAny().orElseGet(() -> "Hi ZeeK"));
	}
}
