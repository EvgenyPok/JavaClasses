package com.class32;

import java.util.HashSet;

public class HashSetTask {

	public static void main(String[] args) {
			
	HashSet<String> city=new HashSet<>();
	city.add("Stockholm");
	city.add("New York");
	city.add("Dallas");
	city.add("Toronto");
	city.add("Panama");
	System.out.println(city);
	city.add("Toronto");
	System.out.println(city);
	
	System.out.println("set size "+city.size());
	
	for (String s:city) {
		System.out.println(s);
	}
	
	}	
}
