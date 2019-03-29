package com.class4;

import java.util.Scanner;

public class LoanTask {
	public static void main(String[] args) {

		double amount;
		Scanner amt = new Scanner(System.in);
		System.out.println("Dear customer, please enter the amount (in USD) you want to get a loan for:");
		amount=amt.nextDouble();
		if (amount<=200000) {
			System.out.println("Congratulations! Your loan amount of "+amount+" USD is approved!");
		}else {
			System.out.println("Your loan request for "+amount+" USD is declined. See you next time!");
		}
}
}
