package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<5; i++) {
			for (int y = 1; y<6; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		for (int i=1; i<7; i++) {
			for (int y=0; y<7; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i=1; i<5; i++) {
			for (int y=1; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<5; i++) {
			for (int y=5; y>0; y--) {
				System.out.print(y);
			}
			System.out.println();
			
		}
		for (int i=1; i<5; i++) {
			for (int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 1; i <= 4; i++) {
			for (int y = 1; y <= 6; y++) {
				if (i == 1 || i == 4) {
					System.out.print("*");
				} else {
					if ((y != 1) && (y != 6)) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					

				}
			}
			System.out.println();

		}
	}
}
