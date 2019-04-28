package com.class28;

public class ChromeDriver implements WebDriver {
@Override
	public void findElement() {
		System.out.println("Able to find element in Chrome");
		
	}
@Override
	public void maximizeWindow() {
	System.out.println("Able to maximize window in Chrome");
		
	}
@Override
	public void openBrowser() {
	System.out.println("Able to open Chrome browser");
		
	}
@Override
	public void closeBrowser() {
	System.out.println("Able to close Chrome browser");
		
	}
}
