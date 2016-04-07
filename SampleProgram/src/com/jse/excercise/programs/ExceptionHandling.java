package com.jse.excercise.programs;

/*an exception handling in Java with Divide by zero error*/
public class ExceptionHandling {

	public static void main(String[] args) {
		// Try:Identifies the exception
		try {
			int a = 50, b = 0, c;
			c = a / b;
			System.out.println(c);
			// Catch:Handles the exception
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero:" + e);
		}
		// Finally:A block that will be executed always
		finally {
			System.out.println("code gets executed always");
		}
		System.out.println("Rest of the code");

	}

}
