package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		System.setProperty("Webdriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get( "http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		 WebElement btntitle = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	     btntitle.click();
	     
	     WebElement btncts = driver.findElement(By.xpath("//a [text()='CTS Interview Question ']"));
	     btncts.click();
	     
	

	}
}
