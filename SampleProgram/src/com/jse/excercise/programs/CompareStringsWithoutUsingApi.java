package com.jse.excercise.programs;

import java.util.Scanner;

public class CompareStringsWithoutUsingApi {
	public void compare() {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		// The input provided by user is stored in s1,s2

		System.out.println("Enter the first string");
		s1 = in.nextLine();

		System.out.println("Enter the second string");
		s2 = in.nextLine();

		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			int a = s1.charAt(i);
			int b = s2.charAt(i);
			if (a > b) {
				System.out.println("string a is greater than string b");// Display
																		// the
																		// string
				break;

			} else if (a < b) {
				System.out.println("string a is less than string b");
				break;
			} else {
				System.out.println("Strings are equal");
				break;
			}
		}

	}

	public static void main(String[] args) {

		CompareStringsWithoutUsingApi str = new CompareStringsWithoutUsingApi();// Creating
																				// object
																				// to
																				// invoke
																				// the
																				// method
		str.compare();

	}
}
