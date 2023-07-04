package com.example;

import java.util.TreeSet;

public class Equal {
	public static void main(String[] args) {
		TreeSet<String> colors= new TreeSet<>();
		colors.add("RED");
		colors.add("PINK");
		colors.add("BROWN");
		colors.add("ORANGE");
		System.out.println(colors);

		TreeSet<String> fruits= new TreeSet<>();
		fruits.add("Peach");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Papapya");
	
		System.out.println(fruits);
		System.out.println(colors.equals(fruits));

}
}
