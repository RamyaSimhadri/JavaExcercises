package com.jse.excercise.programs;

import java.util.Scanner;

public class ReverseString {

	public void reverse() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		// input taken from the user and stored in original
		System.out.println("Enter a string to reverse");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);// charAt method to extract
													// characters from the
													// string and append them in
													// reverse order to reverse
													// the entered string.

		System.out.println("Reverse of entered string is: " + reverse);
	}

	public static void main(String[] args) {

		ReverseString str = new ReverseString();
		str.reverse();
	}

}
