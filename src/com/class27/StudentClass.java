package com.class27;

public class StudentClass {
	String name;
	String phoneNumber;
 StudentClass (String name, String phoneNumber){
	 this.name=name;
	 this.phoneNumber=phoneNumber;
 }
}
class userInfo extends StudentClass {
	String address;
	
	userInfo (String name, String phoneNumber, String address){
	 super(name, phoneNumber);
	 this.address=address;
	
	}
	
	public void getDetails(userInfo obj) {
		System.out.println("Name: "+obj.name);
		System.out.println("Phone #: "+obj.phoneNumber);
		System.out.println("Address: "+obj.address);
	}
}

