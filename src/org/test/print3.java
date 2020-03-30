package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.greenstech.in/selenium-course-content.html");
		WebElement fp=d.findElement(By.xpath("//p[contains(text(),'Greens technology’s selenium training will upgrade your skills in automation testing field and makes you master in selenium architecture')]"));
        String a=fp.getText();
        System.out.println(a);
        
       WebElement sp= d.findElement(By.xpath("//p[contains(text(),'Selenium is a framework, which is easily conveyed for testing web applications.')]"));
	   String b=sp.getText();
	   System.out.println(b);
	}
}