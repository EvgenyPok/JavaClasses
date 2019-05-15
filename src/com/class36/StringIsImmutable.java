package com.class36;

public class StringIsImmutable {
public static void main(String[] args) {
	//2 ways to create a string:
	//1 way:
	String str="Hello";
	//2 way:
	String str2=new String("Bye");
	
	str.toUpperCase();
	System.out.println(str.replace('o', 'a'));
	
	System.out.println(str);
}
}
