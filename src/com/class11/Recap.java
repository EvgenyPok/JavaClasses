package com.class11;

public class Recap {
public static void main(String[] args) {
	// create an array of names and retrieve all values from it
	// 1. create an array using new keyword
	String[] names=new String[7];
	
	names[0]="Asel";
	names[1]="Awet";
	names[2]="Arif";
	names[3]="Weqas";
	names[4]="Dzmitri";
	names[5]="Shiva";
	names[6]="Sandesh";
	
	for (int i=0; i<names.length;i++) {
		System.out.println(names[i]);
	}
	// 2. create array using array literal
	String[] studentNames= {
			"Shaban",
			"Bilal",
			"Mehmet",
			"Zaki",
			"Samir",
			"Frank"};
	
	for (int i=0; i<studentNames.length;i++) {
		System.out.println(studentNames[i]);
	}
	// retreive values using: advanced forr loop, for each loop, enhanced for loop
	
	for (String student : studentNames) {
		System.out.println(student);
	}
	
}
}
