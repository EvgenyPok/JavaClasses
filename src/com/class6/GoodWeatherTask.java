package com.class6;

import java.util.Scanner;

public class GoodWeatherTask {

	public static void main(String[] args) {
		int temp;
		boolean rainy,sunny,snowing;
		Scanner in;
		String activity;
		
		in=new Scanner(System.in);
		System.out.println("Please enter the temperature");
		temp=in.nextInt();
		
		if (temp>=40 && temp<=80) {
			System.out.println("Is it raining? (true/false)");
			rainy=in.nextBoolean();
			if (rainy) {
				activity="Watch movie";
			}else {
				activity="Go hiking";
			}
		}else if (temp >=25 && temp <40) {
			System.out.println("Is it snowing? (true/false)");
			snowing=in.nextBoolean();
			if (snowing) {
				activity="Go snowboarding";
			}else {
				activity="Do coding";
			}
		}else if (temp>80 && temp<=100) {
			System.out.println("Is it sunny? (true/false)");
			sunny=in.nextBoolean();
			if (sunny) {
				activity="Go to the beach";
			}else {
				activity="Do coding";
			}
		}else if (temp >100) {
			activity="It is too hot, turn on th AC and stay home";
		}else {
			activity="It is too cold, get some hot tea";
		}
		System.out.println("Suggested activity for today: "+ activity);

	}

}
