package com.class9;

import java.util.Scanner;

public class TaskSumOfIntegers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int start, finish, sumOdd=0, sumEven=0;
		System.out.println("Please enter the start and end points of the range");
		start=in.nextInt();
		finish=in.nextInt();
		
		for (int i=start; i<=finish; i++) {
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("The sum of Odd numbers in your range "+start+" to "+finish+" is "+sumOdd);
		System.out.println("The sum of Even numbers in your range "+start+" to "+finish+" is "+sumEven);
	}
}
