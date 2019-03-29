package com.class11;

public class TaskTwoLoops {
	public static void main(String[] args) {
		String [] countries = {
				"USA",
				"Canada",
				"Iraq",
				"Russia",
				"Kazakhstan"};
		
		
		for (int i=0; i<countries.length; i++)
			
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if (countries[i].equals("Canada")) {
				System.out.println("Ottawa");
			}else if (countries[i].equals("Iraq")) {
				System.out.println("Bagdad");
			}else if (countries[i].equals("Russia")) {
				System.out.println("Moscow");
			}else if (countries[i].equals("Kazakhstan")) {
				System.out.println("Astana");
			}
		
		for (String country: countries) {
			switch (country) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Canada":
				System.out.println("Ottawa");
				break;
			case "Iraq":
				System.out.println("Bagdad");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			case "Kazakhstan":
				System.out.println("Astana");
				break;
		}
						
		}				
		
	}
}
