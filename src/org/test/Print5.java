package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
}
}
