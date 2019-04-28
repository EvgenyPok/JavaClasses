package com.class29;

public class Sedan extends Car{
	@Override
	public int calculateSalePrice(int length) {
	if (length>20) {
		this.carPrice=(int) (super.carPrice*0.95);
	}else {
		this.carPrice=(int) (super.carPrice*0.9);
	}	
	return this.carPrice;
	}
}
