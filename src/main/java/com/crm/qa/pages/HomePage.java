package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@class='user-display']")
	@CacheLookup//use only when element will not change. dont use it for every element.
	WebElement userLabel;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contactsLink;
	

	WebElement dealsLink;
	
	
	//Initialize the page objects
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String VerifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContacts() {
		
		contactsLink.click();
		
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		
		dealsLink.click();
		
		return new DealsPage();
	}
	
	

}
