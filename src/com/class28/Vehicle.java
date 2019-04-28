package com.class28;

public abstract class Vehicle {

	static int VehicleCount;
	
	Vehicle(){
		VehicleCount++;
	}
	//public static abstract void gps(); - cannot have both static and abstract!
	////public abstract final void break(); - cannot have both final and abstract!
	//private abstract void door(); - cannot have both private and abstract!
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotalVehicles() {
		System.out.println("Total Vehicles we built is "+VehicleCount);
	}
}
abstract class Car extends Vehicle{
	/*by default compiler will create a default constructor and
	 *  call parent class constructor
	 *  
	 *  Car(){
	 *  super(); - added by default
	 */
	public String make;// instance variables allowed in the abstract class
	//we can not create an object of abstract class, but since we have instance variables 
	//inside the class we need someone to initialize it -->done by constructor
	Car (String make){
		this.make=make;
	}
}
class BMW extends Car {
	/*by default compiler will create a default constructor and
	 *  call parent class constructor
	 *  
	 *  BMW(){
	 *  super(); - added by default - calls parent class constructor Car();
	 */
	BMW(String make){
		super(make);
	}
	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
	}
	@Override
	public void start() {
		System.out.println("BMW car starts remotely");
		
	}
}
class Toyota extends Car {
	Toyota(String make){
		super(make);
	}
	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
	}
	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
}
}