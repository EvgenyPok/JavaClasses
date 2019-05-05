package com.class34;

import java.util.*;
import java.util.Map.Entry;

public class MapOfCities {

	public static void main(String[] args) {
		String[] city= {"Moscow", "Tallinn", "New Orleans", "Tokyo", "Sochi", "Dublin", "Toronto"};
		
		Map<String, Integer> cities=new TreeMap<>();
		for (String s: city) {
			cities.put(s,s.length());
		}
		System.out.println(cities);
		
		
		
		Iterator<Map.Entry<String, Integer>> it=cities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getValue()>7) {
				it.remove();
			}
		}
		System.out.println(cities);
		
	}
}
