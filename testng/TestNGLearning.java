package com.learning.testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGLearning {
	
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
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[text()='Browse tutorials']")).click();
    driver.findElement(By.xpath("//input[contains(@class,'AllTopics_searchInput')]")).sendKeys("Learn java");

    List<WebElement> titleJava = driver.findElements(By.xpath("//div[contains(@class,'TutorialCard_cardTitle')]"));
    
    for(WebElement eachTitle:titleJava) 
    {
    	String learnJava= eachTitle.getText();
    	System.out.println(learnJava);
    }
    
    String learnJava1 = driver.findElement(By.xpath("//div[text()='Java']")).getText();
    System.out.println("The searched text "+learnJava1);
    
    driver.findElement(By.xpath("//div[text()='Java']")).click();
    
    driver.findElement(By.xpath("//button[text()='Continue']")).click();
    
    String expectedTitle = "Java Tutorial";
    Assert.assertEquals(driver.getTitle(), expectedTitle);
    System.out.println(driver.getTitle());
    
	System.out.println("Assertion passed");

}
}

