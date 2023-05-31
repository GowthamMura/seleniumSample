package org.selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		

		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone"+Keys.ENTER);

		WebElement clkIphone = driver.findElement(By.xpath("(//*[starts-with(text(),'Apple iPhone')])[5]"));
		clkIphone.click();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(5000);
		
		WebElement clrPhone = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		clrPhone.clear();
		clrPhone.sendKeys("samsung"+Keys.ENTER);
		
		WebElement searchsamsung = driver.findElement(By.xpath("(//*[starts-with(text(),'Samsung')])[3]"));
		searchsamsung.click();
		
		Set<String> allwindowId1 = driver.getWindowHandles();
		List<String> li = new ArrayList();
		//List allwindowId = (List)driver.getWindowHandles();	
		li.addAll(allwindowId1);
		String childwindowId = li.get(2);
		driver.switchTo().window(childwindowId);
		WebElement btncart= driver.findElement(By.id("add-to-cart-button"));
		btncart.click();
	
	
	
	
	

	
		
		
		
		
	}

}
