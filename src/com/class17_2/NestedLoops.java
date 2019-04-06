package com.class17_2;

public class NestedLoops {
	
	void print1To5Square() {
		for (int i = 1; i < 5; i++) {
			for (int y = 1; y < 6; y++) {
				System.out.print(y);
			}
			System.out.println();		}
	}
	
	void print1to6Rows() {
		for (int i=1; i<7; i++) {
			for (int y=0; y<7; y++) {
				System.out.print(i);}
			System.out.println();	}
	}
	
	void printFiveStarsSquare() {
		for (int i=1; i<5; i++) {
			for (int y=1; y<=5; y++) {
				System.out.print("*");}
			System.out.println();	}
	}
	void print5To1Square() {
		for (int i=1; i<5; i++) {
			for (int y=5; y>0; y--) {
				System.out.print(y);}
			System.out.println();	}
	}
	void printStarTriangle() {
		for (int i=1; i<5; i++) {
			for (int y=1; y<=i; y++) {
				System.out.print("*");			}
			System.out.println();		}
	}

	void printStarSquareFrame() {
		for (int i = 1; i <= 4; i++) {
			for (int y = 1; y <= 6; y++) {
				if (i == 1 || i == 4) {
					System.out.print("*");
				} else {
					if ((y != 1) && (y != 6)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NestedLoops nest=new NestedLoops();
		nest.printStarSquareFrame();
		nest.print1To5Square();
		nest.print1to6Rows();
		nest.printFiveStarsSquare();
		nest.print5To1Square();
		nest.printStarTriangle();
		
		System.out.println("-------------");
		
	}
}
