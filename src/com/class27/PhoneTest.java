package com.class27;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone1=new Iphone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
		
		Phone phone2=new Samsung();
		phone2.makeCall();
		phone2.sendText();
		phone2.unlockPhone();
		phone2.viewPictures();
		
		//Phone ph3=new Phone(); -Cannot instantiate the type Phone because it is abstract
	}
}
