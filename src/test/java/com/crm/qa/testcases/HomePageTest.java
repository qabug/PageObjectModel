package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		
		loginpage=  new LoginPage();
		
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
			
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		
		String hptitle= homepage.VerifyHomePageTitle();
		System.out.println(hptitle);
		Assert.assertEquals(hptitle, "Cogmento CRM", "Home Page title is not matched");
	}
	
	@Test(priority=2)
	public void verifyContactsLink(){
		
		homepage.clickOnContacts();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
