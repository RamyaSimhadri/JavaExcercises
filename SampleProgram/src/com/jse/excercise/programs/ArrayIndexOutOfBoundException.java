package com.jse.excercise.programs;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		try {// Identifies the exception
			int a[] = new int[10];
			// Array has only 10 elements
			a[11] = 9;// array is initialized to store only 10 elements indexes
						// 0 to 9. Since we are invoking index 11 that’s why it
						// is throwing this exception.
		} catch (ArrayIndexOutOfBoundsException e) {// Handles the exception

			System.out.println("ArrayIndexOutOfBounds");
		}
	}

}
