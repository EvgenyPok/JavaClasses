package com.class32;

public abstract class CreditCard {

	public String creditCardName;
	
	public CreditCard(String creditCardName) {
		this.creditCardName=creditCardName;
	}
	
	public void openAccount() {
		System.out.println("Open "+creditCardName+" credit card ");
	}
	public abstract void interestRate();
	public abstract void annualFee();
}
class Visa extends CreditCard {
	public Visa(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee 250$");
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate 25%");
	}
}
class AX extends CreditCard {
	public AX (String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee 150$");
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate 28%");
	}
}
class MasterCard extends CreditCard {
	public MasterCard (String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has no annual fee");
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate 30%");
	}
}