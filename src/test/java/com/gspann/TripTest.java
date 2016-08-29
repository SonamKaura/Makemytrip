package com.gspann;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TripTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void startup() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	public void homepage() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.booking();
		hp.destination();
		//Assert.assertTrue(text1.contains(s),"Text not found!");
		
	}
	
	@Test(priority=2)
	public void home() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		hp.booking();
		hp.destination();
		
	}
}
