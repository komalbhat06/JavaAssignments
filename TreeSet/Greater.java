package com.example;

import java.util.TreeSet;

public class Greater {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(8);
        numbers.add(12);

        int givenElement = 9;
        Integer result = numbers.ceiling(givenElement);

        System.out.println("Given Element: " + givenElement);
        System.out.println("Element Greater than or Equal to Given Element: " + result);
    }


}
