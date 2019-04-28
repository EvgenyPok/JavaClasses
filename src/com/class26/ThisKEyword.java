package com.class26;

public class ThisKEyword {

	int num1, num2;
	
	public ThisKEyword() {
		System.out.println("No parameters here");
	}

	public ThisKEyword(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void sum(int num1,int num2) {
		System.out.println("The sum of local variables="+(num1+num2));
		System.out.println("The sum of instance variables="+(this.num1+this.num2));
	}
	public static void main(String[] args) {
		ThisKEyword obj = new ThisKEyword(10,20);
		obj.sum(100,200);
		
		ThisKEyword obj1 = new ThisKEyword();
		obj1.sum(12,13);
	}
}
