package com.class29;

public class Circle implements Shape{
	public int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int calculateArea() {
		return (int) ( this.radius * this.radius * Math.PI);
	}
	public int calculatePerimiter () {
		return (int) ( 2 * this.radius * Math.PI);}
}
