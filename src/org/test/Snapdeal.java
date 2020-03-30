package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Debug,Xpath,containstext,gettext,getAttribute\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	Actions action=new Actions(d);
	WebElement men=d.findElement(By.xpath("(//span[@class='catText'])[6]"));
    action.moveToElement(men).perform();
    WebElement CShoes = d.findElement(By.xpath("(//a[@class='rightMenuLink  noHasTagWidth dp-widget-link'])[20]"));
    CShoes.click();
    WebElement Glider = d.findElement(By.xpath("//img[@title='Gliders By Liberty Lifestyle Blue Casual Shoes']"));
    Glider.click();
    Set<String> allwin = d.getWindowHandles();
    List<String> li= new ArrayList<>();
    li.addAll(allwin);
     String st = li.get(1);
     d.switchTo().window(st);
     WebElement Size = d.findElement(By.xpath("(//div[@class='attr-val'])[4]"));
     Size.click();
     WebElement ACart = d.findElement(By.className("col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink"));
     ACart.click();
}
}
