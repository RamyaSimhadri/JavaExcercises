package com.mstr.excercise.programs;

import java.util.ArrayList;

public class ClearArrayMyList {

	public static void main(String args[]) {
		ArrayList<String> arrl = new ArrayList<String>();// ArrayList
															// Declaration
		// adding elements to the array list
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		arrl.clear();// clear array list
		System.out.println("After clear ArrayList:" + arrl);
	}

}