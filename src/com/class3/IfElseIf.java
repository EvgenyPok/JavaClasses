package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		
		int num1=23;
		int num2=213;
		
		if (num1>num2) {
			System.out.println("I am if block");
			System.out.println("I have multiple lines");
			System.out.println("Num 1 is larger than Num 2");

		}
		else if(num1==num2) {
			System.out.println("Num 1 is equal to Num 2");
			System.out.println("I am else if block");
		}
		else {
			System.out.println("Num 1 is smaller than Num 2");
		}
		System.out.println("I am done with if else conditions");
	}

}
