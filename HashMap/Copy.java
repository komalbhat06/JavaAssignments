package com.example;
import java.util.HashMap;

public class Copy {
    public static void main(String[] args) {
        
        HashMap<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("A", 1);
        sourceMap.put("B", 2);
        sourceMap.put("C", 3);

        HashMap<String, Integer> destinationMap = new HashMap<>();
        destinationMap.putAll(sourceMap);
        System.out.println("Destination Map: " + destinationMap);
    }
}


