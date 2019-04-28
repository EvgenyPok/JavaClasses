package com.class29;

public class Truck extends Car{
	@Override
	public int calculateSalePrice(int weight) {
	if (weight>2000) {
		this.carPrice=(int) (super.carPrice*0.9);
	}else {
		this.carPrice=(int) (super.carPrice*0.8);
	}	
	return this.carPrice;
	}
}
