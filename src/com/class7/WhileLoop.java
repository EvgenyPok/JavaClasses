package com.class7;

public class WhileLoop {
public static void main(String[] args) {
	boolean morning=true;
	
	if (morning) {
		System.out.println("Good morning"); // will be executed only once
	}
	//while (morning) {
	//	System.out.println("Good morning");//will be executing infinite times
	//}
	
//	int a=1;
	//while (a<10) {
	//	System.out.println("Hello");
	//	a++;
	//}
	int b=1;
	while (b<=5) {
		System.out.println("I am inside while loop"+b);
		b++;
	}
	System.out.println("I am outside loop");
	
	int z=10;
	while (z<=20) {
		System.out.print(z+" ");
		z++;
	}
	
	int i=10;
	while (i>=1) {
		System.out.print(i+" ");
		i--;
	}
}
}
