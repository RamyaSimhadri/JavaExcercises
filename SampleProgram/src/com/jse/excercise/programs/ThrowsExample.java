package com.jse.excercise.programs;

public class ThrowsExample {
	// Throws: It acts as a spy for the method,no need to use try catch block in
	// a method
	static void demo() throws ArithmeticException {
		int a = 20, b = 0, c;
		c = a / b;
		System.out.println(c);
	}

	public static void main(String args[]) {
		try {
			demo();// no need to create an object to invoke the method demo
					// because my method is in static
		} catch (ArithmeticException e) {// Handling the exception
			System.out.println("recaught:" + e);
		} finally {
			System.out.println("code gets executed always in this finally block");
		}
	}
}
