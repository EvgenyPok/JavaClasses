package com.class3;

public class ConcatAndOperator {
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		String a="Hello";
		String b="Bye";
		
		System.out.println(x+y+a+b);
		System.out.println(x+a+y+b);
		System.out.println(x+a+b+y);
		System.out.println(a+b+x+y);
		System.out.println(a+b+(x+y));
	}
	
}
