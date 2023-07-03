//Write a Java program to retrieve an element (at a specified index) from a given array list.
package com.example;

import java.util.ArrayList;

public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("komal");
		names.add("Riya");
		names.add("Roshi");
		String name=names.get(0);
		System.out.println(name);
	}

	}


