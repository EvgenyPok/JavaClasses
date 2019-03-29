package com.class13;

public class NewClassToTestGitHub {

	public static void main(String[] args) {
		// Task 1
		String str=" Java is a programming language";
		for (int i=str.length()-1; i>=0;i--) {
		System.out.print(str.charAt(i));}
		// Task 2
		String str2="what is going on?";
		System.out.println();
		if (!str2.isEmpty()) {
			if (str2.length()%2==1 && str2.length()>=3) {
				System.out.println(str2.charAt(str2.length()/2));
			}else {
				System.out.println("Str2 has even number of chars or has less than 3 chars");
			}
		}else {
			System.out.println("Str2 is empty"+str2.isEmpty());
		} 
	}

}
