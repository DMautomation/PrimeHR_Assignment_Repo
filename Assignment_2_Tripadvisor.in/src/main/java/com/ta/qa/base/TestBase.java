package com.ta.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ta.qa.util.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public void initialization() 
	{

		System.setProperty("webdriver.gecko.driver","C:/SeleniumRepo/geckodriver-v0.23.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		
	}

}
