package com.learning.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchBrowser1 {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println("The URL of the curent page "+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
