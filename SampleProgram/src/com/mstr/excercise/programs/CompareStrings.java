package com.mstr.excercise.programs;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String args[]) {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		// The input provided by user is stored in s1,s2

		System.out.println("Enter the first string");
		s1 = in.nextLine();

		System.out.println("Enter the second string");
		s2 = in.nextLine();
		/*
		 * This program compare strings i.e test whether two strings are equal
		 * or not, compareTo method of String class is used to test equality of
		 * two String class objects.
		 */
		if (s1.compareTo(s2) > 0)
			System.out.println("First string is greater than second.");
		else if (s1.compareTo(s2) < 0)
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are equal.");
	}

}
