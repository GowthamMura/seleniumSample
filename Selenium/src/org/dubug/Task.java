package org.dubug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btncreateAcct = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btncreateAcct.click();
		
		Thread.sleep(4000);
		
		WebElement txtfirstname = driver.findElement(By.name("firstname"));
		txtfirstname.sendKeys("gowtham123");
		Thread.sleep(2000);
		
		WebElement txtlastname = driver.findElement(By.name("lastname"));
		txtlastname.sendKeys("mura");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
