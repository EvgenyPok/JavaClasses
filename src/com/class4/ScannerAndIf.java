package com.class4;

import java.util.Scanner;

public class ScannerAndIf {

	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number 1:");
		num1 = input.nextInt();
		System.out.println("You entered: " + num1 + " .Thank you. Please enter number 2:");
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println("You entered " + num2 + ". The number 1 is greater than number 2");
		} else if (num1 < num2) {
			System.out.println("You entered " + num2 + ". The number 2 is greater than number 1");
		} else {
			System.out.println("You entered " + num2 + ". The number 1 is equal to number 2");
		}
		System.out.println("I am done");
	}
}
