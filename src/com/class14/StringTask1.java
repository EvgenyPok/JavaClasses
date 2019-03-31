package com.class14;

public class StringTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task 1
		int a=10, b=20;
		System.out.println("a="+a+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"b="+b);
		
		String str10="Hello";
		String str11="World";
		str10=str10+str11;
		str11=str10.substring(0, str10.length()-str11.length());
		str10=str10.substring(str11.length());
		System.out.println("Str10= "+str10+" Str11= "+str11);
		
		
		//task 2
		int[] array = {10,44,-333,13,435,334,9};
		int largest=array[0];
		for (int i=0; i<array.length;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}int SecondLargest=array[0];
		for (int i=0; i<array.length;i++) {
			if (array[i]==largest) {
				continue;
			}else {
				if (array[i]>SecondLargest) {
					SecondLargest=array[i];
				}
			}
		}
		int minimum=array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]<minimum) {
				minimum=array[i];
			}
		}
		System.out.println("Largest= "+largest);
		System.out.println("Second Largest= "+SecondLargest);
		System.out.println("Minimum= "+minimum);
		
		//task 3
		String str="aS@%$&*tr5!!giss!h";
		String newStr= str.replaceAll("[^A-Z a-z]","");
		System.out.println(newStr.length());
		
		/*task4
		How to find out the part of the string from a string? 
		What is substring? Find number of words in string?
		*/
		String str2="How to find out the part of the string from a string?";
		String[] words = str2.split(" ");
		System.out.println("The str2 has "+words.length+" words");
		
		/*task 5. 
		 * Write a java program to reverse String? 
		 * Reverse a string word by word?
		 */
		String str3="Write a java program to reverse String?";
		String[] words2 = str3.split(" ");
		String reverseWords="";
		for (String w: words2) {
			reverseWords=w+" "+reverseWords;
		}
		System.out.println(reverseWords);
		System.out.println("--------------");
		
		/*6. Write a Java Program to find whether 
		 * a String is palindrome or not?
		 */
		String str4="Race car";
		String revStr4="";
		for (int i=str4.length()-1;i>=0;i--) {
			revStr4+=str4.charAt(i);
		}
		revStr4=revStr4.replaceAll(" ","");
		if (revStr4.equalsIgnoreCase(str4.replaceAll(" ",""))) {
			System.out.println("This is palindrome: "+str4+"-->"+revStr4);
		}else {
			System.out.println("This is not palindrome: "+str4+"-->"+revStr4);
		}
		
		//7. Write a java program to check whether a given number is prime or not?
		int number=3337;
		boolean prime=false;
		if (number==1 || number==2 || number==3) {
			prime=true;
		}else {
		for (int i=2;i<=number/2;i++) {
			if (number%i!=0) {
				prime=true;
			}else {
				prime=false;
				break;
			}
		}
		}
		System.out.println("Number "+number+" is prime: "+prime);
		
		//8. Write a Java Program to print first 10 numbers of Fibonacci series.
		System.out.println("-----");
		int c=0,d=1,e=0;
		for (int i=1;i<=10;i++) {
		System.out.println(c);//0 
		e=c+d;//1/
		c=d;
		d=e;//1/
		}
	}

}
