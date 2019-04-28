package com.class25;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
class Puppy extends Animal{
	/*public void whoAmI() { - This instance method cannot override the 
	static method from Animal
	System.out.println("I am a puppy");
	}*/
}
class Monkey extends Animal{
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}