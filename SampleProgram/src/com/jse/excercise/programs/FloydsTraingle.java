package com.jse.excercise.programs;

import java.util.Scanner;

/*Floyd's traingle:
 * Floyd’s triangle is a right angled-triangle using the natural numbers*/
public class FloydsTraingle {

	public void floyd() {

		int rows, number = 1, counter, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle");
		// User input is stored in rows
		rows = in.nextInt();
		System.out.println("Floyd's Traingle");
		System.out.println("***************");
		for (counter = 1; counter <= rows; counter++) {// used to print the
														// number of rows
			for (j = 1; j <= counter; j++) {// used to print numbers in the row
				System.out.print(number + "   ");
				number++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		FloydsTraingle num = new FloydsTraingle();
		num.floyd();
	}
}