package com.jse.excercise.programs;

import java.util.Scanner;

/*This program find all substrings of a string and the prints them.
 *  For example substrings of "fun" are :- "f", "fu", "fun", "u", "un" and "n". */
public class SubstringsOfString {

	public static void main(String args[]) {
		String string, sub;
		int i, c, length;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings");
		// Waiting for user input
		string = in.nextLine();

		length = string.length();

		System.out.println("Substrings of \"" + string + "\" are :-");
		// substring method of String class is used to find substring
		// String substring(int beginIndex, int endIndex): Returns the substring
		// starting from the given index(beginIndex) till the specified
		// index(endIndex)
		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = string.substring(c, c + i);
				System.out.println(sub);
			}
		}
	}
}
