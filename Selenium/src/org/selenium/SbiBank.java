package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement lnkcontinue = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
	lnkcontinue.click();
	
	WebElement lnllogin = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
	lnllogin.click();
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
