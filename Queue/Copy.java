package com.example;

	import java.util.PriorityQueue;

	public class Copy {
	    public static void main(String[] args) {
	        
	        PriorityQueue<String> queue1 = new PriorityQueue<>();
	        queue1.add("Red");
	        queue1.add("Green");
	        queue1.add("Blue");

	        PriorityQueue<String> queue2 = new PriorityQueue<>();
	      
	        queue2.addAll(queue1);
	        System.out.println("Elements of queue2:");
	        while (!queue2.isEmpty()) {
	            System.out.println(queue2.poll());
	        }
	    }
	}

