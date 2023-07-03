//Write a Java program to insert an element into the array list at the first position.
package com.example;

import java.util.ArrayList;

public class FirstElement {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("komal");
		names.add("Riya");
		names.add("Roshi");
		names.add(0,"raj");
		for (String i:names) {
			System.out.println(i);
			
		}
	}
}
