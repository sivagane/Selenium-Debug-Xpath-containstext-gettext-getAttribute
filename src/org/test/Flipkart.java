package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	WebElement el1 = d.findElement(By.xpath("//span[text()='Electronics']"));
	String t1=el1.getText();
	System.out.println(t1);
	
	WebElement el2 = d.findElement(By.xpath("//span[text()='Men']"));
	String t2=el2.getText();
	System.out.println(t2);
	
	WebElement el3 = d.findElement(By.xpath("//span[text()='Women']"));
	String t3=el3.getText();
	System.out.println(t3);
	
	WebElement el4 = d.findElement(By.xpath("//span[text()='Baby & Kids']"));
	String t4=el4.getText();
	System.out.println(t4);
	
	WebElement el5 = d.findElement(By.xpath("//span[text()='Home & Furniture']"));
	String t5=el5.getText();
	System.out.println(t5);
	
	WebElement el6 = d.findElement(By.xpath("//span[text()='Offer Zone']"));
	String t6=el6.getText();
	System.out.println(t6);
	
	
}
}
