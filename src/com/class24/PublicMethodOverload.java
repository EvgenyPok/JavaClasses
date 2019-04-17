package com.class24;

public class PublicMethodOverload {

	public static void Method () {
		System.out.println("I am static method with no parameters");
	}
	public static void Method (String str) {
		System.out.println("I am static method with 1 parameter String: "+ str);
	}
	public static void Method (int a) {
		System.out.println("I am static method with 1 parameter int: "+a);
	}
	public static void main(String[] args) {
		Method();
		Method("I lover overloading");
		Method(55);
	}
}
