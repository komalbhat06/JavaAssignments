//Write a Java program to append the specified element to the end of a linked list.
package com.example;
import java.util.LinkedList;

public class Append {
	public static void main(String[] args) {
		
		LinkedList<Integer> num= new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(1,1);
		for(int i:num) {
			System.out.println(i);
		}
		
	}

}
