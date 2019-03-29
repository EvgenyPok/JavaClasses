package com.class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/* 6. Ask a user to input a leap year. 
		 * Give the user 10 chances to enter a correct leap year. 
		 * As soon as the user enters the correct leap year exit the loop.
		 */
		Scanner in=new Scanner (System.in);
		int year;
		System.out.println("Please input a leap year");
		for (int i=0; i<10;i++) {
			year=in.nextInt();
			
			if (year%4==0) {
				System.out.println("You entered correct leap year: "+year);
				break;
			}else {
				System.out.println("No, the year "+year+" is not leap. Try again. Enter the year:");
			}
			if (i==9) {
				System.out.println("Sorry, you exceeded number of guesses. Goodbye!");
			}
		}
		
	}

}
