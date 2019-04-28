package com.class28;

public class WebDriverTest {
public static void main(String[] args) {
	WebDriver obj=new ChromeDriver();
	obj.closeBrowser();
	obj.findElement();
	obj.maximizeWindow();
	obj.openBrowser();
	System.out.println("------new object----");
	obj=new FirefoxDriver();
	obj.closeBrowser();
	obj.findElement();
	obj.maximizeWindow();
	obj.openBrowser();
	
}
}
