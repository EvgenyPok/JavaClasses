package com.class30;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	System.out.println("Is collection empty? "+names.isEmpty());
	names.add("Steve");
	names.add("Bill");
	names.add("Nick");
	names.add("John");
	names.add("Jack");
	System.out.println("Is there name Nick? "+names.contains("Nickas"));
	System.out.println("size of collection: "+names.size());
	for (String str:names) {
		System.out.println(str);
	}
			
	
}
}
