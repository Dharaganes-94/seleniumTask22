package com.learning.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This will get executed before the complete Test suite ");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will get executed before each Test case group");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test method");
	}
    @Test
	public void testcase1()
	{
		System.out.println("Testcase 1");
	}
    
    public void testcase2()
    {
		System.out.println("Testcase 2");

    }
    
    public void testcase3()
    {
		System.out.println("Testcase 3");

    }
    
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("This will get executed after each @Test method");
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will get executed after each Test case group");
	}
	
    
    
    public void aftersuite()
    {
    	System.out.println("This will get executed before the complete Test suite");
    }
}
