package com.class4;

public class NestedIf2 {
	public static void main(String[] args) {
		double gpa=3.4;
		double expectedGPA=3.5;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congrats! You worked had and got a degree!");
			if (gpa>expectedGPA) {
				System.out.println("We can offer you a job");
			}else {
				System.out.println("But unfortunately, we cannot hire you");
			}
		}else {
			System.out.println("Please work on your diploma first");
		}
	}
}
