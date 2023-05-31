package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtfrom = driver.findElement(By.id("from_station"));
		txtfrom.sendKeys("theni");
		
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("chennai");
		
		WebElement btnsearch = driver.findElement(By.id("trainFormButton"));
		btnsearch.click();
		
		
		
		
		
		
		
	}

}
