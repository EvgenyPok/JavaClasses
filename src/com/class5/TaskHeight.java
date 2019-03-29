package com.class5;

import java.util.Scanner;

public class TaskHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Person 1, Pease enter your height in inches:");
		int height1 = in.nextInt();
		System.out.println("Person 2, please enter your height in inches:");
		int height2 = in.nextInt();
		if (height1 / 12 < 5) {
			System.out.println("Person 1, You are short");
		} else if (height1 / 12 >= 5 && height1 / 12 < 6) {
			System.out.println("Person 1, you are medium");
		} else {
			System.out.println("Person1, you are tall");
		}
		
		if (height2 / 12 < 5) {
			System.out.println("Person 2, You are short");
		} else if (height2 / 12 >= 5 && height2 / 12 < 6) {
			System.out.println("Person 2, you are medium");
		} else {
			System.out.println("Person2, you are tall");
		}
	}
}
