package com.example;

import java.util.PriorityQueue;

public class Compare {
	public static void main(String[] args) {
		  
		  PriorityQueue<String> queue=new PriorityQueue<String>(); 
		  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  queue.offer("Bull");
		  
		  System.out.println(queue);
		  PriorityQueue<String> fruits=new PriorityQueue<String>(); 
		  
		  fruits.add("Red");
		  fruits.add("Green");
		  fruits.add("Orange");
		  fruits.add("White");
		  fruits.add("Black");
		  fruits.offer("Bull");
		  
		  System.out.println(fruits);
		  System.out.println(queue.equals(fruits));
}
}

