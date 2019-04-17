package com.class24;

public class Programming {

	public Programming () {
		System.out.println("I love programming languages");
	}
	public Programming (String str) {
		System.out.println("I love "+str);
	}
	
	public static void main(String[] args) {
		Programming obj = new Programming();
		Programming obj1 = new Programming("Java");
		
		PrivateMethodOverload obj2=new PrivateMethodOverload();
		obj2.Method2();
	}
}
