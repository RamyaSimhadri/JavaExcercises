package com.jse.excercise.programs;

import java.util.HashMap;

/*The steps we followed in the below example are:

1) Create a HashMap and populate it with key-value pairs.
2) Check any key existence by calling containsKey() method. This method returns a boolean value.*/
public class CheckKeyExample {

	public static void main(String[] args) {

		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(11, "Chaitanya");
		hashmap.put(22, "Pratap");
		hashmap.put(33, "Singh");
		hashmap.put(44, "Rajesh");
		hashmap.put(55, "Kate");
		/*
		 * public boolean containsKey(Object key): Returns true if this map
		 * contains a mapping for the specified key.
		 */

		// Checking Key Existence
		boolean flag = hashmap.containsKey(22);
		System.out.println("Key 22 exists in HashMap? : " + flag);

		boolean flag2 = hashmap.containsKey(55);
		System.out.println("Key 55 exists in HashMap? : " + flag2);

		boolean flag3 = hashmap.containsKey(99);
		System.out.println("Key 99 exists in HashMap? : " + flag3);
	}
}
