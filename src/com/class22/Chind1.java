package com.class22;

public class Chind1 extends Parent {
	
	String hairType="Curly";

	public static void main(String[] args) {
		
		Chind1 childObject=new Chind1();
		System.out.println("Child1 eye color is "+childObject.eyeColor);
		System.out.println("Child1 hair color is "+childObject.hairColor);
		System.out.println("Child1 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.playTennis();
		
		Parent parentObject = new Parent();
		//parentObject.hairType --> not accessible in Parent class object
		//parentObject.playTennis();
	}
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}
	
}
