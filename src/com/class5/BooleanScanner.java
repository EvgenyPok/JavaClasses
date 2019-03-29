package com.class5;

import java.util.Scanner;

public class BooleanScanner {
 public static void main(String[] args ) {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Input the boolean value");
	 boolean isTrue=in.nextBoolean();
	 System.out.println("The value is "+isTrue);
 }
}
