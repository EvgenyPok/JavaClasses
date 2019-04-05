package com.class17;

public class Greetings {

	public static void main(String[] args) {

		Greetings obj = new Greetings();
		obj.hello();
		obj.findLargest(77,88); // calling the method findLargest() with passing parameters a and b
		// how to find the largest number
		obj.helloToInstructor("Weqas");

	}

	void findLargest(int a, int b) {
		if (a > b) {
			System.out.println("A is largest");
		} else {
			System.out.println("B is largest");
		}
	}

	void hello() {
		System.out.println("Hello");
	}
	
	void helloToInstructor(String name) {
		System.out.println("Hello "+name);
	}
}
