package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstech.in/selenium-course-content.html");
	d.manage().window().maximize();
	WebElement TP = d.findElement(By.xpath("(//span[@class='testimonial-content'])[1]"));
    String tp = TP.getText();
    System.out.println(tp);
}
}
