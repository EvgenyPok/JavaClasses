package com.class12;

public class StringManipulations {
	public static void main(String[] args) {
		// method string.length() returns int of symbols qty in the String
		String str="Syntax";
		System.out.println(str.length());
		
		String str1="Syntax Technologies";
		System.out.println(str1.length());
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		
		// method toUpperCase() toLowerCase()
		String str3="Hello";
		String newString=str3.toUpperCase();
		System.out.println(newString);
		System.out.println(newString.toLowerCase());
		
		// method Str1.equals(Str2) - compares 2 strings, true/false
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		// method Str1.equalsIgnoreCase
		boolean equals=expectedBrowser.equals(actualBrowser);
		boolean equalsNoCase=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
		System.out.println(equalsNoCase);
		
	}
}
