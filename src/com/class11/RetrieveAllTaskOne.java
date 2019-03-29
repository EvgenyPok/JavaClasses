package com.class11;

public class RetrieveAllTaskOne {
public static void main(String[] args) {
	String[][] cars= {
			{"ford","GMC","Buick","Saturn"},
			{"BMW","Mersedes Benz", "Audi", "Volkswagen"},
			{"Kia","Daewoo","SangYong"},
			{"Ferrari", "Maserati", "Lancia","Lambogini","Fiat"}
	};

		for (int i = 0; i < cars.length; i++) {
			for (String car : cars[i]) {
				System.out.print(car+" ");
			} System.out.println();
		}

		String [][] countries= {
				{"USA","Canada", "Mexico"},
				{"Colombia","Brasil", "Argentina", "Venezuela", "Equador","Chile"},
				{"Italy","Germany","France", "Russia", "Bulgaria"},
				{"China","Japan","Vietnam","Thailand","Pakistan","Sri Lanka", "Indonesia"},
				{"Egypt","Morocco","Zambia", "Kenya", "Nigeria","Butan", "Mosambique"}
				};
		String continent=null;
		for (int i = 0; i < countries.length; i++) {
			switch (i) {
			case 0:
				continent="North America: ";
				break;
			case 1:
				continent="South America: ";
				break;
			case 2:
				continent="Europe: ";
				break;
			case 3: 
				continent="Asia: ";
				break;
			case 4:
				continent="Africa: ";
				break;
			}
			System.out.print(continent);
			for (String count : countries[i]) {
				
				System.out.print(count+" ");
			} System.out.println();
		}
		
	}
}
