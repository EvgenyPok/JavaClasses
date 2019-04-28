package com.class28;

public class FirefoxDriver implements WebDriver {
	@Override
	public void findElement() {
		System.out.println("Able to find element in Firefox");
		
	}
@Override
	public void maximizeWindow() {
	System.out.println("Able to maximize window in Firefox");
		
	}
@Override
	public void openBrowser() {
	System.out.println("Able to open FireFox browser");
		
	}
@Override
	public void closeBrowser() {
	System.out.println("Able to close FireFox browser");
		
	}
}
