package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {


	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactsPage;
	
	String sheetname = "Contacts";
	
	
	public ContactsPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		
		loginpage=  new LoginPage();
		contactsPage = new ContactsPage();
		
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
		homepage.clickOnContacts();
			
	}
	
	
	@Test
	public void verifyContactsPageLabel() {
		
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "Contacts label is missing on the Contacts Page");
		
	}
	
	@Test
	/*public void selectContactsTest() {
		
		contactsPage.selectContactsByName("test2 Selenium");
	}
	*/
	
	/*@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
	}
	*/
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
