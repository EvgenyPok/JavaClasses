package com.class10;

public class Task2 {
	public static void main(String[] args) {
	
//2.Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		String [] group;
		group=new String [6];
		group[0]="Dinar";
		group[1]="Basar";
		group[2]="Fatih";
		group[3]="Damir";
		group[4]="Evgeny";
		group[5]="Dzianis";
		
		String[] group1= {"Dinar","Basar","Fatih","Damir","Evgeny","Dzianis"}; 
		
		System.out.println(group[4]);
		System.out.println(group1[4]);
		for(int i=0; i<group1.length; i++) {
			System.out.println(group1[i]);
		}
}
}
