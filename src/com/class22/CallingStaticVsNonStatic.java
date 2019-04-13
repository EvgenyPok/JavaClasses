package com.class22;

public class CallingStaticVsNonStatic {

		public static void main(String[] args) {
			
			StaticVsNonStatic obj = new StaticVsNonStatic();
			// accessing non static members: only through the object/instance
			System.out.println(obj.name);
			obj.getInfo();
			// access static members by using class name they belong to
			System.out.println(StaticVsNonStatic.lastName);
			StaticVsNonStatic.getInfo1();
			
		}
	
	
}
