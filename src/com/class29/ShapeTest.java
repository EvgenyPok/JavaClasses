package com.class29;

public class ShapeTest {
public static void main(String[] args) {
	Shape sh1=new Circle(15);
	System.out.println("Area of circle is "+sh1.calculateArea());
	System.out.println("Perimeter of circle is "+sh1.calculatePerimiter());
	Shape sh2=new Square(28);
	System.out.println("Area of square is "+sh2.calculateArea());
	System.out.println("Perimeter of square is "+sh2.calculatePerimiter());
	
}
}
