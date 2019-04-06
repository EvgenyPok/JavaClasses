package com.class17_2;

public class Task4 {
	static void printPattern() {
		for (int i=1; i<=5;i++) {
			for (int y=1; y<=i; y++) {
				System.out.print("*");
			}System.out.println();
		}
		for (int i=4; i>=1;i--) {
			for (int y=1; y<=i; y++) {
				System.out.print("*");
			}System.out.println();
		}
	}
/*
 * 4. Print the following pattern:
*
**
***
****
*****
****
***
**
*
 */
	public static void main(String[] args) {
		printPattern();
	}

}
