package org.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRegistration {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	d.manage().window().maximize();
	WebElement fname=d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
	fname.sendKeys("Siva");
	String f=fname.getAttribute("value");
	System.out.println(f);
	
	WebElement lname = d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[2]"));
    lname.sendKeys("Ganesh");
    String l=lname.getAttribute("value");
    System.out.println(l);
   
    WebElement email = d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[3]"));
    email.sendKeys("sivag");
    String e=email.getAttribute("value");
    System.out.println(e);
    
    WebElement pass = d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[4]"));
    pass.sendKeys("0809@#sg");
    String p=pass.getAttribute("value");
    System.out.println(p);
    WebElement cpass = d.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[5]"));
    cpass.sendKeys("0809@#sg");
    String cp=cpass.getAttribute("value");
    System.out.println(cp);
    
    WebElement btn = d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
    btn.click();
    
    List<WebElement> Gmail=d.findElements(By.className("whsOnd zHQkBf"));
   
    for (WebElement greg : Gmail) {
		String t=greg.getText();
		System.out.println(t);
	}
    
}
}
