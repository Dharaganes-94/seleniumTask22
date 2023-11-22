package com.learning.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			driver= new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			String actualTitle = driver.getTitle();
			System.out.println("The actual title "+driver.getTitle());
		    String expectedTitle ="STORE";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("page landed on correct website");
				
			}
			
			else
				
				System.out.println("page not landed on correct website");
			}
		
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
