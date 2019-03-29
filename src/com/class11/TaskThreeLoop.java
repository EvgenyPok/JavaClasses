package com.class11;

public class TaskThreeLoop {
	public static void main(String[] args) {
		
		int[] numbers= {10,16,18,66,46,55};
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
	}
	
}
