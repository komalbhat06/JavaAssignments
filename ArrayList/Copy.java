// Write a Java program to copy one array list into another.
package com.example;
import java.util.ArrayList;

public class Copy {
    public static void main(String[] args) {
       
        ArrayList<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        sourceList.add(5);
        ArrayList<Integer> destinationList = new ArrayList<>();

        for (int element : sourceList) {
            destinationList.add(element);
        }
        System.out.println("Source List" + sourceList);

        System.out.println("Destination List: " + destinationList);
    }
}
