package orghcl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chromedriver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 
	 WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
	 txtbox.sendKeys("laptop",Keys.ENTER);
	 
	 WebElement txtlink = driver.findElement(By.xpath("//span[contains(text(),'ASUS VivoBook')][1]"));
	 String text = txtlink.getText();
	 System.out.println(text);
	 txtlink.click();
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
