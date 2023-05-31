package org.insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskInsta {
	public static void main(String[] args)  {
		   System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get( "https://www.instagram.com/accounts/login/?hl=en) login page");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentUrl  = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			WebElement txtuser = driver.findElement(By.xpath("//input[@name='username']"));
			 txtuser.sendKeys("gowtham");
			 
			
			WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
			pass.sendKeys("123456");
					
			
			
			
			
			
			
			
		
		
		
		
		
	}
	
	
	
	

}
