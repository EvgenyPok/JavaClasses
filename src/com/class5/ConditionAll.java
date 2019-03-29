package com.class5;

import java.util.Scanner;

public class ConditionAll {
	public static void main(String[] args) {
		double price;
		double finalPrice;
		int discount = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter if there was a sale (true/false)");
		boolean isSale = in.nextBoolean();
		System.out.println("Please enter the listed price of the item");
		price = in.nextDouble();

		if (isSale) {
			System.out.println("Lets's check your discount");

			if (price < 20) {
				discount = 20;
			} else if (price >= 20 && price < 100) {
				discount = 30;
			} else if (price >= 100 && price < 500) {
				discount = 50;
			} else {
				discount = 75;
			}
		} else {
			System.out.println("No sale - no discount");
		}
		finalPrice = price-(price * discount / 100);
		System.out.println("Your Discount is "+ discount+"%");
		System.out.println("You have to pay "+finalPrice+" for the item that costs "+price);
	}
}
