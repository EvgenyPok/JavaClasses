package com.class24;

public class Testing {

	public static void main(String[] args) {
		String a;
		a="10";
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		Child child=new Child();
		child.love();
		child.cry();
		child.work();
		
		//type casting
		Parent obj=new Child();
		//Child obj1=new Parent(); not possible
		obj.work();
		obj.love();
		//obj.cry(); not accessible
		
	}
}
