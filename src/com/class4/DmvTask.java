package com.class4;

import java.util.Scanner;

public class DmvTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age in full years:");
		age=input.nextInt();
		if (age<18) {
			System.out.println("Based on your age, you are too young for the licence. We will issue a learner permit for you");
		}else {
			System.out.println("You will be issued a Driver Licence based on your age");
		}
	}

}
