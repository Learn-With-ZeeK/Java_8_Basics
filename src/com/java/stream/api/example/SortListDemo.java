package com.java.stream.api.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		                 // Sorting salary in ascending order of salary in array output
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		System.out.println(employees);

		System.out.println("----------------");

		                 // Sorting salary in ascending order of salary in List Output
        employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		System.out.println("----------------");
		
		                 // Sorting salary in ascending order of departmentName in List Output
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

	}

}
