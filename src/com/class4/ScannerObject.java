package com.class4;
import java.util.Scanner;

public class ScannerObject {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter the whole number");
		int a=number.nextInt();
		if (a>0) {
			System.out.println(a+" positive");
		}else if (a<0) {
			System.out.println(a+" negative");
		}else {
			System.out.println(a+" is ZERO");
		}
	}
}
