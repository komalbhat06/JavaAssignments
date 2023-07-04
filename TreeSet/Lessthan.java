package com.example;

import java.util.TreeSet;

public class Lessthan {
	public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(315);
        numbers.add(80);
        numbers.add(132);

        int givenElement = 90;
        Integer result = numbers.floor(givenElement);

        System.out.println("Given Element: " + givenElement);
        System.out.println("Element less tahn or equal to: " + result);
    }
}
