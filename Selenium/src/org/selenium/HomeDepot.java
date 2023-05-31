package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement txtbox = driver.findElement(By.id("headerSearch"));
		txtbox.sendKeys("cellingfan"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement lnkfan = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
		lnkfan.click();
		String parentwindowId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		List<String> l = new ArrayList();
		l.addAll(allwindowId);
		String childwindowId = l.get(0);
		
		//WebElement clkarrow = driver.findElement(By.id("deliveryZipDropdown-arrow-shape"));
		//clkarrow.click();
		WebElement txtzipcode = driver.findElement(By.id("deliveryZipInput"));
		txtzipcode.sendKeys("62553");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
