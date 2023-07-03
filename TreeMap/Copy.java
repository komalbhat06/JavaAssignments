package com.example;
import java.util.TreeMap;

public class Copy {
    public static void main(String[] args) {
       
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("A", 1);
        sourceMap.put("B", 2);
        sourceMap.put("C", 3);

        TreeMap<String, Integer> destinationMap = new TreeMap<>();

        destinationMap.putAll(sourceMap);
        System.out.println("Destination TreeMap: " + destinationMap);
    }
}

