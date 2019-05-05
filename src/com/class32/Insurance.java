package com.class32;

public abstract class Insurance {

	public String InsuranceName;
	public boolean active;
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class Car extends Insurance{
	public String carModel;
	public Car(String InsuranceName, String carModel) {
		this.InsuranceName=InsuranceName;
		this.carModel=carModel;
		active=true;
	}
	@Override
	public void getQuote() {
		System.out.println("Need more details to get car insurance quote for your "+carModel);
	}
	@Override
	public void cancelInsurance() {
		this.active=false;
		System.out.println("Your car insurance "+InsuranceName+" cancelled");
	}
}
class Pet extends Insurance{
	public String petType;
	public Pet(String InsuranceName, String petType) {
		this.InsuranceName=InsuranceName;
		this.petType=petType;
		active=true;
	}
	@Override
	public void getQuote() {
		System.out.println("Need more details to get pet insurance quote for your "+petType);
	}
	@Override
	public void cancelInsurance() {
		this.active=false;
		System.out.println("Your Pet insurance "+InsuranceName+"  cancelled");		
	}
}	
class Health extends Insurance{
		public Health(String InsuranceName) {
			this.InsuranceName=InsuranceName;
			active=true;
		}
		@Override
		public void getQuote() {
			System.out.println("Need more details to get your Health insurance quote");
		}
		@Override
		public void cancelInsurance() {
			this.active=false;
			System.out.println("Your Health insurance "+InsuranceName+"  cancelled");		
		}
	
}
