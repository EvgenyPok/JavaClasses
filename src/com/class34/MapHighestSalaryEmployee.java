package com.class34;

import java.util.*;

public class MapHighestSalaryEmployee {
public static void main(String[] args) {
	Map <String, Integer> Employees=new HashMap<>();
	
	Employees.put("Smith", 90000);
	Employees.put("Doe", 92000);
	Employees.put("Adams", 85000);
	Employees.put("Jameson", 60000);
	Employees.put("Edison", 97000);
	Employees.put("Williams", 95500);

	System.out.println(Employees);
	int max=0;
	String name=null;
	for (Map.Entry<String,Integer> num:Employees.entrySet()) {
		if (num.getValue()>max) {
			max=num.getValue();
			name=num.getKey();
		}
	}
	
	System.out.println(name+" have the highest salary of "+max);
	
}
}
