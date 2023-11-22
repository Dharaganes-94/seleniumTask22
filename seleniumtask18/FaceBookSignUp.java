package com.learning.seleniumtask18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.name("firstname")).sendKeys("Test");
        driver.findElement(By.name("lastname")).sendKeys("User");
        driver.findElement(By.name("reg_email__")).sendKeys("Guviassessment94@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Guviassessment94@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Vethanyathiru");
        
        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByValue("11");
        
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("5");
        
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1985");
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
        driver.findElement(By.name("websubmit")).click(); 
        
        Thread.sleep(2000);
        
       System.out.println("The facebookPAGE is loginned sucessfully ");
	}

}