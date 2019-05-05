package com.class31;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water
import java.util.ArrayList;

public class TaskThree {
	public static void main(String[] args) {
		ArrayList<Boolean> drink=new ArrayList<>();
		drink.add(false);
		drink.add(false);
		drink.add(false);
		drink.add(false);
		/*drink.add("tea");
		drink.add("coffe");
		drink.add("milk");
		drink.add("soda");
		*/
		for (int i=0;i<drink.size();i++) {
			//String drink1=drink.get(i);
			//if (drink1.contains("a") || drink1.contains("e")) {
			//	drink.set(i,"water");
			System.out.println(drink.get(i));
			}
			
		}
}
	
