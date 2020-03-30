package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.adactin.com/HotelApp/");
	
	WebElement user=d.findElement(By.id("username"));
	user.sendKeys("sivag918@gmail.com");
	String a=user.getAttribute("value");
	System.out.println(a);
	
	WebElement pass=d.findElement(By.id("password"));
	pass.sendKeys("1990");
	String b=pass.getAttribute("value");
	System.out.println(b);
}
}
