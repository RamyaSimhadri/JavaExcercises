package com.jse.excercise.programs;

import java.util.Scanner;
/*The object of the program is to move all of the disks from pole A to pole B; pole C is used for temporary storage.
 *  Here are the rules of the game: 1.Only one disk may be moved at a time 
 *  2.No disk may ever be placed on top of a smaller disk 
 *  3.Other than the prohibition of rule 2 above ,the top disk on any pole may be moved to either of the other two poles. 
 */

public class TowerOfHanoi {

	public static void Han(int m, char a, char b, char c) {
		if (m > 0) {
			/*
			 * Towers of Hanoi recursive solution 
			 * Recursive:Recursion is a basic
			 * programming technique you can use in Java, in which a method
			 * calls itself to solve some problem. A method that uses this
			 * technique is recursive.
			 * 
			 */
			Han(m - 1, a, c, b);
			System.out.println("move disc " + m + " from" + a + "to" + b);
			Han(m - 1, b, a, c);

			/*
			 * If n is 1, move disk 1 from origin to destination. Otherwise:
			 * 
			 * Move n – 1 disks (one at a time) from origin to temporary, Move
			 * disk n from origin to destination ,Move n – 1 disks (one at a
			 * time) from temporary to destination
			 */

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("How many discs");
		n = in.nextInt();
		Han(n, 'a', 'b', 'c');
	}
}
