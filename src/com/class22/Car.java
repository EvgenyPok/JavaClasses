package com.class22;

public class Car {

	public static String make="Toyota";
	String color; // declaring instance variable
	String model;
	int doors;
	boolean engine;
	//constructor - has to be the same name as CLASS
	Car(){
		System.out.println("I am a constructor");
		System.out.println("hELLO FROM CONSTRUCTOR");
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		//hello();
	}
	public static void hello() {
		// before using local variable you have to initialize it
		String name;
		//System.out.println(name); compiler will give an error
		System.out.println("I am static hello method");
	}
}
