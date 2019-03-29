package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// In number is between 1-10 --> number is small
		// If number is between 11-100 --> medium
		// between 101-1000 --> large
		int n=10000;
		if (n>0 && n<=10) {
			System.out.println("Number is small");
		}else if (n>10 && n<100 ){
			System.out.println("Number is medium");
		}else if (n>100 && n<=1000) {
			System.out.println("Number is large");
		}else {
			System.out.println("Number is not in our range 1-1000: " +n);
		}
	}

}
