package com.example;

import java.util.TreeMap;

public class KeySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> scores = new TreeMap<>();
 
	    scores.put("John", 90);
	    scores.put("Emily", 95);
	    scores.put("James", 85);
	    Boolean s=scores.containsKey("John");
	    System.out.println(s);
	    

	}

}
