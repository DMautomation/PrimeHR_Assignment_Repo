package com.pc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pc.qa.base.TestBase;

public class FlipkartHomePage extends TestBase
{
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement closeBtn;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
	
	@FindBy(xpath="//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]")
	WebElement searchBtn;
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	WebElement foundItem;
	
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']")
	WebElement itemPrice;
	
	public FlipkartHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		closeBtn.click();
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
