package com.class29;

public class MarksTest {
		public static void main(String[] args) {
			Marks a=new A(87,79,99);
			System.out.println("Student A has GPA "+a.getPercentage());
			Marks b=new B(88,96,95,79);
			System.out.println("Student B has GPA "+b.getPercentage());}
}
