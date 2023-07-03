//Write a Java program to iterate through all elements in a linked list starting at the specified position.
package com.example;

import java.util.LinkedList;

public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> num= new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		for(int i=2;i<num.size();i++) {
			System.out.println(i);
		}

	}

}
