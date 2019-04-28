package com.class25;

public class Student {// parent class

	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomeWork() {
		System.out.println("Students must do homework");
	}
	void attendClasses(String str, int num) {
		System.out.println("Students must attend classes");
	} // private methods cannot be overridden
	private void doResearch() {
		System.out.println("Students must do research");
	}
}

