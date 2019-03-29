package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		int temp, freeze=32;
		temp=50;
		
		if (temp<=freeze) {
			System.out.println("Water will freeze with temperature "+temp+" degrees Farenheit");
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp+" degrees Farenheit");
		}

	}

}
