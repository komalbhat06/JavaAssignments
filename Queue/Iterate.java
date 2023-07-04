package com.example;
import java.util.PriorityQueue;
public class Iterate {
	
	 public static void main(String[] args) {
	    PriorityQueue<String> p = new PriorityQueue<String>();  
	  p.add("Red");
	  p.add("Green");
	  p.add("Orange");
	  p.add("White");
	  p.add("Black");
	  System.out.println("Elements of the Priority Queue: ");
	  // iterate the Priority Queue
	  for (String element : p) {
	    System.out.println(element);
	    }
	 }
	
}
