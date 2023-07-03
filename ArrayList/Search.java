//Write a Java program to search for an element in an array list.
package com.example;
import java.util.ArrayList;

public class Search {
	
	public static void main(String[] args) {

	ArrayList<String> colors = new ArrayList<>();
	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	Boolean s=colors.contains("Red");
	if(s) {
		System.out.println("element found");
		
	}
	else {
		System.out.println("not found");
	}
	
}
}
