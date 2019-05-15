package com.class36;

public class ThrowTask {

	static int availableMoney = 500;
	public static void atmWithdraw(int a) {
		if (a<availableMoney) {
			availableMoney-=a;
			System.out.println("Plese take your money from the ATM");
		}else {
			throw new ArithmeticException("You do not have enough money");
		}
		
		}
	public static void main(String[] args) {
		atmWithdraw(400);
		atmWithdraw(200);
		
	}
}
