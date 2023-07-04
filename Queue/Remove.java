package com.example;

import java.util.PriorityQueue;

public class Remove {
	public static void main(String[] args) {
		  
		  PriorityQueue<String> queue=new PriorityQueue<String>(); 
		  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  queue.offer("Bull");
		  queue.clear();
		  
		  System.out.println(queue);
}
}
