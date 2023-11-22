package com.learning.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTitle {

	static WebDriver driver =null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
			Thread.sleep(2000);
			driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.name("search")).sendKeys("History");
			driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
			System.out.println("the title of the section is "+driver.getTitle());
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
