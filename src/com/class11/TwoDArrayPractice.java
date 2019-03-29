package com.class11;

public class TwoDArrayPractice {
	public static void main(String[] args) {
		String[][] people= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith", "Jordan", "Jackson","Obama"}
		};
		System.out.println(people[0][1]+" "+people[1][0]);
		System.out.println(people[0][0]+" "+people[1][3]);
		System.out.println(people[0][2]+" "+people[1][2]);
		System.out.println(people[0][3]+" "+people[1][1]);
	}
}
