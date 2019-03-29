package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		
	
	/* write a program to check the work eligibility
	 * if user is younger than 16 --> not allowed to work
	 * otherwise - alowed to work. If he is <64 --> go to work, if >64 - go home and enjoy
	 */
	int age=18;
	int eligibleAge=16;
	int retirementAge=64;
	if (age<eligibleAge) {
		System.out.println("You are too young to work");
	}else {
		System.out.println("You are eligible to work");
		if (age<retirementAge) {
			System.out.println("Go work, you can do it!");
		}else {
			System.out.println("Please enjoy your life, you are not required to work");
			
		}
	}
}}
