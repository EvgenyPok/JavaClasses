package com.class17_2;

public class NestedLoop {

	public static void main(String[] args) {
		printNestedLoopDemo ();
		
	}
	static void printNestedLoopDemo () {
		for (int i=0; i<3; i++) {
			
			for (int y=0; y<3; y++) {
				System.out.println("I am inner loop "+i+"."+y);
			}
			System.out.println("-----------I am outer loop---------"+i);
		}
	}
}
