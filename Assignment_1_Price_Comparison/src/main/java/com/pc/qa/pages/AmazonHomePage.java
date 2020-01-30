package com.pc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pc.qa.base.TestBase;

public class AmazonHomePage extends TestBase
{
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement searchBtn;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone XR (64GB) - Yellow')]")
	WebElement foundItem;
	/*
	@FindBy(xpath="")
	WebElement openItem;*/
	
	@FindBy(xpath="//span[@class='a-price-whole'][1]")
	WebElement itemPrice;
	
	public AmazonHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public String SearchItem() throws InterruptedException
	{
		searchBox.sendKeys(Item);
		searchBtn.click();
		Thread.sleep(5000);
		return foundItem.getText();
	}
	
	public String validateItemPrice()
	{
		return itemPrice.getText();	
	}
	
	
}