package com.example;
import java.util.*;
public class Less {
public static void main(String[] args) {

 TreeSet <Integer>tree_num = new TreeSet<Integer>();
 
   
 tree_num.add(1);
 tree_num.add(2);
 tree_num.add(3);
 tree_num.add(5);
 tree_num.add(6);
 tree_num.add(7);
 tree_num.add(8);
 tree_num.add(9);
 tree_num.add(10);
   System.out.println(tree_num.headSet(7));
 
 }    
}

