package com.java.lamda.demo;

interface Calculator {

	// CASE 1
	/* void switchOn(); */

	// CASE 2
	/* void sum(int input); */

	// CASE 3
	int substract(int i1, int i2);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		//Only one case works at a time
		
		// ---------------------------------------------------------------------------------------

		// CASE 1
		/*
		 * Calculator calculator = () -> System.out.println("Switch On");
		 * calculator.switchOn();
		 */

		 // ---------------------------------------------------------------------------------------

		// CASE 2
		/*
		 * Calculator calculator = (input) -> System.out.println("Sum : " + input);
		 * calculator.sum(394);
		 */

		// ---------------------------------------------------------------------------------------

		  // CASE 3
		Calculator calculator = (i1, i2) -> {
			if (i1 > i2) {
				return i1 - i2;
			} else {
				return i2 - i1;
			}
		};

		System.out.println(calculator.substract(8, 20));
	}

}
