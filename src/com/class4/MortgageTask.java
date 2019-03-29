package com.class4;

import java.util.Scanner;

public class MortgageTask {

	public static void main(String[] args) {
		double mRate=4; 
		int homePrice=1;
		Scanner input=new Scanner (System.in);
		System.out.println("What is the mortgage rate?");
		mRate=input.nextDouble();
		System.out.println("What is the house buing price?");
		homePrice=input.nextInt();
		if (mRate>4.5) {
			System.out.println("The mortgage rate "+mRate+" is too high, I am not interested to buy a house");
		}else {
			if (homePrice>200000) {
				System.out.println("The price is "+homePrice+". I will take a mortgage to finance this house' purchase");
			}else {
				System.out.println("The price is "+homePrice+". I am considering to buy this house for cash");
			}
		}

	}

}
