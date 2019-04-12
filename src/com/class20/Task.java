package com.class20;

import com.class20.Student;

public class Task {
	
	static String emailAddressCreate (String name, String lastName, String emailType) {
		return name.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase();
	}

	public static void main(String[] args) {
		//creating email address using emailAddressCreate() method
		System.out.println(emailAddressCreate("Evgeny","Pokrovskiy","gmail.com"));
		
		//getting the grade using getGrade() method from different class Student
		Student student1=new Student();
		//System.out.println("Your score equals to grade: "+student1.getGrade(55));
		//System.out.println("Your score equals to grade: "+student1.getGrade(91));

		//Task 1 - getting the reversed string using reverseString() method from different class Student
		String reversed= student1.reverseString("I am learning to code in Java");
		System.out.println(reversed);
		
		//Task 2 - checking if the string is Palindrome or not using ifPalindrome() method
		
		String p = "Race car";
		System.out.println("The string "+p+" is palindrome: "+isPalindrome(p));
		
		//Task 3 - returning array of 2 strings after passing the string "Hello, World!"
		Task obj=new Task();
		String[] array =obj.tornWords("Hello World");
		for (String str:array) {
			System.out.println(str);
		}
		
	}
	
	private String[] tornWords(String s) {
		return s.split(" ");
	}
	
	public static boolean isPalindrome(String s) {
		String reverse = "";
		for (int i=s.length()-1;i>=0;i--) {
			reverse+=s.substring(i,i+1).toLowerCase();
		}
		reverse=reverse.replaceAll(" ","");
		if (s.replaceAll(" ","").equalsIgnoreCase(reverse)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
