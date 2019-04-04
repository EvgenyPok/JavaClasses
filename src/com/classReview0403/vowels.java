package com.classReview0403;

public class vowels {
	String str;
	String noVowels() {
		String j="5";
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowels v=new vowels();
		//v.vowelCountWithLoop();
		String str2="hello world my nAme is Evgeny Pokrovskiy";
		System.out.println(v.vowelCountWithReplace(str2));
	}

	void vowelCountWithLoop () {
		String weqas="hello world my name is wEqas";
		char[] w = weqas.toCharArray();
		char empty;
		for (int i =0; i<w.length; i++) {
			if (w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'||w[i]=='I'||w[i]=='y'||w[i]=='Y'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U' ) {
				empty=w[i];
				System.out.print(empty+" ");
			}
		}
	}
	String vowelCountWithReplace(String str1) {
		String onlyVowels=str1.replaceAll("[^aAiIoOuUyYeE]","");
		return onlyVowels;
				
	}
}
