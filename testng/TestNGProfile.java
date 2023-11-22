package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProfile {
	
	public static WebDriver driver;
	

	
	@BeforeMethod
	
	public void LaunchBrowser() 
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	   public void Login() throws InterruptedException
	   {
		
	  driver.get("https://profile.w3schools.com/");
	  driver.findElement(By.xpath("//span[text()='Log in']")).click();
	  driver.findElement(By.name("email")).sendKeys("dharani.gsd@gmail.com");
	  driver.findElement(By.name("current-password")).sendKeys("Dharaniganesan@994");
		   
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));	  
     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Log in']")));
		  
    driver.findElement(By.xpath("//span[text()='Log in']")).click();
    
    WebElement frame = driver.findElement(By.xpath("//iframe[@id='top-nav-bar-iframe']"));
	driver.switchTo().frame(frame);


    driver.findElement(By.xpath("//a[@id='profile-link']")).click();
    
    
    

    
    driver.findElement(By.xpath("//div[text()='My Public Profile']")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='input-item-cfede2c7-5230-4f52-8233-5273f5ed52b8']")).sendKeys("Dhara94");
    driver.findElement(By.xpath("//span[text()='Save']")).click();
      
    driver.findElement(By.xpath("//textarea")).sendKeys("Testing");
	  
	   }
}
