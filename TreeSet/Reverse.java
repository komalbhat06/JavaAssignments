package com.example;

import java.util.*;

public class Reverse {

	    public static void main(String[] args) {
	    	TreeSet<String> colors = new TreeSet<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        
	        Iterator<String> iterator = colors.descendingIterator();
	        System.out.println("Reverse Order View:");

	        while (iterator.hasNext()) {
	            String color = iterator.next();
	            System.out.println(color);
	        }
	

}
}


