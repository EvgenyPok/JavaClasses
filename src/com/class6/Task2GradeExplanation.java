package com.class6;

import java.util.Scanner;
public class Task2GradeExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter your grade (acceptable options are A,B,C,D):");
		Scanner in=new Scanner(System.in);
		char grade=in.next().charAt(0);
		String explanation="Not acceptable";
		
		switch (grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		}
		System.out.println("Grade "+grade+" is "+explanation);
	} 
}
