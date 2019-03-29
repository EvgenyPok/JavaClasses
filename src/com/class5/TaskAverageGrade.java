package com.class5;

import java.util.Scanner;
public class TaskAverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int quiz,midterm,finalScore;
		System.out.println("Your scoree for quiz (0-100)?");
		quiz=in.nextInt();
		System.out.println("YOur midterm score (0-100)?");
		midterm=in.nextInt();
		System.out.println("Your final grade (0-100)?");
		finalScore=in.nextInt();
		double average=(quiz+midterm+finalScore)/3;
		String grade;
		if (average>=90) {grade="A";}
			else if (average>=70 && average<90) { grade="B";}
			else if (average>=50 && average<70) {grade="C";}
			else {grade="F";}
		System.out.println("Your grade is "+grade);
	}

}
