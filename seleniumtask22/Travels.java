package com.learning.seleniumtask22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travels {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Travels");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dharani.gsd@gmail.com");
		
		
		 String a =driver.findElement(By.id("numb1")).getText();
		 String b = driver.findElement(By.id("numb2")).getText();
		 int c = Integer.parseInt(a);
		 int d = Integer.parseInt(b);
		 int sum =c+d;
		 System.out.println("The sum of two numbers "+sum);
		 
		 driver.findElement(By.xpath("//input[@id='number']")).sendKeys(String.valueOf(sum));
		 
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@id='demo']")).click();
		 
		String PageText = driver.findElement(By.xpath("//h2[contains(.,'Instant demo request form') ]")).getText();
        
        if(PageText.contains(PageText))
        {
        	System.out.println("The form submitted sucessfully");
        	
        }
        
        else
        {
        	System.out.println("The form not submitted sucessfully");

        }
        
        driver.get("https://tinyurl.com/nwt2n8m7");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File(System.getProperty("user.dir")+"/screenshots/sample1.png");
		FileUtils.copyFile(src, dest);




        }
	}
	
	   


