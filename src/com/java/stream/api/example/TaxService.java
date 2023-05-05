package com.java.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService{
	
	public static List<Employee> evaluateTaxUsers(String input) {
		
		// condition(true or false) ? (expression for true) : (expression for false)
		//basically if condition comes true 1st expression runs(After question mark) ,Otherwise 2nd expression(After Semicolon)
		

		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		          //Print true Case(after question mark)
		System.out.println(evaluateTaxUsers("tax"));
		System.out.println("--------------");
		
		        //Print false Case(after semicolon)
		System.out.println(evaluateTaxUsers("taxes"));
	}

}
