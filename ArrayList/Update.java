//Write a Java program to update an array element by the given element.
package com.example;

import java.util.ArrayList;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("komal");
		names.add("Riya");
		names.add("Roshi");
		names.set(1, "Raj");
		for (String i:names) {
			System.out.println(i);
			
		}

	}

}
