package com.class29;

public class Square implements Shape {
	int sidelength;
	Square(int sidelength){
		this.sidelength=sidelength;
	}
	public int calculateArea() {
		return this.sidelength*this.sidelength;
	}
	public int calculatePerimiter () {
		return this.sidelength*4;}
}
