package com.class4;

import java.util.Scanner;

public class SalaryAndBonus {
 public static void main(String[] args) {
	int yearsWorked;
	double annualSalary;
	Scanner input=new Scanner(System.in);
	System.out.println("This program will determine your bonus eligibility and amount. Please enter number of years worked");
	yearsWorked=input.nextInt();
	System.out.println("Nice, you worked for "+yearsWorked+" years");

	
	if (yearsWorked>=5) {
		System.out.println("And you are eligible for the bonus");
		System.out.println("Now, what is your annual salary?");
		annualSalary=input.nextDouble();
		if (annualSalary>50000) {
			System.out.println("Congrats, your bonus this year is 5000. Thank you for your hard work!");
		}else {
			System.out.println("Your bonus this year is 3000. Thank you for your hard work!");
		}
	}else {
		System.out.println("Unfortunately, you did not work enough years to get the bonus");
	}
}
}
