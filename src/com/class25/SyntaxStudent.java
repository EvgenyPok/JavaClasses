package com.class25;

public class SyntaxStudent extends Student{ //child class
//not possible to change the return type in the overridden methods
	//public boolean study() {
//		System.out.println("Syntax Students must study hard");
//		return true;
//	}
	public void doHomeWork() {
		System.out.println("Syntax Students must do REPL.IT");
	}
	public void attendClasses(int a, String str) {
		System.out.println("Syntax Students must attend ALL classes");
	}// creating "child" specific private method doResearch();
	private void doResearch() {
		System.out.println("Syntax Students must make uncle GOOOGLE as best freind");
	}
}
