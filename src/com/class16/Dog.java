package com.class16;

public class Dog {
	String breed, color, name;
	int age;
	boolean trained;
	
	void play() {
		System.out.println("The "+breed+"s are very playful");
	}
	void pee() {
		if (trained) {
			System.out.println("The dog "+name+" of "+color+" color is trained to pee outside");
		}else {
			System.out.println("The dog "+name+" of "+color+" color will most likely pee in your shoes");
		}
	}

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.color="pale";
		dog1.name="Wild";
		dog1.age=5;
		dog1.trained=true;
//behavior
		dog1.play();
		dog1.pee();
		
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.color="brown";
		dog2.name="Tayson";
		dog2.age=1;
		dog2.trained=false;
//behavior
		dog2.play();
		dog2.pee();
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.color="white";
		dog3.name="Lord";
		dog3.age=2;
		dog3.trained=true;
//behavior
		dog3.play();
		dog3.pee();
		
	}

}
