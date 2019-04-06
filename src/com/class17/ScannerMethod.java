package com.class17;

import com.class17_2.Calculator;

public class ScannerMethod {
	
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.sum(5,55));
		System.out.println(calc.sub(99,10));
		System.out.println(calc.div(35,5));
		System.out.println(calc.mult(2,9));
	}
	
	void example() {
		System.out.println("No return value and no parameters");
	}
	void example2(String name) {
		System.out.println("No return value but with Parameter");
	}
	boolean example3() {
		System.out.println("With return value but no parameters");
		return true;
	}
	double example4(char name) {
		System.out.println("With return value and with Parameter");
		return name;
	}
}
