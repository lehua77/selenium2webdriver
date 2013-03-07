package com.seleniumsimplified.webdriver;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertTrue;
public class FirstTest
{
	@Test
	public void driverIsKing()
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.deals.ebay.com");
		
		assertTrue( driver.getTitle().startsWith("eBay Daily Deals") );
		
	}
	
	@Test
	public void firefoxIsSupportedByWebdriver()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.deals.ebay.com");
		
		assertTrue( driver.getTitle().startsWith("eBay Daily Deals") );
		
		driver.close();
		
	}
}
