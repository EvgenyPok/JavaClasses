package com.class17_2;

import java.util.Scanner;

public class TaskSumOfIntegers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the start and end points of the range");
		int start=in.nextInt();
		int finish=in.nextInt();
		sumOfOddAndEvenInRange(start,finish);
	}
	
	static void sumOfOddAndEvenInRange(int st, int fin) {
		int sumOdd = 0, sumEven = 0;
		for (int i = st; i <= fin; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of Odd numbers in your range " + st + " to " + fin + " is " + sumOdd);
		System.out.println("The sum of Even numbers in your range " + st + " to " + fin + " is " + sumEven);
	}
}
