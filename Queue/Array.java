package com.example;
import java.util.PriorityQueue;

public class Array {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(10);
        numbers.offer(5);
        numbers.offer(15);
        numbers.offer(8);

        Integer[] array = new Integer[numbers.size()];

        numbers.toArray(array);

        System.out.println("Array elements:");
        for (Integer element : array) {
            System.out.println(element);
        }
    }
}

