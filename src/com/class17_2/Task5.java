package com.class17_2;

import java.util.Scanner;

public class Task5 {
	static void guessSecretNumber(int secretNum) {
		Scanner in = new Scanner(System.in);
		int userNum;
		System.out.println("Please guess a secret number between 1 and 20");
		do {
			System.out.println("Enter your guess:");
			userNum = in.nextInt();
			if (userNum > secretNum) {
				System.out.println("Try again with lower number");
			} else if (userNum < secretNum) {
				System.out.println("Try again with larger number");
			}
		} while (secretNum != userNum);
		System.out.println("Congratulations!! You got it!");
	}

	public static void main(String[] args) {
		guessSecretNumber(12);			
	}

}
/*5.
Write a guessing game where the user has to guess a secret number between 1 and 20. 
After every guess input, the program tells the user whether their number was too large
 or too small. The program will keep asking the user to enter the number until he finds
  the correct number. When the correct answer is found the system should display "Congratulations!!. You got it!".
*/