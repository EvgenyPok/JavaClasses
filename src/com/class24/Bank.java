package com.class24;

public class Bank {

	public int chargeInterest() {
		return 0;
	}
}

class BOA extends Bank{
	@Override//annotation
	public int chargeInterest() {
		return 2;
	}
}

class PNC extends Bank{
	@Override
	public int chargeInterest() {
		return 3;
	}
}