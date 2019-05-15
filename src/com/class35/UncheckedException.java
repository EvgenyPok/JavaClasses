package com.class35;

public class UncheckedException {
public static void main(String[] args) {
	
	int[] array= {2,55,66};
	//System.out.println(array[3]); - ArrayIndexOutOfBoundsException
	
	String s="Hello";
	//System.out.println(s.charAt(5)); StringIndexOutOfBoundsException
	
	String a=null;
	//System.out.println(a.length()); NullPointerException
}
}
