package com.class12;

public class StringManipulations2 {
	public static void main(String[] args) {
		
		String str="Good morning, students!";
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		String present="Welcome, Mehmet54543736";
		String neededValue="weLcome";
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1= present.toLowerCase().contains(neededValue.toLowerCase());
		System.out.println(flag1);
		
		// methods startsWith(); endsWith();
		System.out.println("____StartsWith & EndsWith___");
		String str1="syntax";
		
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		System.out.println(str1.endsWith("X"));
		
		// isEmpty() - true if length of string =0
		String str2="";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		// concat
		System.out.println("___concat___");
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		// str.trim() --> removes spaces before and at end of string
		System.out.println("______---______");
		String expected="You may qualify for multi-policy discount";
		String actual="   You may qualify for multi-policy discount  ";
		System.out.println(expected.equals(actual));
		System.out.println(expected.equals(actual.trim()));
	}
}
