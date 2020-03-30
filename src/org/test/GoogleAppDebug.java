package org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAppDebug {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com/");
	d.get("https://www.gmail.com/");
	d.get("https://maps.google.com/");
	d.get("https://www.youtube.com");
	d.get("https://play.google.com");
	d.get("https://news.google.co.in");
	d.get("https://contacts.google.com");
	d.get("https://translate.google.co.in");
	d.get("https://photos.google.com");
	d.get("https://shopping.google.com");
	d.get("https://duo.google.com");
	
}
}
