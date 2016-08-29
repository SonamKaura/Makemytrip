package com.gspann;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	HomePage(WebDriver d)
	{
		this.driver=d;
	}
	
	private By arrowLoc=By.xpath("//span[@class='arrow_downall']");
	private By domesticHolidayLoc=By.xpath("//span[text()='Domestic Holidays']");
	private By fromdropLoc=By.xpath("//div[@class='row clearfix append_bottom_sm19']/div/span[2]/input");
	private By searchHolidayLoc=By.xpath("//a[@id='submit-btn-holiday']");
	private By exploreLoc=By.xpath("//div[@class='listing_contents']/div[2]/div[1]/div[2]/div[2]/a");
	private By viewDetailsLoc=By.xpath("//div[@class='viewDetail_overlay view_overlay_added']/div[2]/div[1]/div[3]/div/a");
	private By bookOnlineLoc=By.xpath("//div[@class='departure_frm']/p/a");
	private By changeLoc=By.xpath("//div[@id='sidebar_fix']/div[1]/p[2]/a");
	private By categoryLoc=By.xpath("//ul[@id='catList']/li[1]");
	private By doneLoc=By.xpath("//a[@title='Done']");
	private By categoryselectedLoc=By.xpath("//span[@id='category_selected']");
	
	
	public void booking() throws InterruptedException
	{
		System.out.println("Inside Booking");
		WebElement arrow=driver.findElement(arrowLoc);
		arrow.click();
		
		WebElement domesticholiday=driver.findElement(domesticHolidayLoc);
		domesticholiday.click();
		windowSwitch();
		Thread.sleep(3000);
		
		WebElement fromdrop=driver.findElement(fromdropLoc);
		fromdrop.click();
		fromdrop.sendKeys("Bhopal");
		String titleverify=driver.getTitle();
		System.out.println("title is "+titleverify);
		WebElement searchholiday=driver.findElement(searchHolidayLoc);
		searchholiday.click();
		Thread.sleep(3000);
		destination();
		
	}
	
	public void windowSwitch()
	{
	String parent=driver.getWindowHandle();
	Set<String> allwin=driver.getWindowHandles();
	for(String eachwin:allwin)
	{
		if(!eachwin.equals(parent))
				{
			driver.switchTo().window(eachwin);
				}
	
	}
	}
	
	public void destination()
	{
		System.out.println("Insidedestination");
		WebElement explore=driver.findElement(exploreLoc);
		explore.click();
		System.out.println("explore is clicked");
		WebElement viewdetails=driver.findElement(viewDetailsLoc);
		viewdetails.click();
		windowSwitch();
		boolean buttonpresent=driver.findElement(bookOnlineLoc).isDisplayed();
		System.out.println("button is present"+buttonpresent);
		
		WebElement change=driver.findElement(changeLoc);
		change.click();
		WebElement category=driver.findElement(categoryLoc);
		category.click();
		WebElement done=driver.findElement(doneLoc);
		done.click();
		
		WebElement categoryselected=driver.findElement(categoryselectedLoc);
		categoryselected.isDisplayed();
		
		
		
	
		
		/*String destinatonPage=driver.getCurrentUrl();
		String bookonlineText = driver.findElement(bookOnlineLoc).getText();
		return bookonlineText;*/
		
				
	}
}

