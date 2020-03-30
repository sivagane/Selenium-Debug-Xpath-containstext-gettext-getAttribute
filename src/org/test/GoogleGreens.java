package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGreens {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.google.com/");
	WebElement Search=d.findElement(By.name("q"));
	Search.sendKeys("greens velmurugan");
	Search.click();
	WebElement Searchbtn=d.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
	Searchbtn.click();
    WebElement link1=d.findElement(By.xpath("(//h3[@class='LC20lb'])[1]"));
    link1.click();
}
}
