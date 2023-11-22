package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
	
	public static WebDriver driver;

	//@Test(dataProvider="fetchData")
		@Test(dataProvider="readData")

		public void testDataParameterizationThroughDataprovider(String url, String searchText) throws InterruptedException
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(url);
			Thread.sleep(2000);
			
			driver.findElement(By.name("q")).sendKeys(searchText);
			Thread.sleep(2000);
			driver.quit();
			
		}
		
		
		//@DataProvider(name="fetchData")
		@DataProvider
		public Object[][] readData()
		{
			return new Object[][]
					{
				{"https://www.google.com", "TestNG"},
				{"https://www.google.com", "Selenium"},
				{"https://www.google.com","Java"},
				{"https://www.google.com","Auto It"}
				
					};
					
					
		}

	}

    
	

	


