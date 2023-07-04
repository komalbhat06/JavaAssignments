package com.example;

import java.util.TreeSet;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> colors= new TreeSet<>();
		colors.add("RED");
		colors.add("PINK");
		colors.add("BROWN");
		colors.add("ORANGE");
		TreeSet<String> s=new TreeSet<>();
		s.addAll(colors);
		
		System.out.println(colors);
		System.out.println(s);

	}

}
