package com.example;

import java.util.TreeSet;

public class FirstandLast {
	public static void main(String[] args) {
		TreeSet<String> colors= new TreeSet<>();
		colors.add("RED");
		colors.add("PINK");
		colors.add("BROWN");
		colors.add("ORANGE");
		System.out.println(colors);
		System.out.println(colors.first());
		System.out.println(colors.last());
	
}
}


