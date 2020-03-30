package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.greenstech.in/selenium-course-content.html");
        WebElement t=d.findElement(By.xpath("//p[contains(text(),'Job opportunities are high in selenium automation testing field')]"));
        String a=t.getText();
        System.out.println(a);
	}
}