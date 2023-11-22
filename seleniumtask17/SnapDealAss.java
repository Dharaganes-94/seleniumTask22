package com.learning.seleniumtask17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAss {
	
	static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		action.moveToElement(signin).build().perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
        Thread.sleep(2000);
        
        driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Guviassessment94@gmail.com");
		driver.findElement(By.xpath("//button[text()='continue']")).click();
		
		Thread.sleep(2000);
		
		
		/*driver.findElement(By.xpath("//input[@name='j_number']")).sendKeys("9710729257");
		driver.findElement(By.xpath("//input[@id='j_name']")).sendKeys("Vethanya");
		driver.findElement(By.id("j_dob")).sendKeys("2/11/1988");
		driver.findElement(By.id("j_dob")).sendKeys(Keys.ENTER);	
		driver.findElement(By.id("j_password")).sendKeys("Vethanyathiru");
		driver.findElement(By.xpath("//button[@id='userSignup']")).click();
		*/
		Thread.sleep(2000);
		
		WebElement snapDeal=driver.findElement(By.xpath("//span[text()='Vethanya']"));
		System.out.println("The user loginned sucessfully and the account name :"+snapDeal.getText());
		
		
	}
}
