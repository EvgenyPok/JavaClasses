package com.class6;

import java.util.Scanner;

public class Task1Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("What country are you from?");
		String country=in.nextLine();
		String lang="unknown";
		
		switch (country) {
		case "Russia":
			lang="Russian";
			break;
		case "USA":
			lang="English";
			break;
		case "Poland":
			lang="Polish";
			break;
		case "Italy":
			lang="Italian";
			break;
		}
		if (lang=="unknown") {
			System.out.println("I don't know this country");
			
		} else {
		System.out.println("You are most likely speaking "+lang+" language");
	
	}
}
}