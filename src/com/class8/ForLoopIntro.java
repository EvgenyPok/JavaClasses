package com.class8;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//1.
		for (int i=1; i<=100; i++) {
			System.out.print(i);
		}
		//2.
		for (int i=100; i>=1; i--) {
			System.out.print(i);
		}
		//3.1.
		for (int i=1; i<=20; i+=2) {
			System.out.println(i);
		}
		//3.2
		for (int i=0; i<=20; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		//4.1
		for (i=20; i>=1; i-=2) {
			System.out.print(i);
		}
		//4.2.		
		for (int j=20; j>=1; j--) {
			if (j%2==0) {
				System.out.println(j);
			}
		//5.1
		for (i=20; i<=50; i+=2) {
			System.out.print(i);
		}
		// 5.2
		for (i=20; i<=50; i++) {
			if (i%2==0) {
				System.out.print(i);
			}
		}
		// 6.1
		for (i=21; i<=50; i+=2) {
			System.out.print(i);
		}
		//6.2
		for (i=20; i<=50; i++) {
			if (i%2!=0) {
				System.out.print(i);
			}
		}
		}
		}
	}
}
		
	


