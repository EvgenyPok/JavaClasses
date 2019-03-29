package com.class4;

public class PositiveOrNegative {

	public final class ScannerClass {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		int a=0;
		if (a > 0) {
			System.out.println(a + " is a positive number");
		} else if (a < 0) {
			System.out.println(a + " is a negative number");
		} else {
			System.out.println(a+" is ZERO");
		}

	}

}
