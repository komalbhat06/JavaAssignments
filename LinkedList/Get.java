package com.example;
import java.util.LinkedList;
public class Get {

	public static void main(String[] args) {
		
	     LinkedList<String> l_list = new LinkedList<String>();
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	          
	    String first_element = l_list.getFirst();
	    System.out.println("First Element is: "+first_element);
	
	    String last_element = l_list.getLast();
	    System.out.println("Last Element is: "+last_element);
	 }
	}



