package com.class31;
//Create an arrayList of words. Remove every word that ends with “e”.
import java.util.ArrayList;
import java.util.Iterator;

public class TaskTwo {
public static void main(String[] args) {
	ArrayList<String> words=new ArrayList<>();
	words.add("abba");
	words.add("joe");
	words.add("Avenue");
	words. add("Syntax");
	words.add("text");
	
	Iterator<String> itt=words.iterator();
	while (itt.hasNext()) {
	System.out.println(itt.next());}
	
	Iterator<String> it=words.iterator();
		while (it.hasNext()) {
		String s=(String) it.next();
		if (s.endsWith("e")) {
			it.remove();
		}
		System.out.println(words.size());
	}
}
}
