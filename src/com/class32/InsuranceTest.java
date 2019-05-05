package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
public static void main(String[] args) {
	Car car=new Car("Best driver insurance","Mersedes");
	Pet pet=new Pet("Care for your Pet","Dog");
	Health health=new Health("Healthy Life");
	
	ArrayList<Insurance> alist=new ArrayList<>();
	alist.add(car);
	alist.add(pet);
	alist.add(health);
	
	Iterator<Insurance> myIt=alist.iterator();
	while (myIt.hasNext()) {
		Insurance obj=myIt.next();
		obj.getQuote();
		obj.cancelInsurance();
	}
}

}
