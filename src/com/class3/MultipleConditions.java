package com.class3;

public class MultipleConditions {

	public static void main(String[] args) {
		int day=1;
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday is a FUN day");
		}else if (day==6) {
			System.out.println("Saturday - code day");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("The day number should be between 1 and 7");
		}

	}

}
