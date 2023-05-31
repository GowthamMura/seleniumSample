package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
public static void main(String[] args) {
	System.setProperty("WebDriver","C:\\Users\\Gowtham\\eclipse-workspace\\Selenium" );

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");;
	
	String title = driver.getTitle();
    System.out.println(title);
    
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
   
    
    WebElement txtid = driver.findElement(By.xpath("//input[@id='email']"));
    txtid.sendKeys("gowtham");
    
    WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
    txtpass.sendKeys("123654789");
    		
   WebElement txtlogin= driver.findElement(By.name("login"));
    txtlogin.click();
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
