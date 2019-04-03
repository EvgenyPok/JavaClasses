package com.class16;

public class phoneClass {
	String brand, model, color;
	int screen, memory;
	public static void main(String[] args) {
		phoneClass phone1 = new phoneClass ();
		phone1.brand="Iphone";
		phone1.model="XSmax";
		phone1.screen=10;
		phone1.memory=512;
		
		phone1.call();
		phone1.text();
		phone1.browse();
		
		phoneClass phone2 = new phoneClass ();
		phone2.brand="Android";
		phone2.model="Huawei 100";
		phone2.screen=8;
		phone2.memory=256;
		
		phone2.call();
		phone2.text();
		phone2.browse();

		phoneClass phone3 = new phoneClass ();
		phone3.brand="Nokia";
		phone3.model="3310";
		phone3.screen=5;
		phone3.memory=16;
		
		phone3.call();
		phone3.text();
		phone3.browse();
	}		
		void call() {
			System.out.println("The phone "+brand+" "+model+" can place calls");
		}
		void text () {
			System.out.println("The phone "+brand+" "+model+" can send text messages");
		}
		void browse () {
			System.out.println("The phone "+brand+" "+model+" can be used to browse Internet");
		}

}
