package com.class22;

public class TestStudents {

	public static void main(String[] args) {
		Students jeff=new Students("Jeff", 85,78,95);
		Students john=new Students("John", 75,78,85);
		Students bill=new Students("Bill", 90,90,90);
		Students matt=new Students("Matt", 65,55,80);
		Students will=new Students("Will", 65,79,99);
		jeff.AverageGrade();
		john.AverageGrade();
		bill.AverageGrade();
		matt.AverageGrade();
		will.AverageGrade();
		
	}
	
}
