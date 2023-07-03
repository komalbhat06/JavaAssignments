//Write a Java program to iterate a linked list in reverse order.
package com.example;
import java.util.Iterator;

import java.util.LinkedList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> num= new LinkedList<>();
		num.add(1);
		num.add(24);
		num.add(3);
		num.add(4);
		num.add(5);
		
		Iterator<Integer> iterator = num.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
