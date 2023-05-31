package org.hcl;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		System.setProperty("WebDriver","C:\\Users\\Gowtham\\eclipse-workspace\\Selenium" );
		
		//to lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//to enter URL
		driver.get("https:www.facebook.com/");
		
		//to get title
		String title = driver.getTitle();
	     System.out.println(title);
	     
	     //to get the current url
	     String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     
	     //to maximize
	     driver.manage().window().maximize();
	     
	      WebElement txtUserName = driver.findElement(By.id("email"));
	       txtUserName.sendKeys("Gowtham");
	    
	   WebElement txtPassWord = driver.findElement(By.id("pass"));                 
		txtPassWord.sendKeys("GreenS@1234");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
