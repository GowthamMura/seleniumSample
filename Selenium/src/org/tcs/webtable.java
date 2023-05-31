package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

public static void main(String[] args) {
	
System.setProperty("Webdriver.chromedriver","C:\\Users\\Gowtham\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/write-xpath-table.html");
String title = driver.getTitle();
System.out.println(title);

List<WebElement> row = driver.findElements(By.tagName("tr"));
for (int i = 0; i < row.size(); i++) {
	WebElement webElement = row.get(i);
	String text = webElement.getText();
	System.out.println(text);
}



















}















}
