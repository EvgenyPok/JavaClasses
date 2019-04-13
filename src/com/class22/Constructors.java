package com.class22;

public class Constructors {

	Constructors(String str, int a){
		for (int i=0;i<a;i++) {
			System.out.println(str);
		}
	}
	Constructors(){
		System.out.println("I am not using parameters");
	}
	public static void main(String[] args) {
		Constructors obj=new Constructors();
	}
}
