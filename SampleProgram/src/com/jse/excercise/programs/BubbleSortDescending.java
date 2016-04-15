package com.jse.excercise.programs;

import java.util.Scanner;

public class BubbleSortDescending {

	public static void main(String[] args) {
		int num, i, j, temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers to sort:");
		num = input.nextInt();

		int array[] = new int[num];

		System.out.println("Enter " + num + " integers: ");

		for (i = 0; i < num; i++)
			array[i] = input.nextInt();

		/*
		 * In bubble sort, we basically traverse the array from first to
		 * array_length - 1 position and compare the element with the next one.
		 * Element is swapped with the next element if the next element is
		 * smaller.
		 */
		for (i = 0; i < (num - 1); i++) {
			for (j = 0; j < num - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted list of integers:");

		for (i = 0; i < num; i++)
			System.out.println(array[i]);
	}
}
