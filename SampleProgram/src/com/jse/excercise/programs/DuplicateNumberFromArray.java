package com.jse.excercise.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberFromArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 5 };

		// HashSet Declaration
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			// If same integer is already present then add method will return
			// FALSE
			if (set.add(array[i]) == false)
			/*
			 * In this solution, all you have to do is to iterate over array and
			 * all elements in a set one by one. If Set.add() method returns
			 * false then element is already present in set and thus it is
			 * duplicate.
			 * 
			 */
			{
				System.out.println("Duplicate element found : " + array[i]);
			}
		}
	}
}