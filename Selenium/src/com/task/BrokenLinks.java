package com.task;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String value ="https://www.amazon.com/";
		//String s = "";
		HttpURLConnection huc = null;
		int respCode = 400;
		driver.get(value);

		//captured the links from the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		//number of links
		//System.out.println(links.size());

		//iterate the links
		for (int i = 0; i < links.size(); i++) {
			//by using href attribute we get URL
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			//System.out.println(url);

			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());


				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if(respCode >= 400){
					System.out.println(url+" is a broken link");
				}
				else{
					System.out.println(url+" is a valid link");
				}

			} catch (MalformedURLException e) {

			 System.out.println("=============");
			} catch (IOException e) {
				System.out.println("---------");
			}
		}












		//			//Thread.sleep(3000);
		//			//URL link = new URL(url);
		//			//create a connection using url object link
		//			//HttpURLConnection connection = (HttpURLConnection) link.openConnection();
		//			huc = (HttpURLConnection)(new URL(url).openConnection());
		//			//establish connection
		//			huc.connect();
		//			//return response code 
		//			//if res code is above
		//			//400 is broken links
		//			int rescode = huc.getResponseCode();
		//			if (rescode>=400) {
		//				System.out.println(url+"is broken link");
		//			} else {
		//				System.out.println(url+"is valid link");
		//
		//			}





	}








}

