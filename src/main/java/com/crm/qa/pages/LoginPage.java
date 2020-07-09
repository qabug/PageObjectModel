package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase{
	//Page Factory--OR(Object Repository
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement password;
	
	//@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	
	//@FindBy(css=".nav > li:nth-child(1) > a:nth-child(1)")
	@FindBy(linkText = "Log In")
	
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement signInbtn;
	
	
	@FindBy(xpath="//a[contains(text(), 'Sign Up']")
	WebElement signUpBtn;
	
	
	@FindBy(xpath = "//img[@class = 'img-responsive']")
	WebElement brandLogo;
	
	//Initializing the Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateBrandLogo() {
		
		return brandLogo.isDisplayed();
	}
	
	
	public HomePage login(String un, String pwd) {
		
		//loginbtn.click();
		
		email.sendKeys(un);
		
		password.sendKeys(pwd);
		
		signInbtn.click();

		
		return new HomePage();
	}
	
	
	
	

}
