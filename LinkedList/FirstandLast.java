package com.example;
import java.util.LinkedList;

public class FirstandLast {
    public static void main(String[] args) {
       
        LinkedList<String> colors = new LinkedList<>();
        colors.addFirst("Red");
        colors.add("orange");
        colors.addLast("Blue");
        System.out.println("Updated LinkedList: " + colors);
    }
}
