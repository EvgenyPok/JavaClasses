package com.class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		NestedLoopDemo demo= new NestedLoopDemo();
		demo.printNumbers();

	}
	void printNumbers() {
		for (int i=1; i<=3; i++) {
			
			for (int y=1; y<=3; y++) {
				
				for (int z=1; z<=3; z++) {
					System.out.println(i+" "+y+" "+z);
				}
			}
		}
	}

}
