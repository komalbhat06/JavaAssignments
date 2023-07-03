//Write a Java program to insert some elements at the specified position into a linked list.
package com.example;
import java.util.LinkedList;
import java.util.Arrays;

public class Add {

    public static void main(String[] args) {
       
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        String[] newColors = {"Yellow", "Orange"};
        int position = 1; 
        colors.addAll(position, Arrays.asList(newColors));
       
        System.out.println("Updated LinkedList: " + colors);
    }
}


