package com.class6;

import java.util.Scanner;

public class Task3Calc {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double num1, num2, result=0;
		char operation;
		System.out.println("Please enter 2 numbers");
		num1=in.nextDouble();
		num2=in.nextDouble();
		System.out.println("Please enter the math operation you want to do with those numbers (+ - * /");
		operation=in.next().charAt(0);
		
		switch (operation) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("The invalid operation");
		}
		System.out.println("The result of the operation is: "+result);
	}
}
