package com.jse.excercise.programs;

import java.util.Arrays;
import java.util.Scanner;

/*In this method, we compare each element of an array with other elements.
 *  If any two elements are found equal, we declare them as duplicates.*/
public class DuplicateNoFrmArrayWithoutUsingApi {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 3, 2, 4 };
		// sorts an array in ascending order
		Arrays.sort(array);

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] == array[i]) {
				System.out.println("duplicate number is " + array[i]);
			}
		}

	}
}
