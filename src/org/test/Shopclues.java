package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.shopclues.com/wholesale.html");
	d.manage().window().maximize();
	WebElement search = d.findElement(By.id("autocomplete"));
    search.sendKeys("Fastrack Watch");
    
	Thread.sleep(3000);

    WebElement searchbtn = d.findElement(By.xpath("//a[@class='srch_action btn orange']"));
    searchbtn.click();
    Thread.sleep(3000);
    WebElement watch = d.findElement(By.xpath("(//span[@class='prod_name'])[9]"));
    watch.click();
    
    Set<String> allwid=d.getWindowHandles();
    List<String> li=new ArrayList<String>();
    li.addAll(allwid);
    
    String n=li.get(1);
    d.switchTo().window(n);
    
    Thread.sleep(3000);
    WebElement addbtn = d.findElement(By.id("add_cart"));
    addbtn.click();
    Actions actions= new Actions(d);    
    WebElement cart = d.findElement(By.xpath("//a[@class='cart_ic']"));
    actions.moveToElement(cart).perform();
    
    WebElement vbtn = d.findElement(By.xpath("(//a[@href='https://secure.shopclues.com/atom/acart/getcart'])[2]"));
    vbtn.click();
    
    Thread.sleep(3000);
    WebElement print = d.findElement(By.xpath("//span[text()='Price : ']"));
   String p=print.getText() ;
   System.out.println(p);
}
}
