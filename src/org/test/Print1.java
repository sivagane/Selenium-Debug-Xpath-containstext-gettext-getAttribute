package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.greenstechnologys.com/");
	
	WebElement t=d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	String a=t.getText();
	System.out.println(a);
			}
}
