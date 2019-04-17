package com.class23;

public class Employee {

	public int salary;
	public static String department="IT";
	
	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
	}
	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
}
