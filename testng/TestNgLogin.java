package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgLogin {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public void LaunchBrowser()
	
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
   @Test(enabled=false)
   
   public void SignUp()
   {
	   driver.get("https://profile.w3schools.com/");
	   driver.findElement(By.xpath("//span[text()=' Sign up']")).click();
	   driver.findElement(By.id("modalusername")).sendKeys("dharani.gsd@gmail.com");
	   driver.findElement(By.name("new-password")).sendKeys("Dharaniganesan@994");
	   driver.findElement(By.xpath("//span[text()='Sign up for free']")).click();
	   driver.findElement(By.id("modal_first_name")).sendKeys("Dharani");
	   driver.findElement(By.id("modal_last_name")).sendKeys("Ganesan");
	   driver.findElement(By.xpath("//span[text()='Continue']")).click();
   }
   
	 
   @Test
   public void Login()
   {
	   driver.get("https://profile.w3schools.com/");
	   driver.findElement(By.xpath("//span[text()='Log in']")).click();
	   driver.findElement(By.name("email")).sendKeys("dharani.gsd@gmail.com");
	   driver.findElement(By.name("current-password")).sendKeys("Dharaniganesan@994");
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Log in']")));
	  
	   driver.findElement(By.xpath("//span[text()='Log in']")).click();
	   
	   WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='My learning']")));
   
   
   
	   String expectedTitle = "My learning | W3Schools";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		System.out.println(driver.getTitle());

		  
		System.out.println("Assertion passed");

 }
   
   @AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(2000);
	//driver.quit();	
	}
}
