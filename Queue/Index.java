package com.example;

import java.util.PriorityQueue;

public class Index {
	public static void main(String[] args) {
		  
		  PriorityQueue<String> queue=new PriorityQueue<String>(); 
		  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  queue.offer("Bull");
		  
		  System.out.println(queue);
}
}
