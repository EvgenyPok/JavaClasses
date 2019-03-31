package com.class13;

import java.util.Scanner;

public class StringsTask3 {

	public static void main(String[] args) {
		// Task 3 Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
		Scanner input=new Scanner (System.in);
		String mom,dad,babySex,babyName;
		System.out.print("Enter Mom's name: ");
		mom=input.nextLine();
		System.out.print("Enter Dad's name: ");
		dad=input.nextLine();
		System.out.println("boy or girl?");
		babySex=input.nextLine();
		switch (babySex) {
		case "boy":
			babyName=dad.substring(0,3)+mom.substring(mom.length()-2,mom.length());
			System.out.println("Suggested baby name: "+babyName.toUpperCase());
			
			break;
		case "girl":
			babyName=mom.substring(0,2)+dad.substring(dad.length()-3,dad.length());
			System.out.println("Suggested baby name: "+babyName.toUpperCase());
			break;
		default:
			System.out.println("it's not a boy nor girl");
		}
		
	}

}
