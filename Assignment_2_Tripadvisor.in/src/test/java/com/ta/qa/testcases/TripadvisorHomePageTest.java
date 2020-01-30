package com.ta.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ta.qa.base.TestBase;
import com.ta.qa.pages.TripadvisorHomePage;

public class TripadvisorHomePageTest extends TestBase
{
	TripadvisorHomePage trHomePage;
	
	public TripadvisorHomePageTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		trHomePage = new TripadvisorHomePage();
	}
	
	@Test
	public void TripadvisorSearchPageTest() throws InterruptedException
	{
		trHomePage.ValidateSearch();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
