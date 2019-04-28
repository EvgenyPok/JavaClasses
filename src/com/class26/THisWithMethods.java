package com.class26;

public class THisWithMethods {

	public void m1() {
		System.out.println("I am M1 method");
	}
	public void m2() {
		m1();// by default compiler adds this.m1();
		System.out.println("I am M2 method");
	}
	public static void main(String[] args) {
		THisWithMethods obj=new THisWithMethods();
		obj.m2();
	}
}
