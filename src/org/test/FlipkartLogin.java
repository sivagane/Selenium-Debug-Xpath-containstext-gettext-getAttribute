package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	
	WebElement close = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	close.click();
	WebElement loginbtn = d.findElement(By.xpath("(//div[@class='dHGf8H'])[1]"));
    loginbtn.click();
    
    WebElement ph = d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
    ph.sendKeys("9750364952");
    String t1=ph.getAttribute("value");
    System.out.println(t1);
    
    WebElement pass = d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
    pass.sendKeys("08091990");
    String t2=pass.getAttribute("value");
    System.out.println(t2);
    
    WebElement btn = d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
    btn.click();
}
}
