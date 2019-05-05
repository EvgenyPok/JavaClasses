package com.class34;

import java.util.*;

public class PersonTest {
public static void main(String[] args) {
	

	Map<Integer, Person> payroll=new HashMap<>();
	 payroll.put(001, new Person("Amir","Shukan",33,35000));
	 payroll.put(002, new Person("Arnold","Shwartzenegger",63,1135000));
	 payroll.put(003, new Person("Bill","Black",23,45000));
	 payroll.put(004, new Person("Tim","Cook",50,335000));
	 
	 for (Person emp:payroll.values()) {
		 emp.printUserDetails();
	 }
}
}
