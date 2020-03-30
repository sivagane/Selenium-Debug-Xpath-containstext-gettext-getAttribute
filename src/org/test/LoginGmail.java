package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.gmail.com");
	
	WebElement user = d.findElement(By.id("identifierId"));
    user.sendKeys("sivag918@gmail.com");
    
    WebElement btn1 = d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
    btn1.click();
    Thread.sleep(3000);
    WebElement pass = d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
    pass.sendKeys("0809@abc");
    
    WebElement btn2 = d.findElement(By.id("passwordNext"));
    btn2.click();
}
}
