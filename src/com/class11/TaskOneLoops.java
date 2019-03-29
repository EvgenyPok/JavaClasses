package com.class11;

public class TaskOneLoops {
	public static void main(String[] args) {
		String[] cars= {
				"BMW","Toyota","Volvo", "Ford", "Subaru", "Lexus"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		for (String car : cars) {
			System.out.print(car+" ");
		}
	}
}
