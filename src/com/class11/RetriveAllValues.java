package com.class11;

public class RetriveAllValues {
	public static void main(String[] args) {
		String[][] food= {
				{"burger","fries","hot dog", "meat"},
				{"lo mein", "fried rice"},
				{"biriyani","korma","naan","chik peas"}
		};
		
		for (int i=0; i<food.length; i++) {
			for (int j=0; j<food[i].length;j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
