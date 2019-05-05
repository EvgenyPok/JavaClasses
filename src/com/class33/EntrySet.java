package com.class33;

import java.util.*;

public class EntrySet {
public static void main(String[] args) {
	Map<String, Integer> classroomMap=new LinkedHashMap<>();
	classroomMap.put("Table", 10);
	classroomMap.put("Chair", 30);
	classroomMap.put("Screen", 3);
	classroomMap.put("Student", 60);
	classroomMap.put("Instructor", 3);
	
	System.out.println(classroomMap);
	
	for (Map.Entry me :classroomMap.entrySet()) {
		System.out.println(me.getKey()+"="+me.getValue());
	}
	System.out.println("//////////////");
	
	Iterator<Map.Entry<String,Integer>> it=classroomMap.entrySet().iterator();
	while (it.hasNext()) {
		Map.Entry entry=it.next();
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
			
}

}
