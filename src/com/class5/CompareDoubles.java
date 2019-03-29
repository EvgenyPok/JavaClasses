package com.class5;

import java.util.Scanner;

public class CompareDoubles {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter first number: ");
	double num1=in.nextDouble();
	System.out.print("Please enter the second number: ");
	double num2=in.nextDouble();
	System.out.print("Please enter the third number: ");
	double num3= in.nextDouble();
	double largest=0;
	
		if (num1 >= num2) {
			if (num1 >= num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		} else {
			if (num2 >= num3) {
				largest = num2;
			} else {
				largest = num3;
			}
			System.out.println("The largest between 3 numbers is: " + largest);
		}
	}
}
