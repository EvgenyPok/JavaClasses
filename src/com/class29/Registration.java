package com.class29;

public class Registration {
	private String email, userName, password;
	public void setEmail(String email) {
		if (email.contains("gmail.com")){
		this.email=email;}
		}
	public String getEmail() {
		return email;
	}
	public void setUseName(String userName) {
		if (!userName.isEmpty() && userName.length()>=6) {
			this.userName=userName;}
	}
	public String getUseName() {
		return userName;
	}
	public void setPassword(String password) {
		if (!password.isEmpty() && password.length()>=6 && password.equals(userName)) {
		this.password=password;}
		}
	public String getPassword(){
		return password;
	}
}
