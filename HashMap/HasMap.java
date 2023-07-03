package com.example;

import java.util.HashMap;

public class HasMap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> dept= new HashMap<Integer,String>();
		dept.put(1, "CSE");
		dept.put(2, "IS");
		dept.put(3, "CIVIL");
		dept.put(4, "ECE");
		dept.clear();
		System.out.println(dept.isEmpty());
		
		
		
	}
}
