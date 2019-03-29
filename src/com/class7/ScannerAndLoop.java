package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		String name=null;
		System.out.println("Please enter 3 names");
		int a=0;
		while (a<3) {
			name=in.nextLine();
			System.out.println("You are doing great, "+name);
			a++;
		}
		
}
}
