package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make calls");
	}
	public void sendText() {
		System.out.println("Phone can send texts");
	}
	public abstract void unlockPhone();
	
	public abstract void viewPictures();
	
//	public abstract void connectToWiFi();
}
class Iphone extends Phone{ // concrete class - is inherited from abstract class
	// or implemented by interface and providing implementation of all unimplemented methods
	@Override
	public void unlockPhone() {
		System.out.println("Iphone is unlocked by pressing Home button");	
	}
	@Override
	public void viewPictures() {
		System.out.println("to view pictures on Iphone go to Images");
	}
}
class Samsung extends Phone{
	@Override
	public void unlockPhone() {
		System.out.println("Samsung unlocked by entering password");
		
	}@Override
	public void viewPictures() {
		System.out.println("to view pictures on Samsung go to Gallery");
	}
}