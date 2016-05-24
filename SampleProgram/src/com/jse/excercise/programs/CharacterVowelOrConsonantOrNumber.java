package com.jse.excercise.programs;

import java.io.DataInputStream;
import java.io.IOException;

public class CharacterVowelOrConsonantOrNumber {
	public static void main(String[] args) throws IOException {// Signals that
																// an I/O
																// exception of
																// some sort has
																// occurred.
																// This class is
																// the general
																// class of
																// exceptions
																// produced by
																// failed or
																// interrupted
																// I/O
																// operations. {
		char ch;
		DataInputStream din = new DataInputStream(System.in);// A data input
																// stream lets
																// an
																// application
																// read
																// primitive
																// Java data
																// types
		System.out.println("Enter the character: ");
		ch = (char) (din.read());// Reads the next byte of data from this input
									// stream
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': {
			System.out.println("The character character is a Vowel.");
			break;
		}

		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':

		{
			System.out.println("The character entered is a Number.");
			break;
		}

		default: {
			System.out.println("The character entered is Constant.");
			break;
		}
		}
	}
}
