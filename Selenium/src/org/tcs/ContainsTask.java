package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver", "C:\\\\Users\\\\Gowtham\\\\eclipse-workspace\\\\Selenium");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
	     System.out.println(title);
	     
	     String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     
	     //WebElement element = driver.findElement(By.id("username"));
	     //element.sendKeys("gowtham123");
	     //String attribute = element.getAttribute("value");
	     //System.out.println(attribute);
	     
	     WebElement btnlogin = driver.findElement(By.id("overview-tab"));
	     btnlogin.click();
	     Thread.sleep(3000);
	     
	     
	     WebElement textbtn = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies')][1]"));
	     String text = textbtn.getText();
	     System.out.println(text);
		
		
		
		
		
		
		
	}
	
	

}
