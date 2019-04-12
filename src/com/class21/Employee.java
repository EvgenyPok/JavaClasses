package com.class21;

public class Employee {
	int eID;
	int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee John=new Employee();
		Employee Jack=new Employee();
		John.eID=44532;
		Jack.eID=44662;
		John.salary=80000;
		Jack.salary=120000;
		Jack.printEmployeeData();
		John.printEmployeeData();
		
	}
	void printEmployeeData() {
		System.out.println("eID is "+eID);
		System.out.println("salary is"+salary);
		System.out.println("CEO is "+CEO);
	}
}
