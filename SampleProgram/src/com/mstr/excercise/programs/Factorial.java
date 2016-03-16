package com.mstr.excercise.program1;

public class Factorial {

	public void Factorialnumber() {
		int i;
		int factor = 1;
		for (i = 7; i > 0; i--)// we start from 7 and count backwards until 1
			factor = factor * i;// multiply result and current number,and update
								// result

		{
			System.out.println("Factorial of a number is :" + factor);// Display
																		// the
																		// string

		}
	}

	public static void main(String[] args) {

		Factorial f1 = new Factorial();// Creating object to invoke the method
		f1.Factorialnumber();

	}

}
