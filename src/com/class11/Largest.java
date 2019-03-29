package com.class11;

public class Largest {
public static void main(String[] args) {
	int[] numbers= {14,66,4775,5,3677,773};
	int largest=numbers[0];
	int largestIndex=0;
	for (int i=0; i<numbers.length;i++) {
		if (numbers[i]>largest) {	
		largest=numbers[i];
		largestIndex=i;
		}
		 
	}System.out.println(largest);
	int secondLargest=0;
	for (int i=0; i<numbers.length;i++) {
	if (i==largestIndex) {
		continue;
	}else if (numbers[i]>secondLargest) {	
		secondLargest=numbers[i];}
	
	}
	System.out.println(secondLargest);
	
}
}
