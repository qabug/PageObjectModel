package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	
	
	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[1]")
	WebElement contactLabel;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean verifyContactsLabel() {
		
		return contactLabel.isDisplayed();
		
	}
	
	public void selectContactsByName(String name) {
		
		driver.findElement(By.xpath("//a[(text(),'"+name+"')]//parent::td[@class='full-width']"
				+ "//preceding-sibling::td[@class='full-width']//input[@name='id']")).click();
				
				
		
		
	}
	
	
}
