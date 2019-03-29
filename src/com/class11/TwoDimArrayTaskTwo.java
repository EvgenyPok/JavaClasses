package com.class11;

public class TwoDimArrayTaskTwo {
public static void main(String[] args) {
	String[][] grades = {
			{"Arif","Nasif","Isif", "Satif"},
			{"A","B","C","D"}
	};
			for (int j=0; j<grades[0].length;j++) {
			if ((grades[1][j].equals("A")) || (grades[1][j].equals("B"))) {
			System.out.println("Student "+grades[0][j]+" has grade "+grades[1][j]);
		}
	}
}
}
