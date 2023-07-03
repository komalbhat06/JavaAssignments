//Write a Java program to remove the third element from an array list
package com.example;

import java.util.ArrayList;

public class Remove {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("komal");
	names.add("Riya");
	names.add("Roshi");
	names.remove(2);
	for (String i:names) {
		System.out.println(i);
		
	}
}
}
