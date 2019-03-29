package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		for (int f=1;f<20; f++) {
			
			if (f%3==0) {
				continue;
			}
			System.out.println(f);
		}

	}

}
