package com.class7;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v =10;
		v--;
		System.out.println(v);
		
		int a=10;
		//int b=++a;
		int c=a++;
		//System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
}
