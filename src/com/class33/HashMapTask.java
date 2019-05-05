package com.class33;

import java.util.*;

public class HashMapTask {
public static void main(String[] args) {
	Map<Integer, String> building=new HashMap<>();
	building.put(1,"Pointex");
	building.put(2,"Clio");
	building.put(3,"Amway");
	building.put(4,"Trivia");
	building.put(4,"Pointex");
	building.put(5,"Syntax");
	building.put(6,"WorldWideWeb");
	building.put(7,"Business Body");
	
	System.out.println(building.size());
	System.out.println(building);
	
	building.replace(4, "Code.org");
	System.out.println(building);
	
	building.remove(7);
	System.out.println(building.size());
	
}

}
