package com.class28;

public class VehiceTest {
public static void main(String[] args) {
	Car car=new BMW("BMW");
	car.drive();
	car.start();
	car.stop();
	
	Vehicle.displayTotalVehicles();
	
	new BMW("BMW");
	new Toyota("Toyota");
	Vehicle.displayTotalVehicles();
	
	
}
}
