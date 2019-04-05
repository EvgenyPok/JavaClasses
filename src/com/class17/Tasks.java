package com.class17;

public class Tasks {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tasks t1=new Tasks();
		t1.isOddOrEven(56);
		t1.isLarger(34,66);
		String palindrome="Race Car";
		if (t1.isPalindrome(palindrome)) {
			System.out.println(palindrome+" is palindrome");
		}else {
			System.out.println(palindrome+" is not palindrome");
		}
	}
	void isLarger (int a, int b) {
		if (a>b) {
			System.out.println(a+ " is larger");
		}else {
			System.out.println(b+" is larger");
		}
	}
	
	void isOddOrEven (int num) {
		if (num%2==0) {
			System.out.println(num+ " is even");
		}else {
			System.out.println(num+ " is odd");
		}
	}
	boolean isPalindrome (String s) {
		boolean isPal=false;
		String reverse="";
		for (int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		reverse=reverse.replaceAll(" ","");
		if (reverse.equalsIgnoreCase(s.replaceAll(" ",""))) {
			isPal=true;
		}
		return isPal;
	}
}
