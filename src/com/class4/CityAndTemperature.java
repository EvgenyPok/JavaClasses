package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		String city;
		int tempF, tempC;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the city name:");
		city=input.nextLine();
		System.out.println("Please enter the temperature outside in Farenheit");
		tempF=input.nextInt();
		tempC=(tempF-32)*5/9;
		System.out.println("The temperature in the city "+city+" is "+tempC+" degrees Celcius");
	}}

	