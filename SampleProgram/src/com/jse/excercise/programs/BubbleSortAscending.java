package com.jse.excercise.programs;

import java.util.Scanner;

class BubbleSortAscending {
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
		 * Bubble sort algorithm starts by comparing the first two elements of
		 * an array and swapping if necessary, i.e., if you want to sort the
		 * elements of array in ascending order and if the first element is
		 * greater than second then, you need to swap the elements but, if the
		 * first element is smaller than second, you mustn't swap the element.
		 * Then, again second and third elements are compared and swapped if it
		 * is necessary and this process go on until last and second last
		 * element is compared and swapped. This completes the first step of
		 * bubble sort.
		 */
		for (i = 0; i < (num - 1); i++) {
			for (j = 0; j < num - i - 1; j++) {
				if (array[j] > array[j + 1]) {
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
