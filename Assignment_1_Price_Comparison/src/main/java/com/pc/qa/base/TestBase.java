package com.pc.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pc.qa.util.TestUtil;

public class TestBase
{
	public static WebDriver driver;
	public String Item ="Apple iPhone XR (64GB) - Yellow";
	public void initialization() 
	{
		System.setProperty("webdriver.gecko.driver","C:/SeleniumRepo/geckodriver-v0.23.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
}
