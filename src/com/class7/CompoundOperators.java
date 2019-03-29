package com.class7;

public class CompoundOperators {

	public static void main(String[] args) {
		
		int a=10;
		a=a+10;
		System.out.println(a); //20
		
		int b=100;
		b=b+100;
		System.out.println(b); //200
		
		int c=100;
		c+=100; // c=c+100;
		System.out.println(c);//200
		c+=35;
		System.out.println(c);
		
		int d=30;
		d-=10;
		System.out.println(d);//20
		d+=50;
		d/=7; //10
		d*=5;
		System.out.println(d);
		d%=7;
		System.out.println(d);
		
		
	}

}
