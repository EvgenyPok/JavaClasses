package com.class22;

public class Students {
	public String studentName;
	public int mathGrade;
	public int gymGrade;
	public int scienceGrade;

	public Students(String name, int math, int gym, int science) {
		studentName = name;
		mathGrade = math;
		gymGrade = gym;
		scienceGrade = science;
	}

	public void AverageGrade() {
		double average = (double) ((mathGrade+ gymGrade + scienceGrade) / 3);
		System.out.println("Student name: " + studentName + " average grade is " + average);
	}
}
