package com.class24;

public class PrivateMethodOverload {

	public void Method2 () {
		System.out.println("I am method with no parameters");
	}
	private void Method2 (String str) {
		System.out.println("I am method with 1 parameter String: "+ str);
	}
	private void Method2 (int a) {
		System.out.println("I am method with 1 parameter int: "+a);
	}
	public static void main(String[] args) {
		PrivateMethodOverload obj=new PrivateMethodOverload();
		
		obj.Method2();
		obj.Method2("I lover overloading");
		obj.Method2(55);
	}
}
