package com.class6;

import java.util.Scanner;

public class SwithString {
	public static void main(String[] args) {
		String country, food;
		Scanner in;
		in=new Scanner(System.in);
		System.out.println("Please enter your country:");
		country=in.nextLine();
		
		switch (country) {
		case "USA":
			food="Burgers";
			break;
		case "Russia":
			food="Borsch";
			break;
		case "Afganistan":
			food="Palau";
			break;
		case "Italy":
			food="Pasta";
			break;
		case "Turkey":
			food="Baklava";
			break;
		case "Morocco":
			food="Couscous";
			break;
		case "Kazakhstan":
			food="Beshparmak";
			break;
		case "Pakistan":
			food="Biryani";
			break;
		default:
			food="Unknown";
		}
	System.out.println("Your favourite food is "+food);	
	}
}
