package com.class18;

public class Main {
	static int countString (String str, String toFind)	
	{
		String[] arr= str.split(toFind);
		for (String str2:arr) {
		System.out.println(str2);
		}
		return arr.length-1;
			
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countString("crayfish crazy crushing craniums", "cra")); //3
		
		System.out.println(countString("sometimes solutions dont come on time ", "me")); //4
	}
}
