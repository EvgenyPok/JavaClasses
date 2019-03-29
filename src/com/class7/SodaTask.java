package com.class7;

import java.util.Scanner;

public class SodaTask {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		Double price;
		System.out.println("Please enter the price for your soda");
		price = in.nextDouble();
		while (price !=1.99) {
			System.out.println("Please enter correct price");
			price = in.nextDouble();
		}
		System.out.println("Enjoy your soda");
	}

}
