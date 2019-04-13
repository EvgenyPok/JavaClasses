package com.class22;

public class Child2 extends Parent {

	String personType="Optimistic";
	
	public static void main(String[] args) {
		Child2 childObject=new Child2();
		System.out.println("Child2 eye color is "+childObject.eyeColor);
		System.out.println("Child2 hair color is "+childObject.hairColor);
		System.out.println("Child2 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.swim();
		System.out.println("Child2 person type is "+childObject.personType);
		
	}
	
	public void swim() {
		System.out.println("Child 2 can swim");
	}
}
