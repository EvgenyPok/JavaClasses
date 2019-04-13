package com.class22;

public class StaticVsNonStatic {
	
	public String name="John";
	public static String lastName="Snow";
	public static void main(String[] args) {
		
	StaticVsNonStatic obj=new StaticVsNonStatic();
	obj.getInfo();
	getInfo1();//within same class we can call it by using method/variable name
	
	System.out.println(lastName);
	System.out.println(obj.name);
		
	}
	//non static method - can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		//getInfo1(); we can access static method from non static method
	}
	//static method can have access only to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am a static method");
		//getInfo(); we cannot access non static method within static method
	}
}
