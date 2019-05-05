package com.class34;

import java.util.*;

public class MapFromArray {
public static void main(String[] args) {
	String[] names= {"Mehmet","Aisha","Amina","Omar","Sylvia", "Danny"};
	Map<Integer,String> nameMap=new LinkedHashMap<>();
	
	int key=1;
	for(String name:names) {
		nameMap.put(key,name);
		key++;
	}
	System.out.println(nameMap);
	
	//How  can  you  remove  all  duplicates  from ArrayList?
	List<String> aList=new ArrayList<String>();
	aList.add("John");
	aList.add("Jane");
	aList.add("James");
	aList.add("Jasmine");
	aList.add("Jane");
	aList.add("James");
	System.out.println(aList);
	
	Set<String> aSet=new LinkedHashSet<>();
	for (String s:aList) {
		aSet.add(s);
	}
	System.out.println(aSet);
}
}
