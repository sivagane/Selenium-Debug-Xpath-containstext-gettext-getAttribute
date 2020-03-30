package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGetValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.facebook.com/");
	
	WebElement user=d.findElement(By.id("email"));
	user.sendKeys("sivag918@gmail.com");
	String a=user.getAttribute("value");
	System.out.println(a);
	
	WebElement pass=d.findElement(By.id("pass"));
	pass.sendKeys("080919");
	String b=pass.getAttribute("value");
	System.out.println(b);
}
}
