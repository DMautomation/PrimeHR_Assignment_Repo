package com.ta.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ta.qa.base.TestBase;

public class TripadvisorHomePage extends TestBase
{
	@FindBy(xpath="//span[@class='brand-global-nav-action-search-Search__label--3PRUD']")
	WebElement searchBox;

	@FindBy(id="mainSearch")
	WebElement searchInputBox;
	
	@FindBy(xpath="//div[@class='inner']")
	WebElement searchBtn;
	
	@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement firstSearchOption;
	
	@FindBy(xpath="//a[@class='ui_button primary']")
	WebElement writeReview;
	
	@FindBy(id="bubble_rating")
	WebElement overAllRating;
	
	@FindBy(id="ReviewTitle")
	WebElement reviewTitleInputBox;
	
	@FindBy(id="ReviewText")
	WebElement reviewTextInputBox;
	
	@FindBy(xpath="//div[contains(@class,'c-cell jfy_cloud tag content category-Business')]")
	WebElement typeOftripInputBox;
	
	@FindBy(id="trip_date_month_year")
	WebElement travelMontYearInputBox;
	
	@FindBy(xpath="//div[contains(@class,'questionBlock optionalQuestions')]//div[3]//div[1]//div[3]")
	WebElement shoeShineService;
	
	@FindBy(xpath="//div[@id='PAGE']//div[4]//div[1]//div[3]")
	WebElement cleanHotel;
	
	@FindBy(xpath="//div[5]//div[1]//div[3]")
	WebElement modernHotel;
	
	@FindBy(xpath="//div[6]//div[1]//div[3]")
	WebElement themeRoom;
	
	@FindBy(xpath="//div[7]//div[1]//div[3]")
	WebElement weddingDestinition;
	
	@FindBy(xpath="//div[8]//div[1]//div[3]")
	WebElement safeStay;
	
	@FindBy(xpath="//div[contains(text(),'Hotel Ratings')]")
	WebElement hotelRating;
	
	@FindBy(xpath="//span[@id='qid12_bubbles']")
	WebElement serviceRating;
	
	@FindBy(xpath="//span[@id='qid14_bubbles']")
	WebElement cleaninessRating;
	
	@FindBy(xpath="//span[@id='qid47_bubbles']")
	WebElement locationRating;
	
	@FindBy(xpath="//div[contains(text(),'Mid-range')]")
	WebElement hotelTypeInputBox;
	
	@FindBy(id="ROOM_TIP")
	WebElement tipInputBox;
	
	@FindBy(id="noFraud")
	WebElement certifyCheckbox;
	
	@FindBy(xpath="//span[contains(text(),'Submit your review')]")
	WebElement submitReviewBtn;
	
	public TripadvisorHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateSearch() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		searchBox.click();
		Thread.sleep(3000);
		searchInputBox.sendKeys("Club Mahindra");
		searchBtn.click();
		firstSearchOption.click();
		Set<String> setstr=driver.getWindowHandles();
		Iterator<String> itr= setstr.iterator();
		@SuppressWarnings("unused")
		String tab1=itr.next();
		String tab2=itr.next();
		driver.switchTo().window(tab2);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		writeReview.click();
		Thread.sleep(3000);
		Set<String> setst=driver.getWindowHandles();
		Iterator<String> itr1= setst.iterator();
		@SuppressWarnings("unused")
		String tabb1=itr1.next();
		@SuppressWarnings("unused")
		String tabb2=itr1.next();
		String tabb3=itr1.next();
		driver.switchTo().window(tabb3);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//actions.moveToElement(slider,50,0).perform();
		act.moveToElement(overAllRating,50,0).perform();
		act.click().perform();
		act.release();
		Thread.sleep(2000);
		reviewTitleInputBox.sendKeys("Awesome Experience");	
		reviewTextInputBox.sendKeys("We had a great holiday at Madikeri club Mahindra we walked in and where so lucky to find rooms based on our requirements mr seltin is been so helpful in guiding us with everything at the resort and how we can go ahead and being a proud member of club Mahindra highly recommend all to travel");
		typeOftripInputBox.click();
		Select sel=new Select(travelMontYearInputBox);
		sel.selectByIndex(3);
		shoeShineService.click();
		cleanHotel.click();
		modernHotel.click();
		themeRoom.click();
		weddingDestinition.click();
		safeStay.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", hotelRating);
		Actions act1 = new Actions(driver);
		act1.moveToElement(serviceRating,50,0).perform();
		act1.click().perform();
		Actions act2 = new Actions(driver);
		act2.moveToElement(cleaninessRating,50,0).perform();
		act2.click().perform();
		Actions act3 = new Actions(driver);
		act3.moveToElement(locationRating,50,0).perform();
		act3.click().perform();
		Thread.sleep(2000);
		act3.release();
		hotelTypeInputBox.click();
		tipInputBox.sendKeys("Always check for reviews");
		certifyCheckbox.click();
		submitReviewBtn.click();
		
	}
}
