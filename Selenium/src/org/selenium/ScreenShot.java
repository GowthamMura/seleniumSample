package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Task\\src\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//type cast - takesscrrenshot  <----------webdriver
		TakesScreenshot t = (TakesScreenshot)driver;
		
		//to capture the screenshot and store in default location
		File source = t.getScreenshotAs(OutputType.FILE);
		
		// to copy the captured screenshot to required to location
		
		File destination = new File("D:\\New folder\\New.jpeg");
		
		//to copy the file from source ----->destination location
		FileUtils.copyFile(source, destination);
		
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("gowtham");

		File source1 = t.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("D:\\New folder\\email.png");
		
		FileUtils.copyFile(source1, destination1);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");
		
		File source2 = t.getScreenshotAs(OutputType.FILE);
				
		File destination2 = new File("D:\\New folder\\pass.png");
		
		FileUtils.copyFile(source2, destination2);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		Thread.sleep(3000);
		File source3 = t.getScreenshotAs(OutputType.FILE);
		
		File destination3 = new File("D:\\New folder\\login.png");
		
		FileUtils.copyFile(source3, destination3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
