package com.class20;

public class Student {

	char getGrade(int score) {
		if (score>90) {
			return 'A';
		}else if (score<=90 && score >80) {
			return 'B';
		}else if (score<=80 && score >70) {
			return 'C';
		}else if (score<=70 && score >50) {
			return 'D';
		}else {
			return 'F';
		}
		}
	
	String reverseString (String s) {
		String reverse="";
		for (int i=s.length()-1;i>=0;i--) {
			reverse+=s.substring(i,i+1);
		}
		return reverse;
	}
}
