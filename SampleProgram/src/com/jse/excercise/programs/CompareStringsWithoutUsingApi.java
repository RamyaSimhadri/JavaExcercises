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
		if (s1.length() == s2.length()) {
			for (int i = 0; i <= s1.length() && i <= s2.length(); i++) {
				int a = s1.charAt(i);
				int b = s2.charAt(i);
				if (a == b) {
					System.out.println("string a is equal to b");
				} else {
					System.out.println("strings are not equal");// the
				}
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
