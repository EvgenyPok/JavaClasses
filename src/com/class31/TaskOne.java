package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskOne {
public static void main(String[] args) {
	ArrayList<String> cars=new ArrayList<>();
	cars.add("Honda");
	cars.add("Toyota");
	cars.add("Mersedes");
	cars.add("Ford");
	System.out.println("----1 way of retreiving values----");
	for (int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i));
	}
	System.out.println("----2 way of retreiving values----");
	for (String st:cars) {
		System.out.println(st);
	}
	System.out.println("----3 way of retreiving values----");
	Iterator it = cars.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("----4 way of retreiving values----");
	int x=0;
	while (cars.size()>x) {
		System.out.println(cars.get(x));
		x++;
	}
}
}
