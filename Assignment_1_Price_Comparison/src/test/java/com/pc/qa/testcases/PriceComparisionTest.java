package com.pc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pc.qa.base.TestBase;
import com.pc.qa.pages.AmazonHomePage;
import com.pc.qa.pages.FlipkartHomePage;

public class PriceComparisionTest extends TestBase
{

	AmazonHomePage amazonHomePage;
	FlipkartHomePage flipkartHomePage;
	public int priceOnAmazon,priceOnFlipkart;
	
	public PriceComparisionTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		amazonHomePage = new AmazonHomePage();
		flipkartHomePage = new FlipkartHomePage();
	}
	
	
	@Test(priority=1)
	public void AmazonHomePageTest() throws InterruptedException
	{
		driver.get("https://www.amazon.in.");
		String title = amazonHomePage.validatePageTitle();
		System.out.println("Page Title -- "+title);
		String FoundItem=amazonHomePage.SearchItem();
		System.out.println(FoundItem+" is found in Amazon.in");		
		String ItempriceOnAmazon=amazonHomePage.validateItemPrice();
		System.out.println(ItempriceOnAmazon);
		ItempriceOnAmazon=ItempriceOnAmazon.replaceAll("\\D+","");			
		priceOnAmazon=Integer.parseInt(ItempriceOnAmazon);
		System.out.println(Item+" price on Amazon.in is "+priceOnAmazon);
	}
	
	
	@Test(priority=2)
	public void FlipkartHomePageTest() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		String title = flipkartHomePage.validatePageTitle();
		System.out.println("Page Title -- "+title);
		String FoundItem=flipkartHomePage.SearchItem();
		System.out.println(FoundItem+" is found in Amazon.in");		
		String ItempriceOnFlipkart=flipkartHomePage.validateItemPrice();
		System.out.println(ItempriceOnFlipkart);
		ItempriceOnFlipkart=ItempriceOnFlipkart.replaceAll("\\D+","");			
		priceOnFlipkart=Integer.parseInt(ItempriceOnFlipkart);
		System.out.println(Item+" price on Amazon.in is "+priceOnFlipkart);
	}
	
	@Test(priority=3)
	public void priceComparision()
	{
		if(priceOnAmazon<priceOnFlipkart)
		{
			System.out.println("Price of "+Item+" is less in Amazon.in (Rs."+priceOnAmazon+"/-)");
		}
		else if(priceOnAmazon==priceOnFlipkart)
		{
			System.out.println("Price of "+Item+" is same  on both the websites");
		}
		else
		{
			System.out.println("Price of "+Item+" is less in Flipkart.com (Rs."+priceOnFlipkart+"/-)");
		}
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
