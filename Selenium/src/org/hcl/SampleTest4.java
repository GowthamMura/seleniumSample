package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest4 {
public static void main(String[] args) {
	 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium");
	 
	 WebDriver driver = new ChromeDriver();
	 
	driver.get(" http://www.snapdeal.com/");
	
	String t2 = driver.getTitle();
	System.out.println(t2);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement btnuser = driver.findElement(By.className("accountInner"));
	btnuser.click();
	
	WebElement btnregister = driver.findElement(By.className("newUserRegister"));
    btnregister.click();
    driver.switchTo().frame("iframeLogin");  
    
    WebElement txtmobile = driver.findElement(By.xpath("//input[@id='userName']"));
	txtmobile.sendKeys("8667704263");
	
	WebElement btncontinue = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
	btncontinue.click();
}

	
	
	
}
