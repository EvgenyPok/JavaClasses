package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=1;
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("This is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("Hoorray, it's a weekend!!!");
		}else {
			System.out.println("Day should be between 1 and 7");
		}
			
	
	}

}
