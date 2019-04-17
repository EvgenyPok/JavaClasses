package com.class24;

public class TestEmployees {

	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor con=new Contractor();
		
		emp.getPaid();
		ft.getPaid();
		con.getPaid();
	}
}
