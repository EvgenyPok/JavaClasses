package com.class17_2;

import java.util.Scanner;

/* Ask user to enter the item they want to buy and  the price for the item. 
Then ask user to pay for it. Every time user enters money accumulate the amount 
and tell user how much is left to pay off the amount. Whenever user done with 
payments tell them "Thank you for shopping!"
 */
public class TaskShoppingTransaction {
	public static void main(String[] args) {
		buyAnItem();
	}
	
	
	static void buyAnItem() {
		Scanner in = new Scanner (System.in);
		double price, moneyIn=0, balance;
		String item;
		System.out.println("Please enter which item you want to buy?");
		item=in.nextLine();
		System.out.println("What is the price?");
		price=in.nextDouble();
		System.out.println("Please pay for your purchase. ");
		balance=price;
		while (balance>0) {
			System.out.println("Enter the bill or coin value");
			moneyIn=in.nextDouble();
			balance-=moneyIn;
		System.out.println("Your remaining balance is "+balance);
	}System.out.println("Thank you for shopping!");
	}
}
