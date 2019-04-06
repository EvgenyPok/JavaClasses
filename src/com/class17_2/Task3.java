package com.class17_2;

public class Task3 {
	void print1to5Triangle() {
		for (int i=1; i<6;i++) {
			for (int y=1; y<=i; y++) {
				System.out.print(y);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 t=new Task3();
		t.print1to5Triangle();
	}

}
