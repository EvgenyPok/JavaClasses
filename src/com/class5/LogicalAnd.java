package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=in.nextInt();
		if (age>=0 && age<3) {
			System.out.println("You are baby");
		}else if (age>=3 && age<5) {
			System.out.println("You are toddler");
		}else if (age>=5 && age<13) {
			System.out.println("you are kid");
		}else if (age>=13 && age<20) {
			System.out.println("You are teenager");
		}else if (age>=20 && age<64) {
			System.out.println("You are adult");
		}else {
			System.out.println("You are senior");
		}	
	}
}
