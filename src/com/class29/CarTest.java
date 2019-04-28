package com.class29;

public class CarTest {
public static void main(String[] args) {
	Car car1=new Truck();
	Car car2=new Sedan();
	car1.calculateSalePrice(1800);
	System.out.println("Truck with weight 1800lb has price "+car1.carPrice);
	
	car1.calculateSalePrice(2100);
	System.out.println("Truck with weight 2100lb has price "+car1.carPrice);
	
	car2.calculateSalePrice(15);
	System.out.println("Sedan with length 15 has price "+car2.carPrice);
	
	car2.calculateSalePrice(25);
	System.out.println("Sedan with length 25 has price "+car2.carPrice);
	
}
}
