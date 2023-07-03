//Write a Java program to iterate through all elements in an array list.
package com.example;

import java.util.ArrayList;

public class Iterate {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("komal");
		names.add("Riya");
		names.add("Roshi");
		for (String i:names) {
			System.out.println(i);
			
		}
	}

}
