package com.jse.excercise.programs;

import java.util.Scanner;

/*
Program logic: Take a year through user and divide the year by 4 or 400,
 if the remainder is zero then it is a leap year else it is not a leap year.


*/
public class DetermineLeapYrExample {

	public void check() {

		int year;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		// Waiting for the user input
		year = in.nextInt();

		// if year is divisible by 4 or 400 it is a leap year
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)

		{
			System.out.println(year + " is a leap year ");
		} else

		{
			System.out.println(year + " is not leap year ");
		}

	}

	// main method begins execution of this class
	public static void main(String args[]) {
		DetermineLeapYrExample LeapYr = new DetermineLeapYrExample();
		LeapYr.check();
	}
}