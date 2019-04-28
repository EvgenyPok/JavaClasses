package com.class25;

public class FinalKeyword {
/* Final keyword can be used in 3 places/ways:
 * 1. final variables - we cannot change their value -- constant
 * 2. final methods - cannot be overridden
 * 3. final classes - cannot be inherited/cannot have sub classes
 */
	
	public static final String name="Syntax";
	
	public static void main(String[] args) {}
		
	public final void hello() {
		System.out.println("Hello from parent class");	
		}	
}
class ChildofFinal extends FinalKeyword{
	/*CANNOT OVERRIDE FINAL METHOD
	public void hello() {
		System.out.println("Hello from child class");
	}*/
}