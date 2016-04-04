package com.mstr.excercise.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is armstrong or not:");
		// The input provided by user is stored in n
		int n = input.nextInt();
		int r, sum = 0, temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);

			/*
			 * if,sum of cube of every digit present in the number is equal to
			 * the number itself then that number is called as armstrong number
			 */
		}
		if (sum == temp)
			System.out.print("Given number " + temp + " is Armstrong");
		else
			System.out.println("Given number " + temp + " is not Armstrong");
	}
}
