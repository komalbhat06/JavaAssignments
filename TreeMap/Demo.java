//Write a Java program to associate the specified value with the specified key in a Tree Map.
package com.example;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		
	TreeMap<String, Integer> scores = new TreeMap<>();

  
    scores.put("John", 90);
    scores.put("Emily", 95);
    scores.put("James", 85);
    System.out.println("TreeMap: " + scores);
}

}
