package com.learning.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroups1 {

	
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite()
	{
		System.out.println("This will get executed before the complete Test suite");
	}
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest()
	{
		System.out.println("This will get executed before each Test case group");
	}
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test method");
	}
	
	
	
	
	
	@Test (groups= {"smoke"})
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(groups= {"sanity"})
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test (groups= {"sanity", "smoke"})
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod()
	{
		System.out.println("This will get executed after each @Test method");
	}
	
	
	
	
	@AfterTest(alwaysRun=true)
	public void afterTest()
	{
		System.out.println("This will get executed after each Test case group");
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite()
	{
		System.out.println("This will get executed after the complete Test suite");
	}
}
