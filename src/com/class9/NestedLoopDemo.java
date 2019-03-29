package com.class9;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			
			for (int y=1; y<=3; y++) {
				
				for (int z=1; z<=3; z++) {
					System.out.println(i+" "+y+" "+z);
				}
			}
		}

	}

}
